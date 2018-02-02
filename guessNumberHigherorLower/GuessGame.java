package guessNumberHigherorLower;

public class GuessGame {
public int guess(int num){
	if(num<6)return 1;
	if(num>6)return -1;
	return 0;
}
}
