public class SubClass extends SuperClass 
{
	public SubClass()
	{
		System.out.println("THIS IS SUBCLASS CONSTRUCTER");
	}

	public static void main(String[] args)
	{
		SuperClass 	sup = new SuperClass();
		SubClass	sub = new SubClass();
		
		sup.superString = "THE IS VALUE OF superString VARIABLE";
		
		//System.out.println(sup);
		//System.out.println(sub);
		System.out.println(sup.superString);
		
		
	}
}