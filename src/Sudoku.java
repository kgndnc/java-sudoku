import java.util.*;

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
			System.out.printf("I'm checking [%d][%d]\n", row, i);
			if(board[row][i] != 0 && board[row][i] == number)
				return false;			
		}
		return true;
	}
	
	// If the number to be inserted is valid returns true, otherwise false
	private static boolean isValidNumberColumn(int[][] board, int col, int number) {
		
		for (int i = 0; i < SIZE; i++) {
			System.out.printf("I'm checking [%d][%d]\n", i, col);
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
				System.out.printf("I'm checking [%d][%d]\n", i, j);
				if(board[i][j] != 0 && board[i][j] == number)
					return false;
			}
		}
		
		return true;
	}
	
	private static void isFilledWithUniqVals(int[] grid) {		
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
		
		// boolean res = isValidNumberRow(board, 8, 2);
		
		// boolean res = isValidNumberColumn(board, 3, 6);
		
		boolean res = isValidCurrentTable(board, 1, 3, 8);
		
		System.out.println("Evaluation: " + res);
	}

}
