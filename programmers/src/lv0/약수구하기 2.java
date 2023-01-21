package programmers.lv0;

import java.util.ArrayList;

public class 약수구하기 {

	public static void main(String[] args) {
		int n = 24;
		ArrayList<Integer> answer = new ArrayList<>();  
//		int[] answer = new int[];
		//약수 24	 % i = 0 
		
		for(int i = 0; i < n; i++) {
			if(n % i == 0) {
				answer.add(i);		
			}
		}
	}
	class Solution {
	    public int solution(int n) {
	        // 피자를 7개로 나눔
	        // n은 사람
	        // 최소값
	        // 1~7n >> 1판
	        // 8 (7/8-1)~14(7*2) >> 2판
	        // 15(7/15-1)~21(7*3) >> 3판
	        // 22(7/22-1)~28(7*4) >> 4판
	        // answer증가
	        
	        int answer;
	        if (n % 7 == 0){
	            answer = n / 7;
	        } else {
	            answer = n / 7 + 1;
	        }
	        return answer;
	    }
	}
}
