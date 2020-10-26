import java.util.Date;

public class Block {
	
	public String hash;  // This will hold our digital signature
	public String previousHash;  // hold previous block's hash
	private String data; // to hold the block data
	private long timeStamp; //as number of millisecs since 1/1/1970
	private int nounce;
	
	//Block Constructor
	public Block(String data, String previousHash)
	{
		this.data=data;
		this.previousHash=previousHash;
		this.timeStamp=new Date().getTime();
		this.hash=calculateHash();// making sure we do this afer we set the other values
				
	}
	
	public String calculateHash()
	{
		String calculatedhash=StringUtil.applySha256(
				previousHash + Long.toString(timeStamp) + Integer.toString(nounce)+data);
		return calculatedhash;
	}
	
	// adding the mining function
	
	public void mineBlock(int difficulty)
	{
		
		String target=new String(new char[difficulty]).replace('\0','0');  // create a String with difficulty * "0"
		while(!hash.substring(0,difficulty).equals(target))
		{
			nounce++;
			hash=calculateHash();
		}
		System.out.println("Block mined !!!"+hash);
		
		
	}

}
