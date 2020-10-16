package com.bcind.day12;

import com.google.gson.GsonBuilder;

import java.util.ArrayList;

public class NoobChain {
    public static ArrayList<Block> blockchain = new ArrayList<>();
    public static int difficulty = 5;

    public static void main(String[] args) {
//        Block genesis_block = new Block(
//                "Hi i am the first block", "0");
//        System.out.println("Hash for block 1 : " + genesis_block.hash);
//
//        Block second_block = new Block(
//                "Yo i am the second block", genesis_block.hash);
//        System.out.println("Hash for block 2 : " + second_block.hash);
//
//        Block third_block = new Block(
//                "Hey i am the third block", second_block.hash);
//        System.out.println("Hash for block 3 : " + third_block.hash);

        blockchain.add(new Block(
                "Hi i am the first block", "0"));
        blockchain.add(new Block(
                "Yo i am the second block",
                blockchain.get(blockchain.size() - 1).hash));
        blockchain.add(new Block(
                "Hey i am the third block",
                blockchain.get(blockchain.size() - 1).hash));

        String blockchain_json =
                new GsonBuilder().setPrettyPrinting().create().toJson(
                        blockchain);
        System.out.println(blockchain_json);
    }

    public static Boolean isChainValid() {
        Block current_block;
        Block previous_block;

        String hash_target =
                new String(new char[difficulty]).replace(
                        '\0', '0');

        for (int i = 1; i < blockchain.size(); i++) {
            current_block = blockchain.get(i);
            previous_block = blockchain.get(i - 1);

            if (!current_block.hash.equals(
                    current_block.calculateHash())) {
                System.out.println("Current Hashes not equal");
                return false;
            }
            if (!previous_block.hash.equals(
                    current_block.previous_hash)) {
                System.out.println("Previous Hashes not equal");
                return false;
            }

            if (!current_block.hash.substring(0, difficulty).equals(hash_target)) {
                System.out.println("This block hasn't been mined");
                return false;
            }
        }
        return true;
    }
}