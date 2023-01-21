package programmers.lv0;

public class 모음제거 {
	public static void main(String[] args) {
		String my_string = "nice to meet you";
		char[] collection = {'a','e','i','o','u'};
		String answer = "";
		 
		for (char c : collection) {
			my_string = my_string.replace(String.valueOf(c), "");	
		}
		System.out.println(answer);
		System.out.println(my_string);
		
	}
}
