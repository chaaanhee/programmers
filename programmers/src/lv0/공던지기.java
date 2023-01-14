package lv0;

import java.util.Arrays;

public class 공던지기 {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6};
		int k = 5;
		
		//자기포함 5
		//배열 만들기
		//.indexOf() 으로 인덱스 값 찾기
		int answer = 0;
		int[] answerArr = new int[numbers.length-k];
		
		System.arraycopy(numbers, k-1, answerArr, k-1, numbers.length-1);
		System.out.println(Arrays.toString(answerArr));

	}

}
