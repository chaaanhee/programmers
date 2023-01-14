package lv0;

import java.util.Arrays;

public class 최댓값만들기2 {

	public static void main(String[] args) {

		int[] numbers = {10, 20, 30, 5, 5, 20, 5};
		int answer = 0;

		//(0 1) (0 2) (0 3) (0 4) (0 5)
		//(1 2) (1 3) (1 4) (1 5)
		//(2 3) (2 4) (2 5)
		
//		for(int i = 0; i < numbers.length; i++) {
//			for(int j = i+1; j < numbers.length; j++) {
//				if(numbers[0] * numbers[1] < numbers[i] * numbers[j]) {
//					answer = numbers[i] * numbers[j];
//				}
//			}
//		}
		
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		if(numbers[0] * numbers[1] < numbers[numbers.length-1] * numbers[numbers.length-2]) {
			answer = numbers[numbers.length-1] * numbers[numbers.length-2];
		}else answer = numbers[0] * numbers[1];
		
		System.out.println(answer);
		
		
	}

}
