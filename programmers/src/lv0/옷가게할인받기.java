package programmers.lv0;

public class 옷가게할인받기 {

	public static void main(String[] args) {
		int price = 153220;
		int answer = 0;
        
		if (100000 <= price && price < 300000) price *= 0.95;
        if (300000 <= price && price < 500000) price *= 0.90;
        if (500000 <= price) price *= 0.80;
        else answer = price;
        
        
        System.out.println(price);
	}

}
