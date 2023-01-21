package programmers.lv0;

public class 특정문자제거 {

	public static void main(String[] args) {
		String my_string = "abcdef";
		String letter = "f";
		String answer = "";
		
		answer = my_string.replaceAll(letter,"");
		System.out.println(answer);
		
	}

}
