package programmers.lv0;

public class 외계행성의나이 {

	public static void main(String[] args) {
		int age =100;
		String answer = "";
		
		//a는 0, b는 1, c는 2, ..., j는 9입니다. 
		//예를 들어 23살은 cd, 51살은 fb로 표현
		//
		//
		
		for(int i = 0; i < 10; i++) {
			for(char j = 97; j < 123; j++) {
				j = (char)i;
				System.out.println(j);
			}
		}
		
	}

}
