package programmers.lv0;

public class 아이스아메리카노 {
	public static void main(String[] args) {
		//최대로 마실 수 있는 아메리카노 잔 수
		//최대로 마실 수 있는 아메리카노 money / coffee
		//잔돈 money % coffee 
        int money = 14000;
        int coffee = 5500;
        int[] answer = new int[2];
        
        answer[0] = money / coffee;
        answer[1] = money % coffee;
        
        for(int i = 0; i < answer.length; i++) {
        System.out.println(answer[i]);
        }
        
        
        
	}
}
