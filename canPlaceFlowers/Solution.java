package canPlaceFlowers;

public class Solution {
public boolean canPlaceFlowers(int[] flowerbed, int n) {
	int len=flowerbed.length;
	if(len==1&&flowerbed[0]==0)
		return true;
	if(len>=2&&flowerbed[0]==0&&flowerbed[1]==0){
		flowerbed[0]=1;n--;
	}
	for(int i=1;i<flowerbed.length-1;i++){
		if(flowerbed[i]==0&&flowerbed[i-1]==0&&flowerbed[i+1]==0){
			flowerbed[i]=1;
			n--;
		}		
	}
	if(len>=2&&flowerbed[len-2]==0&&flowerbed[len-1]==0){
		n--;
	}
	System.out.print(n);
	if(n<=0)return true;
	return false;        
    }
public static void main(String[] args){
	Solution s=new Solution();
	int[] a={0,0,1,0,0};
	System.out.println(s.canPlaceFlowers(a, 1));
}
}
