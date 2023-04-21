package ilu2;

public class Welcome {
	
	public static String welcome(String input) {
		StringBuilder welcomeMsg = new StringBuilder();
		welcomeMsg.append("Hello, ");
		welcomeMsg.append(input.substring(0,1).toUpperCase() + input.substring(1, input.length()));
		return welcomeMsg.toString();
	}

}
