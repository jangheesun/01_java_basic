package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 코인 게임
 * 
 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
 * 3. 동전의 앞뒷면을 맞추는 게임이다.
 */

public class IfEx14_문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("앞면이면 0 뒷면이면 1 입력");
		int x = scan.nextInt();
		
		Random ran = new Random();
		int coin = ran.nextInt(2);

		if( x == coin ) System.out.println("맞았습니다.");
		
		if( x != coin ) System.out.println("틀렸습니다.");
		

		scan.close();
		

	}

}
