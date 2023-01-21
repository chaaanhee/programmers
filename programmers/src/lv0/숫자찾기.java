package lv0;

public class 숫자찾기 {

	public static void main(String[] args) {
		int num = 123456;
		int k = 1;
		int answer = 0;
		
		String str = String.valueOf(num);
		answer = str.indexOf(String.valueOf(k)) + 1;
        if(answer == 0) answer = -1;
        
		System.out.println(answer);
		
	}

}
