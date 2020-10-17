import java.util.*;
import com.google.gson.*;

public class AdiCoin {

	public static ArrayList<Block> AdiCoinChain = new ArrayList<Block>();
	public static int difficulty = 5;

	public static Boolean isChainValid() {
		Block currentBlock; 
		Block previousBlock;
		
		//LOOP THROUGH BLOCKCHAIN TO CHECK HASHES:
		//System.out.println("SIZE OF CHAIN :" + AdiCoinChain.size());
		for(int i=1; i < AdiCoinChain.size(); i++) 
		{
			currentBlock = AdiCoinChain.get(i);
			previousBlock = AdiCoinChain.get(i-1);
			//compare registered hash and calculated hash:
			if(!currentBlock.hash.equals(currentBlock.calculateHash()) ){
				System.out.println("Current Hashes not equal");			
				return false;
			}
			//compare previous hash and registered previous hash
			if(!previousBlock.hash.equals(currentBlock.prevHash) ) {
				System.out.println("Previous Hashes not equal");
				return false;
			}
		}
		System.out.println(" CURRENT CHAIN IS VALID");
		return true;
	}
	
	public static void main(String[] args) {
	
	
	// GENISIS BLOCK
	Block genisisBlock 	= new Block("0","Trasnfer From ADI1 to ADI2");
	//System.out.println(" GENISIS BLOCK HAS PREVIOUS HASH = 0");
	//System.out.println(" DATA = TXFR From ADI1 to ADI2");
	System.out.println(" THE HASH OF GENESIS BLOCK = "+ genisisBlock.hash);
	genisisBlock.mineBlock(difficulty);
	
	//System.out.println(" ----------------------------------");
	// BLOCK 2
	Block block2		= new Block(genisisBlock.hash, "TXFR FROM ADI3 TO ADI4");
	//System.out.println(" BLOCK2 HAS PREVIOUS HASH = " + genisisBlock.hash);
	//System.out.println(" DATA = TXFR FROM ADI3 TO ADI4");
	System.out.println(" THE HASH OF BLOCK2 = "+ block2.hash);
	genisisBlock.mineBlock(difficulty);
	//System.out.println(" ----------------------------------");
	// BLOCK 3
	Block block3		= new Block(block2.hash, "TXFR FROM ADI5 TO ADI6");
	//System.out.println(" BLOCK2 HAS PREVIOUS HASH = " + block2.hash);
	//System.out.println(" DATA = TXFR FROM AD5 TO ADI6");
	System.out.println(" THE HASH OF BLOCK3 = "+ block3.hash);
	genisisBlock.mineBlock(difficulty);
	//System.out.println(" ----------------------------------");

	Block block4 = new Block(block3.hash,"BLOCK 4 : TXFR FROM ADI7 TO ADI8");
	AdiCoinChain.add(block4);
	System.out.println(" THE HASH OF BLOCK4 = "+ block4.hash);
	genisisBlock.mineBlock(difficulty);
	
	//block4 hash = AdiCoinChain.get(AdiCoinChain.size()-1).hash
	Block block5 = new Block(block4.hash,"BLOCK 5 : TXFR FROM ADI9 TO ADI10");
	AdiCoinChain.add(block5);
	System.out.println(" THE HASH OF BLOCK5 = "+ block5.hash);
	genisisBlock.mineBlock(difficulty);
	
	Block block6 = new Block(block5.hash,"BLOCK 6 : TXFR FROM ADI11 TO ADI12");
	AdiCoinChain.add(block6);
	System.out.println(" THE HASH OF BLOCK6 = "+ block6.hash);
	genisisBlock.mineBlock(difficulty);
	isChainValid();
	//String AdiCoinchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(AdiCoinChain);		
	//System.out.println(AdiCoinchainJson);

	
	}
}
