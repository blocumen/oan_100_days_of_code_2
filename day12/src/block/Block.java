package block;

import block.StringUtil;

import java.util.Date;

public class Block {
    public String hash;
    public String previousHash;
    private String data;
    private long timeStamp;
    private int nonce;

    public Block(String data,String previousHash ) {

        //THE DATA STRUCTURE, BACKBONE BLOCKCHAIN
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.hash = calculateHash();

    }

    public String calculateHash() {
        // ENCRYPTION TAKEN FROM OUR UTILITY CLASS
        String calculatedhash = StringUtil.applySha256(
                previousHash +
                        Long.toString(timeStamp) +
                        data
        );
        return calculatedhash;
    }

    public void mineBlock(int difficulty) {
        String target = new String(new char[difficulty]).replace('\0', '0'); //difficulty
        while(!hash.substring( 0, difficulty).equals(target)) {
            nonce ++;
            hash = calculateHash();
            System.out.println("Potential Hash : " + hash);
        }
        System.out.println("Block Mined : " + hash);
    }
}
