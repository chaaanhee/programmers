package programmers.lv0;

public class 피자나눠먹기1 {

	public static void main(String[] args) {
        // 피자를 7개로 나눔
        // n은 사람
        // 최소값
        // 1~7n >> 1판
        // 8 (7/8-1)~14(7*2) >> 2판
        // 15(7/15-1)~21(7*3) >> 3판
        // 22(7/22-1)~28(7*4) >> 4판
        // answer증가
        
		int n = 15;
        int answer;
        
        if (n % 7 == 0) answer = n / 7;
        else answer = n / 7 + 1;
        
		System.out.println(answer);
	}

}
