package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;

public class 문자열정렬하기1 {

	public static void main(String[] args) {

		String my_string = "hi12392";
		ArrayList<Integer> list = new ArrayList<>();
		
		String str = my_string.replaceAll("[^0-9]","");
		char[] charArr = str.toCharArray();
		Arrays.sort(charArr);
		for (char c : charArr) {
			list.add(c - 48);
		}
		int answer[] = new int[list.size()];
		for (int i = 0 ; i < list.size() ; i++) {
			answer[i] = list.get(i).intValue();
		}
	}

}
