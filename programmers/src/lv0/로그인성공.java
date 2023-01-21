package lv0;

import java.util.Arrays;

public class 로그인성공 {
 
	public static void main(String[] args) {
		String[] id_pw = {"meosseugi", "1234"};
		String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
		String answer = "fail";
		
		// db배열 쪼개기
		// id_pw 매칭 되는지 확인
		
		for(int i = 0; i < db.length; i++) {
				if(id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1])){
						answer = "login";
				}else if(id_pw[0].equals(db[i][0]) && !id_pw[1].equals(db[i][1])) answer = "wrong pw";
			}
		System.out.println(answer);
		
	}
}
