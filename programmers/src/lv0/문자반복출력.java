package programmers.lv0;

public class 문자반복출력 {
	public static void main(String[] args) {
		String my_string = "hello"; 
		int n = 3;
		String answer = "";
		char[] charArr = my_string.toCharArray();
		//문자열을 char[]로 변경하고, 
		//반복
		//char를 다시 문자열로
//		System.out.println(my_string.repeat(n));
		for (int i = 0; i < my_string.length(); i++) {
			for(int j = 0; j < n; j++) {
				answer += charArr[i];
			}
			
		}
	}
}
