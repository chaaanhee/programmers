package programmers.lv0;

public class 짝수는싫어요 {
	public static void main(String[] args) {
		int n = 15;
		int[] answer;
		int value = 0;
		
		//홀수가 오름차순으로 담긴 배열
		//홀수가 담긴 배열
		if(n % 2 == 0) {
			answer = new int [n / 2];			
		} else {
			answer = new int [n / 2 + 1];
		}
		
		for(int i = 0; i <= n; i++) {
			if(i % 2 != 0) {
				answer[value] = i;
				value++;
			}
		}
		System.out.println(answer[1]);
		
	}
}
