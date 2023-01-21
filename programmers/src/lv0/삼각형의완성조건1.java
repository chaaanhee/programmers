package programmers.lv0;

import java.util.Arrays;

public class 삼각형의완성조건1 {

	public static void main(String[] args) {
		//가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
        // max < num1 + num2;
		int[] sides = {199, 72, 222};
        int answer = 0;
        
        Arrays.sort(sides);
        int max = sides[sides.length-1];
        if (max < sides[0] + sides[1]) {
        	answer = 1;
        }else {
        	answer = 2;
        }
	}

}
