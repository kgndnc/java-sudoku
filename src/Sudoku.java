public class Sudoku {

	private static final int SIZE = 9;


	private static void showBoard(int [][] table) {
		for (int i = 0; i < SIZE; i++) {
			if(i != 0 && i % 3 == 0)
				System.out.println("--------------------+");
			for (int j = 0; j < SIZE; j++) {
				if(j != 0 && j % 3 == 0)
					System.out.print("| ");
				System.out.print(table[i][j] + " ");

			}
			System.out.println();			
		}		
	}

	// If the number to be inserted is valid returns true, otherwise false
	private static boolean isValidNumberRow(int[][] board, int row, int number) {

		for (int i = 0; i < SIZE; i++) {
			// System.out.printf("I'm checking [%d][%d]\n", row, i);
			if(board[row][i] != 0 && board[row][i] == number)
				return false;			
		}
		return true;
	}

	// If the number to be inserted is valid returns true, otherwise false
	private static boolean isValidNumberColumn(int[][] board, int col, int number) {

		for (int i = 0; i < SIZE; i++) {
			// System.out.printf("I'm checking [%d][%d]\n", i, col);
			if(board[i][col] != 0 && board[i][col] == number)
				return false;			
		}
		return true;
	}

	// If the number to be inserted is valid returns true, otherwise false
	private static boolean isValidCurrentTable(int board[][], int row, int column, int number) {

		int startingRow = row - (row % 3);
		int startingCol = column - (column % 3);

		for (int i = startingRow; i < startingRow + 3; i++) {
			for (int j = startingCol; j < startingCol + 3; j++) {
				// System.out.printf("I'm checking [%d][%d]\n", i, j);
				if(board[i][j] != 0 && board[i][j] == number)
					return false;
			}
		}

		return true;
	}


	private static boolean isValidAll (int[][] grid, int row, int col, int num) {		
		return isValidCurrentTable(grid, row, col, num) &&
				isValidNumberColumn(grid, col, num) && isValidNumberRow(grid, row, num);		
	}


	private static boolean solve(int [][] table) {
		// backtracking algorithm

		// rows 0 - 8
		// cols 0 - 8

		for (int i = 0; i < SIZE; i++) {			
			for (int j = 0; j < SIZE; j++) {				
				// if it's empty try the values
				if (table[i][j] == 0) {

					for (int k = 1; k  <= 9; k++) {

						if(isValidAll(table, i, j, k)) {							
							table[i][j] = k;

							// backtracking happens in this part
							// recursive call to solve() assuming the k value was the correct choice
							// and moving on to the next empty spot. If a deadlock occurs, we set the
							// number to 0
							if(solve(table)) {
								return true;								
							}
							else {
								// set it to 0 to try a different number next time
								// because the number k in this spot caused a deadlock in
								// future placements
								table[i][j]=0;
							}								
						}
					}
					// if you try all the numbers in this loop with k variable (1-9)
					// return false to backtrack (cause the previous placement to not return true
					// and enter into else statement)
					return false;
				}
			}
		}

		return true;
	}		

	public static void main(String[] args) {

		int [][] board = {
				{0,0,5,8,0,0,9,0,4},
				{0,0,0,4,0,0,0,0,5},
				{0,0,8,3,5,2,0,0,0},			
				{0,0,9,0,0,0,0,0,6},			
				{6,0,0,0,0,0,0,0,3},
				{4,0,0,0,0,0,7,0,0},			
				{0,0,0,6,3,9,2,0,0},			
				{8,0,0,0,0,1,0,0,0},
				{3,0,6,0,0,5,4,0,0}
		};

		showBoard(board);

		if (solve(board)) {
			System.out.println("\nBoard solved successfully.\n");
			showBoard(board);
		} 
		else {
			System.out.println("\nSorry, but this board is unsolvable.\n");
		}

	}

}
