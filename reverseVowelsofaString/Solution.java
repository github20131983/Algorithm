package reverseVowelsofaString;

public class Solution {
public String reverseVowels(String s) {
	int i=0;
	int j=s.length()-1;
	char[] sArray=s.toCharArray();
        while(i<j){
        	while(!isVowel(sArray[i])&&i<s.length()-1)i++;
        	while(!isVowel(sArray[j])&&j>0)j--;
        	if(i<j){
        	char temp=sArray[i];
        	sArray[i]=sArray[j];
        	sArray[j]=temp;
        	}
        	i++;
        	j--;
        }
        return new String(sArray);
    }
public boolean isVowel(char character){
	if(character=='a'||character=='e'||character=='i'||character=='o'||character=='u'||
	character=='A'||character=='E'||character=='I'||character=='O'||character=='U')
		return true;
	return false;
}
public static void main(String[] args){
	Solution s=new Solution();
	System.out.println(s.reverseVowels("ee"));
}
}
