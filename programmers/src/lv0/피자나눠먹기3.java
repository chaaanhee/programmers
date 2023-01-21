package programmers.lv0;

public class 피자나눠먹기3 {
	 public int solution(int slice, int n) {
        // 4(slice)조각 12(n)명 3(answer)판
		// 7(slice)조각 10(n)명 2(answer)판	 
        // n / slice
		 
	        int answer = 0;
	        if(n % slice == 0){
	            answer = n / slice;
	        } else {
	            answer = n / slice + 1;
	        }
	        return answer;
	    }
}
