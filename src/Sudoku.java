import java.util.*;

public class Sudoku {

	private static final int SIZE = 9;
	
	private static void showBoard(int [][] table) {
		
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				String s = "";
				s+= table[i][j] + "   ";
				
				// System.out.print(table[i][j] + "\t");				
				
				if( (j+1) % 3 == 0) {
					s = s.trim();
					s+= " |\n";
				}
					//System.out.println("|\n");
				
				System.out.print(s);				
			}
			
			System.out.println("----------+");
			
		}
	}
	
	@SuppressWarnings("unused")
	private static boolean isValidNumberRow(int[][] board, int table, int row, int column, int number) {
		/*		tables
		 *   [0]  [1]  [2]  -> if one of these check [0,1,2][row]
		 *   [3]  [4]  [5]  -> if one of these check [3,4,5][row]
		 *   [6]  [7]  [8]  -> if one of these check [6,7,8][row]
		 *      
		 * */
		
		
	}
	
	private static boolean isFilledWithUniqVals(int[] grid) {		
		// Check if all numbers are used only once (except 0)	
		
	}
	
	
	private static int[][] solveForOneBoard (int [][] table) {
		// backtracking algorithm
		
		
		return table;
	}
		
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		// solveForOneBoard(board);
		
		 // showBoard(board);
		
		isValidNumberRow(board, 2, 6, 1, 1);
		
	}

}
