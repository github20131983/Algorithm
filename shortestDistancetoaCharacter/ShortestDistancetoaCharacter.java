package shortestDistancetoaCharacter;

public class ShortestDistancetoaCharacter {
	 public int[] shortestToChar(String S, char C) {
		    int n=S.length();
		    char[] sToCharry=S.toCharArray();
	        int[] result=new int[n];
	        int position=-n;
	        for(int i=0;i<n;i++){
	        	if(sToCharry[i]==C)position=i;
	        	result[i]=i-position;
	        }
	        for(int i=n-1;i>=0;i--){
	        	if(sToCharry[i]==C)position=i;
	        	result[i]=Math.min(result[i],Math.abs(i-position));
	        }
	        return result;
	    }
	 public static void main(String[] args){
		 ShortestDistancetoaCharacter sdc=new ShortestDistancetoaCharacter();
		 int[] res=sdc.shortestToChar("loveleetcode", 'e');
		 for(int r:res)
			 System.out.println(r);
	 }
}
