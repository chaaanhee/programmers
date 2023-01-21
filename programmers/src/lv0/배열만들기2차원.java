package lv0;

public class 배열만들기2차원 {

	public static void main(String[] args) {
		int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
		int n = 2;
		int count = 0;
		// 1. 배열 하나씩 쪼개서 n개 숫자별로 묶는다.
		int[][] answer = new int[num_list.length/n][n];
		
		for(int i = 0; i < answer.length; i++) {
			for(int j = 0; j < answer[i].length; j++) {
				answer[i][j] = num_list[count];
				count++;
				System.out.println(answer[i][j]);
			}
		}
		
		// 00 01 10 11
	}

}
