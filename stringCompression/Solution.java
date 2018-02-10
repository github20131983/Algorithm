package stringCompression;

public class Solution {
public int compress(char[] chars) {
	    int index=0;
        for(int i=0;i<chars.length;){
        	char currentChar=chars[i];
        	chars[index++]=currentChar;
        	int count=0;
        	while(i<chars.length&&chars[i]==currentChar){
        		count++;
        		i++;
        	}
        	if(count!=1)
              for(char a:Integer.toString(count).toCharArray())
                 chars[index++]=a;
        	}        	
        return index;
    }

public static void main(String[] args){
	Solution s=new Solution();
	char[] a={'a'};
	System.out.println(s.compress(a));
	for(char s1:a)
		System.out.println(s1);
}
}
