package lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 문자열계산하기 {
 
	public static void main(String[] args) {
		String my_string = "3 + 4";
		int answer = 0;
		
		//if (+이면)
		List<String> list = new ArrayList<>();
		String strArr[] = my_string.replaceAll("\\d", "").trim().split(my_string);
		if("+".equals(strArr[0])) {
			String str[] = my_string.replaceAll("[^0-9]", "").split("");
			for(int i = 0; i < list.size(); i++) {
				answer += Integer.valueOf(str[i]);
			}			
		} 
		/*
		else if("-".equals(strArr[0])) {
			String str[] = my_string.replaceAll("[^0-9]", "").split("");			
			for(int i = 0; i < str.length; i++) {
//				System.out.println(str[i]);
				answer = Integer.valueOf(str[i]) - Integer.valueOf(str[i+1]); //answer = str[i] - str[i+1]
//				System.out.println(answer);
			}
		}
		*/
//		System.out.println(answer);
//		System.out.println(my_string);
	
//		System.out.println(strArr.length);
	}

}
