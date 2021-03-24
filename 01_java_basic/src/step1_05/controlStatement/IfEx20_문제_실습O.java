package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 가운데 숫자 맞추기 게임
 * 
 * 1. 150~250 사이의 랜덤 숫자 저장
 * 2. 랜덤 숫자의 가운데 숫자를 맞추는 게임이다.
 * 예)
 * 		249	: 4
 * 	    123 : 2
 * 		771 : 7
 */

public class IfEx20_문제_실습O {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		int ranNum = ran.nextInt(101) + 150 ;
		
		System.out.println("150~250숫자의 가운데 숫자를 맞춰봅니다.");
		
		int meNum = scan.nextInt();
		
		if( ranNum%100/10 == meNum ) System.out.println("OK");
		else System.out.println("No");
		
		System.out.println("랜덤 숫자는 "+ ranNum + " 이었습니다.");
		
		
		scan.close();
		
		
		
	}

}
