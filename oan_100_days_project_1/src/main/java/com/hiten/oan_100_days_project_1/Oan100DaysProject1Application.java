package com.hiten.oan_100_days_project_1;

import com.hiten.oan_100_days_project_1.models.Block;
import com.hiten.oan_100_days_project_1.utils.BlockUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class Oan100DaysProject1Application {

	public static ArrayList<Block> blockchain = new ArrayList<>();
	public static int difficulty = 5;

	public static void main(String[] args) {
		SpringApplication.run(Oan100DaysProject1Application.class, args);
		//add our blocks to the blockchain ArrayList:

		System.out.println("Trying to Mine block 1... ");
		addBlock(new Block("Hi im the first block", "0"));

		System.out.println("Trying to Mine block 2... ");
		addBlock(new Block("Yo im the second block",blockchain.get(blockchain.size()-1).hash));

		System.out.println("Trying to Mine block 3... ");
		addBlock(new Block("Hey im the third block",blockchain.get(blockchain.size()-1).hash));

		System.out.println("\nBlockchain is Valid: " + isChainValid());

		String blockchainJson = BlockUtils.getJson(blockchain);
		System.out.println("\nThe block chain: ");
		System.out.println(blockchainJson);
	}

	public static Boolean isChainValid() {
		Block currentBlock;
		Block previousBlock;
		String hashTarget = new String(new char[difficulty]).replace('\0', '0');

		//loop through blockchain to check hashes:
		for(int i=1; i < blockchain.size(); i++) {
			currentBlock = blockchain.get(i);
			previousBlock = blockchain.get(i-1);
			//compare registered hash and calculated hash:
			if(!currentBlock.hash.equals(currentBlock.calculateHash()) ){
				System.out.println("Current Hashes not equal");
				return false;
			}
			//compare previous hash and registered previous hash
			if(!previousBlock.hash.equals(currentBlock.previousHash) ) {
				System.out.println("Previous Hashes not equal");
				return false;
			}
			//check if hash is solved
			if(!currentBlock.hash.substring( 0, difficulty).equals(hashTarget)) {
				System.out.println("This block hasn't been mined");
				return false;
			}

		}
		return true;
	}

	public static void addBlock(Block newBlock) {
		newBlock.mineBlock(difficulty);
		blockchain.add(newBlock);
	}
}
