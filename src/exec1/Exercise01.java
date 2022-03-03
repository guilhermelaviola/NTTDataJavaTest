package exec1;

public class Exercise01 {

	public static void main(String[] args) {

		String wordOne = "Andrew";
		String wordTwo = "Chicago";

		// Calling the encrypt method and displaying the result on the screen
		String ex1 = encrypt(wordOne);
		String ex2 = encrypt(wordTwo);

		System.out.println("Example 1 (" + wordOne + "): " + ex1);
		System.out.println("Example 2 (" + wordTwo + "): " + ex2);
	}

	public static String encrypt(String str) {

		String sequence = "acdfgijloprtuvx";
		String letter = "";
		String result = "";

		// Iterating through the word
		for(int i = 0; i < str.length(); i++) {
			letter = str.charAt(i) + "";

			// If one of the letters is present in the sequence, then it must be replaced by the sequence index 
			if(sequence.contains(letter)){
				result += sequence.indexOf(letter);
			}
			// Otherwise, keep the original character
			else{
				result += str.charAt(i);
			}
		}
		// Returning the result
		return result;
	}
}
