package lv0;

public class 팩토리얼 {
	public static void main(String[] args) {
//		int n = 7;
		int answer = 0;
		recursiveTest(7);
	    
	    /*
	     * i팩토리얼 (i!)은 1부터 i까지 정수의 곱을 의미합니다. 
	     * 예를들어 5! = 5 * 4 * 3 * 2 * 1 = 120 입니다. 정수 n이 주어질 때 
	     *  fac! = (fac-1) * ... 1 = n
	     * 다음 조건을 만족하는 가장 큰 정수 i를 return 하도록 solution 함수를 완성해주세요.
			i! ≤ n 
	     */
	   
	    
	}
	
    public static void recursiveTest(int count)
    {
        System.out.println("count : " + count);
        
        for(int i = 0; i < count; i++) {
        	count = count * (count+1);
        }
        count = count + 1;
        if(count <= 7) recursiveTest(count);
    }
}
