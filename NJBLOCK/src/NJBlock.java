import com.google.gson.GsonBuilder;
import java.security.MessageDigest;
import java.util.Date;
import java.util.ArrayList;


public class NJBlock
{

    public String hash;
    public String prev; // previous hash
    private String msg; //our data will be a simple message.
    private long ts; //as number of milliseconds since 1/1/1970, stores the timestamp
    private int nonce;

    //Block Constructor.
    public NJBlock(String msg, String prev)
    {
        this.msg = msg;
        this.prev = prev;
        this.ts = new Date().getTime();
        this.hash = calcHash();
    }


    public String calcHash()
    {
        String calchash = mystring.applySha256(prev+ Long.toString(ts)  + Integer.toString(nonce) + msg);
        return calchash;
    }


    public void mineBlock(int random)
    {
        String target = new String(new char[random]).replace('\0', '0'); //Create a string with difficulty * "0"
        while(!hash.substring( 0, random).equals(target))
        {
            nonce ++;
            hash = calcHash();
        }
        System.out.println("Block Mined!!! : " + hash);
    }

    public static class mystring
    {
        //Applies Sha256 to a string and returns the result.
        public static String applySha256(String input)
        {
            try {
                MessageDigest digest = MessageDigest.getInstance("SHA-256");
                //Applies sha256 to our input,
                byte[] hash = digest.digest(input.getBytes("UTF-8"));
                StringBuffer hexString = new StringBuffer(); // This will contain hash as hexidecimal
                for (int i = 0; i < hash.length; i++) {
                    String hex = Integer.toHexString(0xff & hash[i]);
                    if (hex.length() == 1) hexString.append('0');
                    hexString.append(hex);
                }
                return hexString.toString();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        public static ArrayList<NJBlock> mychain = new ArrayList<NJBlock>();
        public static int random = 6;

        public static void main(String[] args)
        {



            NJBlock genesisBlock = new NJBlock("Test Chain : Nicky is in block 1", "0");
            mychain.add(new NJBlock("Test: Nicky is in 1st block", "0"));
            System.out.println("Hash for block 1 : " + genesisBlock.hash);
            System.out.println("Trying to Mine block 1... ");
            mychain.get(0).mineBlock(random);

            NJBlock secondBlock = new NJBlock("Nicky is in the second block", genesisBlock.hash);
            mychain.add(new NJBlock("Nicky is in the second block", mychain.get(mychain.size() - 1).hash));
            System.out.println("Hash for block 2 : " + secondBlock.hash);
            System.out.println("Trying to Mine block 2... ");
            mychain.get(1).mineBlock(random);

            NJBlock thirdBlock = new NJBlock("Nicky is in the third block", secondBlock.hash);
            mychain.add(new NJBlock("Nicky is in the third block", mychain.get(mychain.size() - 1).hash));
            System.out.println("Hash for block 3 : " + thirdBlock.hash);
            System.out.println("Trying to Mine block 3... ");
            mychain.get(2).mineBlock(random);

            String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(mychain);
            System.out.println(blockchainJson);

        }

        public static Boolean isChainValid()
        {
            NJBlock curr;
            NJBlock prevb;
            String hashTarget = new String(new char[random]).replace('\0', '0');

            //loop through blockchain to check hashes:
            for (int i = 1; i < mychain.size(); i++)
            {
                curr = mychain.get(i);
                prevb = mychain.get(i - 1);
                //compare registered hash and calculated hash:
                if (!curr.hash.equals(curr.calcHash()))
                {
                    System.out.println("Current Hashes not equal");
                    return false;
                }
                //compare previous hash and registered previous hash
                if (!prevb.hash.equals(curr.prev))
                {
                    System.out.println("Previous Hashes not equal");
                    return false;
                }

                //check if hash is solved
                if(!curr.hash.substring( 0, random).equals(hashTarget))
                {
                    System.out.println("This block hasn't been mined");
                    return false;
                }
            }
            return true;
        }
    }


    }
