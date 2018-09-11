package lemonadeChange;

public class Solution {
	public boolean lemonadeChange(int[] bills) {
        int countOfFive=0,countOfTen=0;
        for(int i=0;i<bills.length;i++){
        	if(bills[i]==5)countOfFive++;
        	else if(bills[i]==10){        		
				countOfTen++;
				countOfFive--;     		
        	}
        	else if(countOfTen>0){
        		countOfFive--;
        		countOfTen--;
        	}
        	else 
        		countOfFive-=3;
        	if(countOfFive<0)
        		return false;
        }
        return true;
    }
    public static void main(String[] args){
    	int[] bills={5,5,5,10,20};
    	System.out.print((new Solution()).lemonadeChange(bills));
    }
}
