package programmers.lv0;

public class 순서쌍의개수 {
	public static void main(String[] args) {
		//n이 20 이므로 곱이 20인 순서쌍은 
		//(1, 20), (2, 10), (4, 5), (5, 4), (10, 2), (20, 1) 이므로 
		//n의 약수구하기
		//6을 return
		
		int n = 20;
		int answer = 0;
		
		for(int i = 1; i <= n; i++) {
				if(n % i == 0) {
					answer++;
				}
		}
		System.out.println(answer);
	}
}
