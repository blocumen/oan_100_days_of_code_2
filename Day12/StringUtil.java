import java.security.MessageDigest;


public class StringUtil {
	
	// applies SHA256 to a string and returns the result.
	
	public static String applySha256(String input)
	{
		try {
				MessageDigest digest=MessageDigest.getInstance("SHA-256");
				// applies SHA256 to out input
				byte[] hash=digest.digest(input.getBytes("UTF-8"));
				StringBuffer hexString=new StringBuffer(); // this will contain hash as hexidecimal
				for(int i=0;i<hash.length;i++)
				{
					String hex=Integer.toHexString(0xff & hash[i]);
					if(hex.length()==1) hexString.append('0');
					hexString.append(hex);
					
				}
				return hexString.toString();
				
			}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}
	
	

}
