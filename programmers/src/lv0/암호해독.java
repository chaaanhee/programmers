package programmers.lv0;

public class 암호해독 {

	public static void main(String[] args) {

		String cipher = "dfjardstddetckdaccccdegk";
		//cipher를 char로 추출
        //i % code == (code-1)로 배수 추출
        //code-1 은 인덱스값이기때문에, 0이 아님
		// 3(4-1) 7(8-1) 11(12-1) 15(16-1)
		int code = 4;
		String answer = "";
		char[] cArr = new char[cipher.length()];
		
		for(int i = 0; i < cipher.length(); i++) {
			cArr[i] = cipher.charAt(i);
			if( i % code == (code-1) ) {
				answer += cArr[i];
			}			
		}
		System.out.println(answer);
	}

}
