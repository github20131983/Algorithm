package integerToRoman;

public class Solution {
	public String intToRoman(int num) {
		String[] symbol={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int[] value={1000,900,500,400,100,90,50,40,10,9,5,4,1};
		StringBuilder res=new StringBuilder();
		for(int i=0;i<value.length;i++){
			while(num>=value[i]){
				res.append(symbol[i]);
				num-=value[i];
			}
		}
		return res.toString();       
    }
	public static void main(String[] args){
		Solution s=new Solution();
		System.out.print(s.intToRoman(1994));
	}
}
