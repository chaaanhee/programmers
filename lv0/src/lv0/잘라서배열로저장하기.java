package lv0;

public class 잘라서배열로저장하기 {

	public static void main(String[] args) {
		
		String my_str = "abc1Addfggg4556b";
		int n = 6;
//		String[] answer = new String[10];
		// 0(i) 	6 (n)
		// 7(n+1) 	12 (2n)
		// 13(2n+1) 17 (
		String[] answer = {};
		if(my_str.length()/n == 0) {
			answer = new String[my_str.length()/n];
		} else {
			answer = new String[my_str.length()/n + 1];
		}
		
		for (int i = 0, j = 0;i < my_str.length() || j < answer.length; i++) {
			if(i == 0) {
				answer[j] = my_str.substring(i,n);	
				System.out.println("i == 0 : " + answer[j]);
				j++;
			}
			else if(i % n == 1 && i < my_str.length()/n+1) { 
				answer[j] = my_str.substring(n,n*2);
			System.out.println("i % n == 1 : " + answer[j]);
			j++;
			
			}
			else if( i != n && i % n == 0) {
				answer[j] = my_str.substring(i,my_str.length());
			System.out.println("i % n == 0 : " + answer[j]);
			}
		}
//		System.out.println(answer[0]);
//		System.out.println(answer.toString());
	}

}
