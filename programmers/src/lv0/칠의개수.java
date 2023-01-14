package lv0;

import java.util.ArrayList;

public class 칠의개수 {

	public static void main(String[] args) {
		int[] array = {7, 77, 17};
	    int answer = 0;
	    ArrayList<String> strArr = new ArrayList<>();
	    // 인트배열 쪼개기
	    //칠과 같은지 검사
	    //answer++
	    for(int i = 0; i < array.length; i++) {
	    	strArr.add(String.valueOf(array[i]));
	    	String[] arr = strArr.get(i).split("");
	    	for(int j = 0; j < arr.length; j++) {
	    	 if(arr[j].equals("7")) {
	    		 answer++;
	    	 }
	    	}
	    }
	    System.out.println(answer);
//	    System.out.println(strArr.toString());
	}

}
