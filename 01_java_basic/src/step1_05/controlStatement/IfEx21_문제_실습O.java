package step1_05.controlStatement;

import java.util.Random;

/*
 * # 369게임[1단계]
 * 
 * 1. 1~50 사이의 랜덤 숫자를 저장한다.
 * 2. 위 수에 369의 개수가
 * 	1) 2개이면, 짝짝을 출력
 *  2) 1개이면, 짝을 출력
 *  3) 0개이면, 해당 숫자를 출력
 * 예)
 * 		33	 : 짝짝
 * 		16	 : 짝
 * 		 7	 : 7
 */

public class IfEx21_문제_실습O {

	public static void main(String[] args) {
		Random ran = new Random();
		
		
		System.out.println("369게임! 몇번 박수를 칠지 결정합니다.");
		int ranNum = ran.nextInt(50) + 1 ;
		
		System.out.println(ranNum);
		
		if( ranNum%10 == 3 || ranNum%10 == 6 || ranNum%10 == 9) System.out.print("(짝)");
		if( ranNum/10 == 3 ) System.out.print("(짝)");
		
	}

}
