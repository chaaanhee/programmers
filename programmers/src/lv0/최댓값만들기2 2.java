package programmers.lv0;

import java.util.Arrays;

public class 최댓값만들기2 {

	public static void main(String[] args) {

		int[] numbers = {0, 31, 24, 10, 1, 9};
        int answer = 0;
        int max = 0;
        
        Arrays.sort(numbers);
        for (int i : numbers) {			
//        	System.out.println(i);
		}
        
        max = numbers[numbers.length - 1];
        max = numbers[numbers.length - 2];
        System.out.println(max);
        answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        
	}

}
