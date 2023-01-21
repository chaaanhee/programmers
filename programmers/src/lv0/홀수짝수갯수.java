package programmers.lv0;

public class 홀수짝수갯수 {
	public static void main(String[] args) {
		//[짝수갯수, 홀수갯수]
		// answer[0] = 짝수갯수
		// answer[1] = 홀수갯수
		//answer = num_list의 배열갯수
		
		int[] num_list = {1, 2, 3, 4, 5};
		int[] answer = new int[2];
		int evenNum = 0;
		int oddNum = 0;
		
		for(int i = 0; i < num_list.length; i++) {
			if(num_list[i] % 2 == 0) {
//				evenNum += 1;
//				answer[0] = evenNum;
				answer[0]++;
			} else {
//				oddNum += 1;
//				answer[1] = oddNum;
				answer[1]++;
			}
		}
		System.out.println(answer[0]);
		System.out.println(answer[1]);
	}
}
