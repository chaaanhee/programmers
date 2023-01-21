package lv0;

import java.util.Iterator;

public class 게임369 {

	public static void main(String[] args) {
		int order = 294230;
		int answer = 0;
		
		String str = String.valueOf(order);
		//int -> String배열 
		//3의 배수일때 answer++
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println(0 % 3);
			if(ch != 48 && ch % 3 == 0 ) {
				answer++;
			}
		}
		System.out.println(answer);
		
	}

}
