import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;

public class NoobChain {
    public static ArrayList<Block> blockchain = new ArrayList<Block>();

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
                blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block(
                "Hey i am the third block",
                blockchain.get(blockchain.size()-1).hash));

        String blockchain_json =
                new GsonBuilder().setPrettyPrinting().create().toJson(
                        blockchain);
        System.out.println(blockchain_json);
    }
}
