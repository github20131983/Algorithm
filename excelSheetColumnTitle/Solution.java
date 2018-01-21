package excelSheetColumnTitle;

public class Solution {
public String convertToTitle(int n) {
        StringBuilder result=new StringBuilder();
        while(n>0){
        	n--;
        	result.insert(0,(char)('A'+n%26));
        	n=n/26;
        }
        return result.toString();
    }
public static void main(String[] args){
	Solution s=new Solution();
	System.out.println(s.convertToTitle(54));
}
}
