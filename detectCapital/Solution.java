package detectCapital;

public class Solution {
public boolean detectCapitalUse(String word) {
        if('A'<=word.charAt(0)&&'Z'>=word.charAt(0)){
        	if(isUpperCaseAll(word.substring(1))||islowerCaseAll(word.substring(1)))
        		return true;
        }
        else if('a'<=word.charAt(0)&&'z'>=word.charAt(0)){
        	if(islowerCaseAll(word.substring(1)))
        		return true;
        }
        return false;
    }
public boolean isUpperCaseAll(String s1){
	for(int i=0;i<s1.length();i++)
		if('A'>s1.charAt(i)||s1.charAt(i)>'Z')
			return false;
	return true;
}
public boolean islowerCaseAll(String s2){
	for(int i=0;i<s2.length();i++)
		if('a'>s2.charAt(i)||s2.charAt(i)>'z')
			return false;
	return true;
}
public static void main(String[] args){
	Solution s=new Solution();
	System.out.println(s.detectCapitalUse("la"));
}
}
