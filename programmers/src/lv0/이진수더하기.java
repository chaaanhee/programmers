package lv0;

public class 이진수더하기 {

	public static void main(String[] args) {
		String bin1 = "1001"; 
		String bin2 = "1111";
		String answer = "";
		// String -> int 로 변환
		int binary = Integer.valueOf(bin1, 2) + Integer.valueOf(bin2,2);
		answer = Integer.toBinaryString(binary);
		System.out.println(answer);	
	}
}

