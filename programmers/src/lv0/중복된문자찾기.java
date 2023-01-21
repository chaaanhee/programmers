package lv0;

import java.util.ArrayList;
import java.util.List;

public class 중복된문자찾기 {

	public static void main(String[] args) {
		String my_string = "We are the world";
		String answer ="";
	    String[] str = new String[my_string.length()];
	    
	    str = my_string.split("");
	    List<String> list = new ArrayList<>();
	    
	    for(int i = 0; i < my_string.length();i++) {
//	    	System.out.println(str[i]);
	    	if(!list.contains(str[i])) {
	    		list.add(str[i]);
	    	}
	    }
	    for (String i : list) {
			answer += i;
		}
	    System.out.println(answer);

	}

}
/*
        String[] answer = my_string.split("");
        Set<String> set = new LinkedHashSet<String>(Arrays.asList(answer));

        return String.join("", set);
    }

*
		for(int i=0; i<my_string.length(); i++){
            //my_string.indexOf(my_string.charAt(i));
            if(i==my_string.indexOf(my_string.charAt(i)))
                answer+=my_string.charAt(i);
        }

        return answer;
*/