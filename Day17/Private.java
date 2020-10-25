package Day17;

public class Private {
	private int a;
	
	public int privatemethod(int b) {
		a=b;
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Private obj= new Private();
		int c= obj.privatemethod(4);
		System.out.println(c);

	}

}
