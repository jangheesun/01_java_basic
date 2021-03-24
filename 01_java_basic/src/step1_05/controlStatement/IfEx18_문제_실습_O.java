package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 가위바위보 게임
 * 
 *   if - else if , else 등 구문을 활용하여 자율적으로 작성해보자.
 *   
 *   0 : 가위 , 1 : 바위 , 2 : 보
 */

public class IfEx18_문제_실습_O {

	public static void main(String[] args) {
		

		System.out.println("가위는 0 바위는 1 보는 2를 입력하세요.");
		
		Scanner scan = new Scanner(System.in);
		int me = scan.nextInt();
		Random ran = new Random();
		int computer = ran.nextInt(3);
		
		
		if ( me == computer ) System.out.println("비김");
		else if ( me == 0 && computer == 1 ) System.out.println("짐");
		else if ( me == 1 && computer == 2 ) System.out.println("짐");
		else if ( me == 2 && computer == 0 ) System.out.println("짐");
		else System.out.println("이김");
	
		scan.close();
	}
	

}
