package lv0;

public class 외계어사전 {

	public static void main(String[] args) {
		String[] spell = {"z", "d", "x"}; 
		String[] dic = {"dez", "dww", "dzx", "loveaw"};
        //dic 을 한번 쪼개기
        //contains
        int answer = 2;
        for(int i = 0; i < dic.length; i++) {
        	int count = 0;
        	for(int j = 0; j < spell.length; j++) {
	        	if(dic[i].contains(spell[j])) {
	        		dic[i] = dic[i].replace(spell[j], " ");
	        		//System.out.println(dic[i]);
	        		count++;
	        	} 
	        }
        	System.out.println("count : "+count);
        	if(count >= spell.length) {
        		answer = 1;
        	}
        }
        System.out.println(answer);
	}

}
