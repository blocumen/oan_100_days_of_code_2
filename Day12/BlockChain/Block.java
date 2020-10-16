package BlockChain;
import java.util.Date;

public class Block {
    public String hash;
    public String previousHash;
    private String data;
    private long timeStamp;
    private int nonce;

    public Block(String data, String previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = (new Date()).getTime();
        this.hash = this.calculateHash();
    }

    public String calculateHash() {
        String calculatedhash = StringUtil.applySha256(this.previousHash + Long.toString(this.timeStamp) + Integer.toString(this.nonce) + this.data);
        return calculatedhash;
    }

    public void mineBlock(int difficulty) {
        for(String target = StringUtil.getDificultyString(difficulty); !this.hash.substring(0, difficulty).equals(target); this.hash = this.calculateHash()) {
            ++this.nonce;
        }

        System.out.println("Block Mined!!! : " + this.hash);
    }
}
