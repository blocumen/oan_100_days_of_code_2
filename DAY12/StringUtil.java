import java.security.MessageDigest;

public class StringUtil
{
	//APPLIES SHA256 TO A STRING AND RETURNS THE RESULT. 
	public static String applySha256(String inp)
	{
		try {
				MessageDigest digest = MessageDigest.getInstance("SHA-256");
				//APPLIES SHA256 TO OUR INPUT,
				byte[] hash =  digest.digest(inp.getBytes("UTF-8"));
				
				// THIS WILL CONTAIN HASH AS HEXIDECIMAL
				StringBuffer hexString = new StringBuffer(); 
				for (int i = 0; i < hash.length; i++) 
				{
					String hex = Integer.toHexString(0xff & hash[i]);
					if(hex.length() == 1) hexString.append('0');
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