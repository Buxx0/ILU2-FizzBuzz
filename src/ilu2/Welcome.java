package ilu2;

public class Welcome {
	
	private static String capitaliseFirstLetter(String input) {
		return input.substring(0,1).toUpperCase()
				+ input.substring(1);
	}
	
	private static String multipleNameCapitalise(String input) {
		StringBuilder fixedString = new StringBuilder();
		String[] splitInput = input.split(",");
		for (int i = 0; i < splitInput.length-1; i++) {
			fixedString.append(capitaliseFirstLetter(splitInput[i]) + ", ");
		}
		fixedString.append(capitaliseFirstLetter(splitInput[splitInput.length-1]));
		return fixedString.toString();
	}

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
		if (input.contains(",")) {
			String fixedString = multipleNameCapitalise(input);
			welcomeMsg.append(fixedString);
			return welcomeMsg.toString();
		}
		welcomeMsg.append(capitaliseFirstLetter(input));
		return welcomeMsg.toString();
	}

}
