package lv0;

public class k의개수 {

	public static void main(String[] args) {
		int i = 10; 
		int j = 50; 
		int k = 5;
		int answer = 0;
		String str = ""; 
		
		//for문 돌려 들어가는 숫자 모두 배열에 담기
		//배열 charAt돌려 char로 
		//같은것 갯수세기 answer++
		
		for(int x = i; x <= j; x++) {
			str += x;
		}
		String[] strArr = str.split("");
		for (String sa : strArr) {
			if(sa.equals(Integer.toString(k))) {
				answer++;
			}
		}
		
//		System.out.println(answer);
	}

}
