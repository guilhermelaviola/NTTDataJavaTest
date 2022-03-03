package exec2;

public class Exercise02 {

	public static void main(String []args) {

		// Calling the method that checks whether the array is a magic square or not on a couple of examples
		System.out.print("Example 1: ");
		int ex1[][]  = {{4,9,2}, {3,5,7}, {8,1,6}};
		MagicSquare(ex1);

		System.out.print("Example 2: ");
		int ex2[][]  = {{1,2,3}, {4,5,6}, {7,8,9}};
		MagicSquare(ex2);
	}

	public static void MagicSquare(int arr[][]) {

		boolean magic = false;
		boolean rows = false;
		boolean columns = true;
		boolean diagonals = true;

		int row1 = arr[0][0] +  arr[0][1] +  arr[0][2];
		int row2 = arr[1][0] +  arr[1][1] +  arr[1][2];
		int row3 = arr[2][0] +  arr[2][1] +  arr[2][2];

		int col1 = arr[0][0] +  arr[1][0] +  arr[2][0];
		int col2 = arr[0][1] +  arr[1][1] +  arr[2][1];
		int col3 = arr[0][2] +  arr[1][2] +  arr[2][2];

		int diag1 = arr[0][0] +  arr[1][1] +  arr[2][2];
		int diag2 = arr[2][0] +  arr[1][1] +  arr[1][2];

		// Loop for used to iterate through the array and check the conditions separately
		// whether the sums of the rows, columns and diagonals are equal
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {

				if(row1 == row2 && row2 == row3) {
					rows = true;
				}
				else if(col1 == col2 && col2 == col3){
					columns = true;
				}
				else if(diag1 == diag2){
					diagonals = true;
				}
			}
		}

		// Checking whether the sums of the rows, columns and diagonals are equal. If they are,
		// the message saying "It's a Magic Square!" must be displayed, otherwise a message saying that it's
		// not a Magic Square must be displayed.
		if(rows == true && columns == true && diagonals == true) {
			magic = true;	
		}else {
			magic = false;
		}

		if(magic == true) {
			System.out.println("It's a Magic Square!");
		}else{
			System.out.println("It's not a Magic Square...");

		}
	}
}
