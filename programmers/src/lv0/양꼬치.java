package lv0;

public class 양꼬치 {

	public static void main(String[] args) {
			int k = 6;
			int n = 64;
	        int answer = 0;
		    int r = n / 10;
		    if(r > 0){
		        k -= r; // k=k-r
		    }
		    answer = (n * 12000) + (k * 2000);
		    System.out.println(answer);
	}

}
