package programmers.lv0;

public class 가위바위보 {

	public static void main(String[] args) {
		String rsp = "205";
		String answer = "";
        //가위 = 2 바위 = 0 보 = 5
        //String >> char[] >> char(i) 비교 >> char[] >> string
        
		char[] cArr = rsp.toCharArray();
		for(int i = 0; i < cArr.length; i++) {
			System.out.println(cArr[i]);
			if(cArr[i] == '2' ) answer += "0";
			else if(cArr[i] == '0' ) answer += "5";
			else if(cArr[i] == '5' ) answer += "2";
		}
		System.out.println(answer);
		
	}

}
