package lv0;

import java.util.Arrays;

public class A로B만들기 {

	public static void main(String[] args) {
		String before = "olleh";
		String after = "hello";
		int answer = 0;
		
		// 배열로 담아서 
		// 정렬 후 
		// 비교
		
		for(int i = 0; i < before.length(); i++) {
			char[] beArr = before.toCharArray();
			char[] afArr = after.toCharArray();
			Arrays.sort(beArr);
			Arrays.sort(afArr);
			before = String.valueOf(beArr);
			after = String.valueOf(afArr);
			if(before.equals(after)) answer = 1;
			else answer = 0;
		}
		System.out.println(answer);
		
		/*for(int i = 0;  i < before.length(); i++) {
			str += String.valueOf(before.charAt(i));
			if(str.contains(String.valueOf(after.charAt(i)))) answer = 1;
			else answer = 0;
		}
		System.out.println(str);
		System.out.println(answer);
		*/
	}

}
