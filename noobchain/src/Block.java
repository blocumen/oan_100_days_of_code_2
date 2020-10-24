import java.util.Date;

public class Block {
	public String hash;
	public String previousHash;
	private String data;
	private long timeStamp;
	private int nonce;
	
	public Block (String data, String previousHash) {
		this.data = data;
		this.previousHash = previousHash;
		this.timeStamp = new Date().getTime();
		this.hash = CalculateHash();
	}
	
	public String CalculateHash() {
		String calculatedHash = StringUtil.applySha256(
					previousHash + Long.toString(timeStamp) + data
				);
		return calculatedHash;
	}
	
	public void mineBlock(int difficulty) {
		String target = new String(new char[difficulty]).replace('\0', '0'); //Create a string with difficulty * "0"
		while(!hash.substring( 0, difficulty).equals(target)) {
			nonce ++;
			hash = CalculateHash();
		}
		System.out.println("Block Mined!!! : " + hash);
	}
}
