import java.util.Date;

public class Block {

    public String hash;
    public String data;
    public String prevhash;
    public int nonce;
    public long timestamp;

    public Block(String _data, String _prevhash){
        this.data = _data;
        this.prevhash = _prevhash;
        this.timestamp = new Date().getTime();
        this.hash = calculateHash();
    }

    public String calculateHash() {
        String calculatedhash = StringUtil.applySha256(prevhash+Long.toString(timestamp) + Integer.toString(nonce) + data );
        return calculatedhash ;
    }
     public void mineBlock(int difficulty) {
        String target = StringUtil.getDifficultyString(difficulty);
        while (!hash.substring(0,difficulty).equals(target)){
            nonce++;
            hash= calculateHash();
        }
        System.out.println("\n Block Mined !! : "+ hash);
     }

}
