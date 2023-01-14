package lv0;

public class 문자열계산하기2 {
	public static void main(String[] args) {
		String my_string = "3 - 4";
		
		
		String[] strArr = my_string.split(" ");
		int answer = Integer.valueOf(strArr[0]);
		
		for(int i = 0; i < strArr.length; i++) {
			if(strArr[i].equals("+")) {
				answer += Integer.valueOf(strArr[i+1]);
			}else if(strArr[i].equals("-")) {
				answer -= Integer.valueOf(strArr[i+1]);
			}
		}
		
		System.out.println(answer);
	}
}	
