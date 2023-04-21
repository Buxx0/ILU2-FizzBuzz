package ilu2;

public class Welcome {

	public static String welcome(String input) {
		StringBuilder welcomeMsg = new StringBuilder();
		if (input == null || input.trim().isEmpty()) {
			return "Hello, my friend";
		}
		if (input.equals(input.toUpperCase())) {
			welcomeMsg.append("HELLO, ");
			welcomeMsg.append(input);
			welcomeMsg.append(" !");
			return welcomeMsg.toString();
		}
		welcomeMsg.append("Hello, ");
		String inputCapitalise = input.substring(0,1).toUpperCase()
				+ input.substring(1);
		welcomeMsg.append(inputCapitalise);
		return welcomeMsg.toString();
	}

}
