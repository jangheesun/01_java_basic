package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 당첨복권[1단계] 
 * 
 * 30%의 확률로 화면에 '당첨'이라는 글자가 화면에 출력된다.
 * 당첨되지 않은 경우는 '꽝'이라는 글자가 화면에 출력된다.
 */


public class IfEx15_문제_실습O {

	public static void main(String[] args) {
	System.out.println("30%확률로 당첨되는 복권 결과는");

	
	
	Random ran = new Random();
	int ranNum = ran.nextInt(10);
	
	if (ranNum < 3 ) System.out.println("당첨");
	if (ranNum >= 3 ) System.out.println("꽝");
	
	
	System.out.println("입니다.");
	
	
		
	}

}
