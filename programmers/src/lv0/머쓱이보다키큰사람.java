package programmers.lv0;

public class 머쓱이보다키큰사람 {
	public int solution(int[] array, int height) {
		//배열 요소 출력
        //키를 요소들과 비교
        //키가 더 큰 사람 증가
        int answer = 0;
        
        for (int i = 0; i < array.length; i++) {
        	if (height < array[i]) {
        		answer++;
        	}
        }
        
        return answer;
    }
}
