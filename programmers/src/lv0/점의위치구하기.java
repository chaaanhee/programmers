package programmers.lv0;

public class 점의위치구하기 {

	public static void main(String[] args) {
		//x 좌표와 y 좌표가 모두 양수이면 제1사분면에 속합니다.
		// x > 0 && y > 0 
		//x 좌표가 음수, y 좌표가 양수이면 제2사분면에 속합니다.
		//x 좌표와 y 좌표가 모두 음수이면 제3사분면에 속합니다.
		//x 좌표가 양수, y 좌표가 음수이면 제4사분면에 속합니다.
		int[] dot = {-7, 9};
		int answer = 0;
		if(dot[0] > 0 && dot[1] > 0) answer = 1;
		else if(dot[0] < 0 && dot[1] > 0) answer = 2;
		else if(dot[0] < 0 && dot[1] < 0) answer = 3;
		else if(dot[0] > 0 && dot[1] < 0) answer = 4;
		System.out.println(answer);
	}

}
