package programmers.lv0;


public class 숨어있는숫자의덧셈1 {

	public static void main(String[] args) {
		String my_string = "aAb1B2cC34oOp";
	    int answer = 0;
	    //my_string에서 문자 추출
	    //숫자문자열을 >> char[] >> 배열요소 덧셈
	    
	    my_string = my_string.replaceAll("[^0-9]", "");
	    char[] charArr = my_string.toCharArray();
	    for (char c : charArr) {
			answer += (c - 48);
		}
	    System.out.println(answer);
	}

}
