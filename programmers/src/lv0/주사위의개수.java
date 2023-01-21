package programmers.lv0;

public class 주사위의개수 {

	public static void main(String[] args) {
		//int[] box 가로,세로,높이 박스 >> 각 요소 곱하기
        //int n 주사위 모서리의 길이정수 >> n의 3제곱수
		//int[] box = {10, 8, 6} int n = 3 답 : 12
		// 3 2 2
		int[] box = {10, 8, 6};
		int n = 3;
        int answer = 1;
        
        /* 부피로는 오차가 발생한다. >> 아마 직사각형이라 빈 곳이 있기때문에
        int boxVolume = 1;
        for(int i = 0; i < box.length; i++) {
        	boxVolume *= box[i];
        }
        System.out.println(boxVolume / Math.pow(n, 3));
        */
        
        for(int i = 0; i < box.length; i++) {
        	answer *= (box[i] / n); // answer = answer + (box[i] / n)
        	System.out.println(answer);
        }
        
        
	}

}
