import java.awt.Point;

public class Example {

	/**
	 * Example of how to use Keyhole.
	 * 
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		Point pt0 = new Point(1, 2);
		Point pt1 = new Point(3, 4);
		Point pt2 = new Point(5, 6);
		Point pt3 = new Point(7, 8);
	
		//Note how args are passed in - it follows the pattern <arg name> <arg>
		//So in the Clojure repl, pt0 will refer to the pt0 Point initialized above
		//If we changed the first arg "pt0" to "foo", then calling foo in the repl would produce pt0	
		Keyhole.getKeyhole().invoke("pt0", pt0, "pt1", pt1, "pt2", pt2, "pt3", pt3);
	}

}
