package programmers.lv0;

class 양꼬치 {
    public int solution(int n, int k) {
        int answer = 0;
	    int service = n / 10;
	    if(service > 0){
	        k -= service; // k = k - service
	    }
	    answer = (n * 12000) + (k * 2000);
        return answer;
    }

}
