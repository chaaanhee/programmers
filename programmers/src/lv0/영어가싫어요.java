package lv0;

public class 영어가싫어요 {

	public static void main(String[] args) {
		String numbers = "onefourzerosixseven";
		long answer = 0;
		//numbers에 숫자가 포함되어있다면
		//숫자값을 추출해서 숫자로 변경해라
		
				numbers = numbers.replace("zero", "0");
				numbers = numbers.replace("one", "1");
				numbers = numbers.replace("two", "2");
				numbers = numbers.replace("three", "3");
				numbers = numbers.replace("four", "4");
				numbers = numbers.replace("five", "5");
				numbers = numbers.replace("six", "6");
				numbers = numbers.replace("seven", "7");
				numbers = numbers.replace("eight", "8");
				numbers = numbers.replace("nine", "9");

		answer = Long.valueOf(numbers);
		
		System.out.println(answer);
		
	}

}
