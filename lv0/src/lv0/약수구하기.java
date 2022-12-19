package lv0;

public class 약수구하기 {

	public static void main(String[] args) {
		int n = 24;
		int j = 0;
		int count = 0;
		
		for(int i = 1; i <= n; i++) {
			if(n % i ==0 ) {
				count++;
			}
		}
		int[] answer = new int[count];
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				answer[j] = i;
				j++;
			}
		}
		
	}

}
