import java.util.Date;

public class Block 
{

	public 	String 	hash;
	public 	String 	prevHash;
	public 	String 	data;
	private long 	timeStamp;
	private int		nonce;
	
	public String 	msgToSha256;
	
	
	//BLOCK CONSTRUCTOR
	public Block(String prevHash, String data)
	{
		this.prevHash 	= prevHash;
		this.data 		= data;
		this.timeStamp	= new Date().getTime();
		
		// GENERATING THE HASH FOR CURRENT BLOCK
		this.hash 		= calculateHash();
	}
	
	public String calculateHash()
	{
		msgToSha256 = prevHash + Long.toString(timeStamp) + data + Integer.toString(nonce);
		String calculatedhash = StringUtil.applySha256(msgToSha256);
		return calculatedhash;
		
	}
	
	public void mineBlock(int difficulty)
	{
		//CREATE A STRING WITH DIFFICULTY * "0" 
		String target = new String(new char[difficulty]).replace('\0', '0');
		
		while(!hash.substring( 0, difficulty).equals(target))
		{
				nonce ++;
				hash = calculateHash();
		}
		System.out.println("AFTER ADDING NONCE / MINED BLOCK / POW : " + hash);
		System.out.println("\n");
	}
}
