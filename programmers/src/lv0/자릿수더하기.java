package programmers.lv0;

import java.util.Iterator;

public class 자릿수더하기 {
	public static void main(String[] args) {
		int n = 1234;
		int answer = 0;
		
		//int를 int[]로 변환
		//int >> string >> char[] >> 
		//int[]의 요소를 하나씩 더하기
		
		String str = String.valueOf(n);
		char[] cArr = str.toCharArray();
		for(int i = 0; i < cArr.length; i++) {
			System.out.println(cArr[i]);
			answer += Integer.valueOf(cArr[i]) - 48;
		}

		System.out.println(answer);
	}
}
