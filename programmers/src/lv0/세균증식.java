package programmers.lv0;

public class 세균증식 {
	public static void main(String[] args) {
		int n = 7;
		int t = 15;
		int answer = 0;

		//(t, n) : (1, 2)(2, 4)(3, 8)
		//1h => 7*2 / 7*2^2 / 7*2^3
		//n 제곱값
		
        answer = n * (int)Math.pow(2, t);
        System.out.println(answer);
	}
}
