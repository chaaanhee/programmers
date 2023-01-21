package programmers.lv0;

import java.util.ArrayList;

public class n의배수고르기 {

	public static void main(String[] args) {
		//n의 배수가 아닌 것을 제거하라
		int n = 3; 
		int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i : numlist) {
			if(i % n == 0) list.add(i);
		} 
		int[] answer = new int[list.size()];
		for (int j = 0; j < list.size(); j++) {
			answer[j] = list.get(j).intValue();
			System.out.print(answer[j]);
		}
		
	}

}
