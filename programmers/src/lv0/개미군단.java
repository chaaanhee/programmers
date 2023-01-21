package programmers.lv0;

public class 개미군단 {
/*
 * 23	5
 * 24	6
 * 999	201
 */
	public static void main(String[] args) {
		int hp = 11;
        int answer = 0;
        // 장군개미 공격력 5
        // 병정개미 공격력 3
        // 일개미 공격력 1
        // 장군개미로 공격한 후 나머지값을 어떻게 할것인가를 고민하기
        
        answer = hp / 5 + hp % 5 / 3 + hp % 5 % 3 / 1;
        System.out.println(answer);
        
	}

}
