package programmers.lv0;

public class 제곱수판별하기 {
	public static void main(String[] args) {
		//n이 제곱수라면 1을 아니라면 2를 return
		//Math.sqrt(n) 값이 소수점이 아니면 제곱수가 맞다.
		int n = 143;
		int answer = 0;
		System.out.println(Math.sqrt(n));
		if(Math.sqrt(n) == (int)Math.sqrt(n)) answer = 1;
		else answer = 2;
	}

}
