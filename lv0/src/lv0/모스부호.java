package lv0;

import java.util.HashMap;
import java.util.Map;

public class 모스부호 {

	public static void main(String[] args) {
		String letter =".... . .-.. .-.. ---";
	    String answer = "";
	    
	    Map<String,String> morse = new HashMap<>(){
	    	{
	    	put(".-","a");
	    	put("-...","b");
	    	put("-.-.","c");
	    	put("-..","d");
	    	put(".","e");
	    	put("..-.","f");
	    	put("--.","g");
	    	put("....","h");
	    	put("..","i");
	    	put(".---","j");
	    	put("-.-","k");
	    	put(".-..","l");
	    	put("--","m");
	    	put("-.","n");
	    	put("---","o");
	    	put(".--.","p");
	    	put("--.-","q");
	    	put(".-.","r");
	    	put("...","s");
	    	put("-","t");
	    	put("..-","u");
	    	put("...-","v");
	    	put(".--","w");
	    	put("-..-","x");
	    	put("-.--","y");
	    	put("--..","z");
	    	}
	    };
	    String[] strArr = letter.split(" ");
	    for (String mos : strArr) {
			answer += morse.get(mos);
		}
	    System.out.println(answer);
	    
	}
	
	

}
