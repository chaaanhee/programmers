package lv0;

import java.util.regex.Pattern;

public class 숨어있는숫자의덧셈 {

	public static void main(String[] args) {
		String my_string = "aAb1B2cC34oOp";
		int answer = 0;
		
		String strArr[] = my_string.replaceAll("[^0-9]", " ").split(" ");
		for(int i =0; i < strArr.length; i++) {			
			if(strArr[i].equals("")) {
				continue;
			} else answer += Integer.valueOf(strArr[i]);
		}
		System.out.println(answer);
	}

}
