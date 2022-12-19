package lv0;

import java.util.Arrays;

public class 문자열정렬하기2 {

	public static void main(String[] args) {
		String my_string = "Python";
	    String answer;
	    String[] strArr = new String[my_string.length()];
		// hnopty
	    // string >> char[] >> char 한글자씩 비교해서 대소문자 바꾸기
	    for(int i = 0; i < my_string.length(); i++) {
	    	char ch = my_string.charAt(i);
	    	if( ch > 64 ) {
	    		strArr[i] = String.valueOf(ch).toLowerCase();
	    	}
	    	else strArr[i] = String.valueOf(ch);
	    }
	    Arrays.sort(strArr);
	    answer = String.join("", strArr);
	    System.out.println(Arrays.toString(strArr));
	    System.out.println(answer);
	}

}

class Solution {
    public String solution(String my_string) {
        char[] c = my_string.toLowerCase().toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}