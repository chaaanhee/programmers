package lv0;

public class 인덱스바꾸기 {

	public static void main(String[] args) {
		String my_string = "hello";
		int num1 = 1;
		int num2 = 2;
		String answer = "";
		char[] charArr = new char[my_string.length()];

		for(int i = 0; i < my_string.length();i++) {
			charArr[i] = my_string.charAt(i);
			charArr[num1] = my_string.charAt(num2);
			charArr[num2] = my_string.charAt(num1);
		}
		answer = String.valueOf(charArr);
		System.out.println(answer);
		
		//참고용 답!
		char[] ch = my_string.toCharArray();

        ch[num1] = my_string.charAt(num2);
        ch[num2] = my_string.charAt(num1);

        answer = String.valueOf(ch);
	}

}
