package lv0;

public class 저주의숫자3 {

	public static void main(String[] args) {
		int n = 15;
	    int answer = 0;
	    
	    for(int i = 0; i < n; i++) {
	    	answer++;
	    	while(answer % 3 == 0 || String.valueOf(answer).contains("3")) {
	    		answer++;
	    	}
	    }

	}

}
