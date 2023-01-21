package src.programmers.lv0;



public class 배열회전시키기 {

	public static void main(String[] args) {
		int[] numbers = {4, 455, 6, 4, -1, 45, 6}; 
		String direction = "right";
		int[] answer = new int[numbers.length];
		
		for(int i = 0; i < numbers.length; i++) {
			if(direction.equals("left")) {
				System.arraycopy(numbers, 1, answer, 0, numbers.length-1);
				answer[numbers.length-1] = numbers[0];
			}
			else if(direction.equals("right")) {
				System.arraycopy(numbers, 0, answer, 1, numbers.length-1);
				answer[0] = numbers[numbers.length-1];
			}
		}
		
		
		/*
		//다른 답
		for(int i=0; i<numbers.length; i++){
            if(direction.equals("right")){
                
            	if(i < numbers.length-1){
                    answer[i+1] = numbers[i];
                }else{
                    answer[0] = numbers[i];
                }
                
            }else{
                
            	if(i == 0){
                    answer[numbers.length-1] = numbers[0];
                }else{
                    answer[i-1] = numbers[i];
                }
            	
            }
        }
		 */
	}

}
