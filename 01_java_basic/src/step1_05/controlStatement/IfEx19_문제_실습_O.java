package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # ATM[1단계] : 이체하기
 * 
 * 1. 이체할 계좌번호를 입력받는다.
 * 2. 계좌번호가 일치하면,
 * 3. 이체할 금액을 입력받는다.
 * 4. 이체할 금액 <= myMoney	: 이체가능
 * 			myMoney   - 이체할 금액
 * 			yourMoney + 이체할 금액
 *    이체할 금액  > myMoney 	: 이체불가
 */

public class IfEx19_문제_실습_O {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);			//위로정리해줘야좋음
		
		int myAcc = 1234;
		int myMoney = 8700;
		
		int yourAcc = 4321;
		int yourMoney = 12000;
		
		System.out.println("myMoney = " + myMoney + "원");
		System.out.println("yourMoney = " + yourMoney + "원");
		System.out.println("이체할 상대방의 계좌를 입력하세요.");
		
		
		int meTyping = scan.nextInt();
		
		if( meTyping == yourAcc ) System.out.println("계좌가 일치합니다. 보낼 금액을 입력하세요.");
		else System.out.println("틀렸습니다. 초기화면으로 이동합니다.");
		
		int meTyping2 = scan.nextInt();
		
		if ( myMoney - meTyping2 >= 0 ) {
			System.out.println("이체가 가능합니다. 이체를 시작합니다.");
			System.out.println("이체결과");
			System.out.println("myMoney = " + (myMoney - meTyping2) + "원");
			System.out.println("yourMoney = " + (yourMoney + meTyping2) + "원");
		}
		
		else if  ( myMoney -  meTyping2 < 0 ) {System.out.println("잔액이 부족합니다. 초기화면으로 이동합니다.");
		}
		scan.close();
		
	}

}
