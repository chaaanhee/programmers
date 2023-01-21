package lv0;

import java.util.Arrays;

public class 가까운수 {

	public static void main(String[] args) {

		int[] array = {10, 11, 12};
		int n = 13;
		int answer = 0;
		//차액이 가장 가까운 수가
		
		Arrays.sort(array);
		int min = 10000;

		
		for(int i=0; i < array.length; i++) {
			if(Math.abs(array[i]-n) < min) {
				min = Math.abs(array[i]-n);
				answer = array[i];
			}
		}
		System.out.println(answer);
		
	}

}
