package numberofLinesToWriteString;

public class Solution {
	public int[] numberOfLines(int[] widths, String S) {
		int width = 0;
		int line=0;
		int[] res=new int[2];
        for(int i=0;i<S.length();i++){
        	 if(width+widths[S.charAt(i)-'a']>100){
        		 width=0;
        		 line++;
        	 }
        	 width+=widths[S.charAt(i)-'a'];
        }   
        res[0]=line+1;
        res[1]=width;
        return res;
    }
	public static void main(String[] args) {
		Solution s=new Solution();
		int[] test={4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		String str="bbbcccdddaaa";
		int[] a=s.numberOfLines(test, str);
		System.out.println(a[0]+" "+a[1]);
	}

}
