package programmers.lv0;


public class 직각삼각형출력하기 {

	public static void main(String[] args) {
		// n = 높이와 너비(별의갯수)
		// * 
		// **
		// ***
	     int n = 3;
	     for(int i = 0; i < n; i++) {
	    	 for (int j = 0; j <= i; j++) {
	    		 System.out.print("*");
	    	 }
	    	 System.out.println();
	    }
	    
	}

}
