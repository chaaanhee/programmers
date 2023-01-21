package programmers.lv0;

public class 중복된숫자찾기 {
	public int solution(int[] array, int n) {
        int answer = 0;
        //array[i]를 뽑아내기(for)
        //n과 array[i]를 비교(if)
        //같은 값의 갯수를 리턴 >> answer값 증가(증감식)
        for(int i = 0; i < array.length; i++) {
        	if (n == array[i]) {
        		answer++ ;
        	}
        }
        return answer;
        
    }
}
