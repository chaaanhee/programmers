package programmers.lv0;

public class 문자열뒤집기 {
		
	public static void main(String[] args) {
		//String -> char
		//문자 뒤집기
		//char -> String
		String my_string = "jaron";
		String answer = "";
		char charArr ;
		
        for(int i = my_string.length()-1; i < my_string.length()&& i >= 0;i--) {
        	answer += String.valueOf(my_string.charAt(i));
        System.out.print(answer);
        }
			
	}
}
