package floodFill;

public class Solution {
	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc]==newColor)return image;
        floodFillHelper(image,sr,sc,image[sr][sc],newColor);
        return image;
    }
	public void floodFillHelper(int[][] image,int sr,int sc,int oldColor,int newColor){
		if(sr<0||sr>=image.length||sc<0||sc>=image[0].length||image[sr][sc]!=oldColor)return;
		image[sr][sc] = newColor;
		floodFillHelper(image,sr-1,sc,oldColor,newColor);
		floodFillHelper(image,sr+1,sc,oldColor,newColor);
		floodFillHelper(image,sr,sc-1,oldColor,newColor);
		floodFillHelper(image,sr,sc+1,oldColor,newColor);
	}
	
	
	public static void main(String[] args) {
		Solution s=new Solution();
		int[][] test={{1,1,1},{1,1,0},{1,0,1}};
		int[][] result=s.floodFill(test, 1, 1, 2);
		for(int res[]:result){
			for(int resu:res)
			System.out.print(resu+" ");
		    System.out.println();
		}
	}

}
