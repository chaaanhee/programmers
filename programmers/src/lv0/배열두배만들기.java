package programmers.lv0;

public class 배열두배만들기 {

	public static void main(String[] args) {
	   // 원소를 하나씩 int로 변경
        // int * 2
        // int를 answer[]에 담기
		int[] numbers = {1, 2, 100, -99, 1, 2, 3};
        int[] answer = new int[numbers.length];
       
        for (int i = 0; i < numbers.length; i++) {
        	answer[i] = numbers[i] * 2;
        }
	
	}

}
