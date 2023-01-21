package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;

public class 가장큰수찾기 {

	public static void main(String[] args) {
		int[] array = {1, 8, 3};
		int[] answer = new int[2];
		int max = array[0];
		int index = 0;
		//최고값을 찾고, 인덱스값을 추출
		
		for(int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i]; 
				index = i;
				
			}
		}
		answer[0] = max;
		answer[1] = index;
		System.out.println(max);
		System.out.println(index);
		System.out.println(answer);
		
//		System.out.println(Arrays.asList(array).indexOf(max));
		//"-1" 을 반환하는 이유는 위에서 설명 했다시피 찾지를 못했기 때문
		//
	}
}
