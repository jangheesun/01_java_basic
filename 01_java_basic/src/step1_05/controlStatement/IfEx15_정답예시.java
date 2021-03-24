package step1_05.controlStatement;

import java.util.Random;

/*
 * # 당첨복권[1단계] 
 * 
 * 30%의 확률로 화면에 '당첨'이라는 글자가 화면에 출력된다.
 * 당첨되지 않은 경우는 '꽝'이라는 글자가 화면에 출력된다.
 */

//그냥 F11누르면 입력할필요없이바로실행되는군

public class IfEx15_정답예시 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int rNum = ran.nextInt(10);
		
		if (rNum < 3) 	System.out.println("당첨");
		if (rNum >= 3) 	System.out.println("꽝");
		
	}

}
