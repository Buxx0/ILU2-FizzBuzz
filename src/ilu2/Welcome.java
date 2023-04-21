package ilu2;

public class Welcome {
	
	public static String welcome(String input) {
		StringBuilder welcomeMsg = new StringBuilder();
		welcomeMsg.append("Hello, ");
		if (input == null || input.trim().isEmpty()) {
			welcomeMsg.append("my friend");
		}
		else {
			welcomeMsg.append(input.substring(0,1).toUpperCase() + 
							input.substring(1, input.length()));
		}
		return welcomeMsg.toString();
	}

}
