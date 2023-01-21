package programmers.lv0;

public class 대문자와소문자 {

	public static void main(String[] args) {

		String my_string = "abCdEfghIJ";
		String answer = "";
		
		//String >> char[]
		//char 대문자, 소문자 변경
		//char[] >> String
		char[] cArr = my_string.toCharArray();
		for (char c : cArr) {
			if(c < 91) answer += String.valueOf(c).toLowerCase();
			else answer += String.valueOf(c).toUpperCase();
		}
		System.out.println(answer);
	}

}
