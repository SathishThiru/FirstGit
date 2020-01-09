

public class Main {
 static void main(String[] args) {
boolean feelMe = false;
boolean seeMe = false;
int index;
loop: for (index = 0; index < args.length; index++) {
String opt = args[index];
switch (opt) {
case "-c":
System.out.println("hi");
break;
case "-f":
	feelMe = true;
	break;
	default:
	if (!opt.isEmpty() && opt.charAt(0) == '-') {
	error("Unknown option: '" + opt + "'");
	}
	break loop;
	}
	}
	if (index >= args.length) {
		System.out.println(index);
	error("Missing argument(s)");
	}
	// Run the application
	// ...
	}
	private static void error(String message) {
	if (message != null) {
	System.err.println(message);
	}
	System.err.println("usage: myapp [-f] [-c] [ <arg> ...]");
	System.exit(1);
	}
	}