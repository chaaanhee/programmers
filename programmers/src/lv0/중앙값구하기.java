package programmers.lv0;

import java.util.TreeSet;

public class 중앙값구하기 {
	public static void main(String[] args) {
		int[] array = {1, 2, 7, 10, 11};
		int answer = 0;
		 
		TreeSet<Integer> set = new TreeSet<>();
	    for (Integer integer : array) {
			set.add(integer);
		}    
	    System.out.println(set);
	}
}
