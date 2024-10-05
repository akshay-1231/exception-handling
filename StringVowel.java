package exception;

public class StringVowel {
	public static void CheckForVowels(String input) throws Exception {
		if (input == null || input.isEmpty()) {
			System.out.println("input string can not be empty");

		}
		if (!containsVowels(input)) {
			throw new Exception("The string does not contain any vowels.");
		}
	}

	private static boolean containsVowels(String input) {
		String vowels = "akshayaeiou";
		for (char ch : input.toCharArray()) {
			if (vowels.indexOf(ch) >= 0) {
			}
		}
		return false;
	}

	public static void main(String[] args) {
	    try {
            CheckForVowels("aeiou");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
	}

}
