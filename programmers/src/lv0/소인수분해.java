package lv0;

import java.util.Iterator;
import java.util.TreeSet;

public class 소인수분해 {

	public static void main(String[] args) {
		//for문으로 돌려서 소인수분해
        //배열에 담기
        //중복값 제거 
		// treeset에 넣기
		
		int n = 1024;

		TreeSet<Integer> treeArr = new TreeSet<>();
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
					n /= i; // n = n / i;
					treeArr.add(i);
					System.out.printf(i+" ");

			} else if(n / i == 1){
	              treeArr.add(n);
			}
		}
		int[] answer = new int [treeArr.size()];
        Iterator value = treeArr.iterator();
        while (value.hasNext()) {
        	for(int i = 0; i < answer.length; i++) {
        		answer[i] = (int) value.next();
        	}
        }
        
        for (int i : answer) {
			System.out.println("answer = "+i);
		}
        
        
	}
    
}
