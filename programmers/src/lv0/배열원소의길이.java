package programmers.lv0;

public class 배열원소의길이 {

	public static void main(String[] args) {
		//배열 원소의 길이
		//
		String[] strlist = {"We", "are", "the", "world!"};
		int[] answer = new int[strlist.length];
		
		for(int i =0; i < strlist.length; i++) {
			for(int j = 0; j < strlist[i].length(); j++) {
				answer[i] =  strlist[i].length();
			}
			System.out.println(answer[i]);
		}
	}

}
