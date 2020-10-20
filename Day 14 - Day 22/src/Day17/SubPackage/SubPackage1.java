package Day17.SubPackage;

/**
 * @author HGunjalli
 *
 */
import Day17.PublicAccessSpecifier;

class SubPackage1 {
	public static void main(String args[]) {
		PublicAccessSpecifier obj = new PublicAccessSpecifier();
		obj.msg();

		// This throws compile time error
		// Won't be able to import this as it has default scope and not visible in other
		// packages.
		// DefaultAccessSpecifer obj = new DefaultAccessSpecifier();
	}
}
