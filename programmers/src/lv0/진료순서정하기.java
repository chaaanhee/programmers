package lv0;

import java.util.ArrayList;
import java.util.Collections;

public class 진료순서정하기 {

	public static void main(String[] args) {
		int[] emergency = {30, 10, 23, 6, 100};
		int[] answer = new int [emergency.length];
		//내림차순 배열 
		//indexof로 뽑은 값을 answer에 넣기
		
		ArrayList<Integer> intArr = new ArrayList<>();
		for (Integer i : emergency) {
			intArr.add(i);
		}
		Collections.sort(intArr, Collections.reverseOrder());

		for(int i = 0; i < emergency.length; i++) {
			answer[i] = intArr.indexOf(emergency[i])+1;
			System.out.println(answer[i]);
		}
		
		
	}	

}
