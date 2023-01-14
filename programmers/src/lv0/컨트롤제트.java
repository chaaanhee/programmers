package lv0;

public class 컨트롤제트 {

	public static void main(String[] args) {
		String s = "10 Z 20 Z 1";
		int answer = 0;
		//
		int add = 0;
		int sub = 0;
		String[] str = s.split(" ");
		for (int j = 0; j < str.length; j++) {
			if (str[j].contains("Z")) { // Z가 있다면,,
				sub += Integer.valueOf(str[j - 1]);
			} else {
				add += Integer.valueOf(str[j]);
			}
		}
		System.out.println(add - sub);
	}
}
