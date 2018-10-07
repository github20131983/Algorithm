package validSudoku;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public boolean isValidSudoku(char[][] board) {
		for(int i=0;i<9;i++){
			Set<Character> row=new HashSet<Character>();
			Set<Character> col=new HashSet<Character>();
			Set<Character> cube=new HashSet<Character>();
			int rowIndex=3*(i/3);
			int columIndex=3*(i%3);
			for(int j=0;j<9;j++){
				if(board[i][j]!='.'&&!row.add(board[i][j]))
					return false;
				if(board[j][i]!='.'&&!col.add(board[j][i]))
					return false;
				if(board[rowIndex+j/3][columIndex+j%3]!='.'&&!cube.add(board[rowIndex+j/3][columIndex+j%3]))
					return false;
			}
		}
		return true;      
    }
	public static void main(String[] args){
		Solution s=new Solution();
		char[][] test={{'5','3','.','.','7','.','.','.','.'},
				  {'6','.','.','1','9','5','.','.','.'},
				  {'.','9','8','.','.','.','.','6','.'},
				  {'8','.','.','.','6','.','.','.','3'},
				  {'4','.','.','8','.','3','.','.','1'},
				  {'7','.','.','.','2','.','.','.','6'},
				  {'.','6','.','.','.','.','2','8','.'},
				  {'.','.','.','4','1','9','.','.','5'},
				  {'.','.','.','.','8','.','.','7','9'}};
		System.out.println(s.isValidSudoku(test));
	}
}
