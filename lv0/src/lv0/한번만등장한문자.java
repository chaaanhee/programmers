package lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class 한번만등장한문자 {

	public static void main(String[] args) {
		String s = "hello";
		String answer = "";

		// s를 배열집합으로 하나씩 꺼내기
		// 중복값을 삭제
		//
		
		ArrayList<Character> chArr = new ArrayList<>();
		for(int i = 0; i < s.length() ; i++) {
			chArr.add(s.charAt(i));
			Collections.sort(chArr);
			System.out.println(chArr.toString());
//			if(chArr){
//				System.out.println(i);
//			}
		}
		
	}

}
