package wordSearch;

public class Solution {
	public boolean exist(char[][] board, String word) {
        char[] w=word.toCharArray();
        boolean[][] visited=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++)
        	for(int j=0;j<board[i].length;j++)
        		if(exist(board,i,j,0,w,visited))
        			return true;
        return false;
    }
	public boolean exist(char[][] board,int x,int y,int i,char[] word,boolean visited[][]){
		if(x<0||y<0||x==board.length||y==board[x].length)
			return false;
		if(board[x][y]!=word[i]) 
			return false;
		if((i+=1)==word.length)
			return true;
		boolean res=false;
		visited[x][y]=true;		
		if(x>0&&!visited[x-1][y])
			   res=res||exist(board,x-1,y,i,word,visited);
		if(x+1<visited.length&&!visited[x+1][y])
			   res=res||exist(board,x+1,y,i,word,visited);
		if(y>0&&!visited[x][y-1])
			   res=res||exist(board,x,y-1,i,word,visited);
		if(y+1<visited[x].length&&!visited[x][y+1])
			   res=res||exist(board,x,y+1,i,word,visited);
		if(!res)		
			visited[x][y]=false;
		return res;
	}
	public static void main(String[] args){
		char[][] board={
				 {'A'}
				  		};
		String[] strs={"ABCCED","A","ABCB"};
		Solution s=new Solution();
		for(String str:strs)
			System.out.println(s.exist(board, str));
	}
}
