package lv0;

import java.util.ArrayList;
import java.util.Collections;

public class 피자나눠먹기2 {

	public static void main(String[] args) {
		int n = 6;
		int answer = 0;
        // 6의 배수가 piece일때, 
        // piece % n == 0
        // piece / n
//		 4(slice)조각 12(n)명 3(answer)판
        //piece를 arrayList로 선언 >> add로 숫자추가 
		//최소 5판
		//answer가 최소공배수
		
//		for(int i = 1; i < n; i++) {
//			int piece = i * 6;
//		 if(piece % n != 0) {
//		        piece += 1;
//		    }else if(piece % n == 0){
//		    	answer = piece / 6;
//		    }
//		}
//		System.out.println(answer);
		
		int piece = 0;
		for(int i = 1; i <= 6 && i <= n; i++) {
			if(n % i == 0 && 6 % i == 0) {
				piece = i;
			}
		}
		answer = n * 6 / piece / 6;
		System.out.println(answer);	

		/* 
		 * 다른 답
		int pizza = 1; int pizza = 1;
        while(pizza*6%n != 0){
            pizza++;
        }
        while(pizza * 6 % n != 0){
            pizza++;
        }
         *
		 */

	}
}
