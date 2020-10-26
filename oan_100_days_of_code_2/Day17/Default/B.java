import pack.*;
public class B {
    public static void main(String ... a){
        A obj =new A(); //pack.A' is not public in 'pack'. Cannot be accessed from outside package
    	obj.msg(); //'msg()' is not public in 'pack.A'. Cannot be accessed from outside package
	}
}
