package exec3;

public class Exercise03 {

	private static final int HASH = 7; 
	private static final int FACTOR = 37; 
	private static final String LETTERS = "bdeginoprstuw";

	public static void main(String[] args) {
		// Testing the method so find the 7-letter word
		System.out.println("The 7-letter word that contains the hash " +
				getHash("word") + " is: " + findWord(687759396014l));
	}

	private static long getHash(String s) { 
		long h = HASH; 
		int lLen = s.length(); 
		for(int i = 0; i < lLen; i ++) 
			h = h * FACTOR + LETTERS.indexOf(s.charAt(i)); 
		return h; 
	}

	public static String findWord(long hash) {
		// For a hash greater than the defined hash value, the result will be equal to the sequence letters (LETTERS),
		// in which the index on charAt method will be converted to int. Finally,
		// the hash value is divided by FACTOR
		String result = "";
		while(hash > HASH) {
			result = LETTERS.charAt((int) (hash % FACTOR)) + result;		
			hash = hash / FACTOR;
		}
		return result;
	}
}
