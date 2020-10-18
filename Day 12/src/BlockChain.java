import java.util.ArrayList;

public class BlockChain {

    public static ArrayList<Block> blockchain = new ArrayList<>();
    public static int difficulty = 6;

    public static void main (String[] args) {
       // adding the blocks to the blockchain arraylist

        System.out.println(" \nTrying to Mine Block 1 ...");
        addBlock(new Block( "This is the data of first ","0"));

        System.out.println(" \nTrying to Mine Block 2 ...");
        addBlock(new Block( "This is the data of Second block ",blockchain.get(blockchain.size()-1).hash));

        System.out.println(" \n Trying to Mine Block 3 ...");
        addBlock(new Block( "This is the data of Third block ",blockchain.get(blockchain.size()-1).hash));

        System.out.println("\n The blockchain is valis "+ isChainValid());

        String blockchainJson = StringUtil.getJson(blockchain);
        System.out.println("\n The blockchain ");
        System.out.println(blockchainJson);


    }

    public static Boolean isChainValid (){
        Block currentBlock;
        Block previousBlock;
        String hashTarget = new String(new char[difficulty]).replace('\0','0') ;

        for (int i=1;i< blockchain.size(); i++ ){
            currentBlock = blockchain.get(i);
            previousBlock = blockchain.get(i-1);
            if (!currentBlock.prevhash.equals(previousBlock.hash))
                return false;
        }
        return true;
    }
    public static void addBlock(Block newBlock) {
        newBlock.mineBlock(difficulty);
        blockchain.add(newBlock);
    }


}
