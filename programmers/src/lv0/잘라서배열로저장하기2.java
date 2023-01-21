package lv0;

import java.util.Arrays;

public class 잘라서배열로저장하기2 {

	public static void main(String[] args) {
		String my_str = "abc1Addfggg4556b";
		int n = 6;
//		String[] answer = new String[10];
		// 0(i) 	6 (n)
		// 7(n+1) 	12 (2n)
		// 13(2n+1) 17 (
		String[] answer = {};
		
		StringBuffer sb = new StringBuffer();
		sb.append(my_str);
		for(int i = 0; i < my_str.length();i++) {
			if(i == n) sb.insert(i, "/");
			else if(i % (n+1) == 0 && i != 0) {
				sb.insert(i, '-');
			}
		}
//		answer[0] = answer[0].replaceAll("/", "");
		answer = String.valueOf(sb).replaceAll("/", "").split("[^a-zA-Z0-9]\\b");
		System.out.println(Arrays.toString(answer));
	}
}
