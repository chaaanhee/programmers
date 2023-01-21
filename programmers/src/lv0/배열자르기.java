package programmers.lv0;

import java.util.ArrayList;

public class 배열자르기 {

	public static void main(String[] args) {
	        //num1 = 인덱스시작점
	        //num2 = 인덱스 마지막점
		  	int[] numbers = {1, 2, 3, 4, 5};
		  	int num1 =1;
		  	int num2 =3;
	        int[] answer = new int[num2 - num1 + 1];
	        System.arraycopy(numbers, num1, answer, 0, num2 - num1 + 1);
	        for (int i : answer) {
	        	System.out.println(i);
			}
		        
	}

}
