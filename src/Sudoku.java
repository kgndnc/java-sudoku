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
	
	private static boolean isFilledWithUniqVals(int [] grid) {		
		// Check if all numbers are used only once (except 0)	
		Set<Integer> usedNums = new HashSet<Integer>();
		
		for (int i : grid) {			 
			System.out.println(i);
			if(i != 0 ) {
				usedNums.add(i);
			}
		}		
		System.out.println("Number of unique numbers: "  + usedNums.size());
		boolean isFilled = usedNums.size() == 9 ? true : false;
		
		return isFilled;
	}
	
	@SuppressWarnings("unused")
	private static int[][] solveForOneBoard (int [][] table) {
		// Check if all numbers are used only once (except 0)	
		
		// one set for current usable numbers in row
		// one set for current usable numbers in column
		// one set for current usable numbers in table
		
		// Solve for one board then build your way up
		
		int [] currentBoard = table[0];
		
		for (int i = 0; i < currentBoard.length; i++) {
			System.out.print(currentBoard[i] + "  ");
			if ((i+1) % 3 == 0)
				System.out.println("\n");
		}
		
		for (int i : currentBoard) {			 
			
		}
		
		return table;
	}
		
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] board = {
			{0,0,5,0,0,0,0,0,8},
			{8,0,0,4,0,0,3,5,2},
			{9,0,4,0,0,5,0,0,0},
			{0,0,9,6,0,0,4,0,0},
			{0,0,0,0,0,0,0,0,0},
			{0,0,6,0,0,3,7,0,0},
			{0,0,0,8,0,0,3,0,6},
			{6,3,9,0,0,1,0,0,5},
			{2,0,0,0,0,0,4,0,0}
		};
		
		solveForOneBoard(board);
		
		 //showBoard(board);
		
	}

}
