import clojure.lang.RT;
import clojure.lang.Var;

public class Keyhole {

	/**
	 * Returns a Var object which allows the user to invoke a Clojure repl.
	 * 
	 * @return A Var object on which to call invoke.
	 * @throws Exception
	 */
	public static Var getKeyhole() throws Exception {
		RT.loadResourceScript("keyhole.clj");
		Var run = RT.var("keyhole", "run");
		
		return run;
	}
}
