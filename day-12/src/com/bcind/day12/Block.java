package com.bcind.day12;

import java.util.Date;

public class Block {
    private final Long timestamp;
    public String hash;
    public String previous_hash;
    public String data;
    private int nonce;

    public Block(String data, String previous_hash) {
        this.data = data;
        this.previous_hash = previous_hash;
        this.timestamp = new Date().getTime();
        this.hash = calculateHash();
    }


    public String calculateHash() {
        return StringUtil.applySha256(
                previous_hash + timestamp + nonce + data
        );
    }

    public void mineBlock(int difficulty) {
        String target = new String(new char[difficulty]).replace('\0'
                , '0');
        while (!hash.substring(0, difficulty).equals(target)) {
            nonce++;
            hash = calculateHash();
        }
        System.out.println("Block Mined!!!" + hash);
    }
}
