package programmers.lv0;

public class 최댓값만들기 {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
        int answer = 0;
        
        int max = 0;
       
        for (int i = 1; i < numbers.length; i++) {
        	if(numbers[i] > max ) {
        		max = numbers[i];
        	}
        	
        }
        System.out.println(max);
	}
}
