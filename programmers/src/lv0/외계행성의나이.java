package lv0;

public class 외계행성의나이 {

	public static void main(String[] args) {
		int age= 100;
		String answer = "";
//		a는 0, b는 1, c는 2, ..., j는 9입니다. 
//		예를 들어 23살은 cd, 51살은 fb로 표현
		
		//age를 string[]
		//string[]을 뽑아서
		//char로 계산
		
		char[] charArr = Integer.toString(age).toCharArray();
		for(int i = 0; i < charArr.length; i++) {
		answer = Character.toString((int)(charArr[i]+49));
		System.out.print(answer);
		}
		
	}

}
