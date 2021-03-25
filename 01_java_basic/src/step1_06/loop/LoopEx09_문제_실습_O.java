package step1_06.loop;

import java.util.Scanner;

/*21-03-24 17:14~17:33
 * # ATM[2단계]
 * 
 * 1. 입금
 * . 입금할 금액을 입력받아, myMoney에 입금
 * 2. 출금
 * . 출금할 금액을 입력받아, myMoney에서 출금
 * . 단, 출금할 금액이 myMoney 잔액을 초과할 경우 출금불가
 * 3. 이체
 * . yourAcc 계좌번호를 입력받아, 이체
 * . 이체할 금액이 myMoney 잔액을 초과할 경우 이체 불가
 * . 이체 후 yourMoney 잔액 증가
 * 4. 조회
 * . myMoney와 yourMoney 잔액 모두 출력
 * 
 */

public class LoopEx09_문제_실습_O {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int myAcc = 1111;
		int myMoney = 50000;
		
		int yourAcc = 2222;
		int yourMoney = 70000;	
		
		boolean isRun = true;
		while(isRun) {
			
			System.out.println("1.입금");
			System.out.println("2.출금");
			System.out.println("3.이체");
			System.out.println("4.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {
				System.out.println("입금할 금액을 입력하세요.");
				int moneyIn = scan.nextInt();
				myMoney += moneyIn;
				System.out.println("계좌잔액은 " + myMoney + "입니다.");
				
			}
			else if (selectMenu == 2) {
				System.out.println("출금할 금액을 입력하세요.");
				int moneyOut = scan.nextInt();
				myMoney -= moneyOut;
				System.out.println("계좌잔액은 " + myMoney + "입니다.");
			}
			else if (selectMenu == 3) {
				System.out.println("이체할 계좌를 입력하세요.");
				int moneyGo = scan.nextInt();
				System.out.println("이체할 금액 입력하세요.");
				int moneyOut = scan.nextInt();
					if ( moneyOut > myMoney ) System.out.println("잔액이 부족합니다.");
					else System.out.println("이체성공");
					System.out.println("계좌잔액은 " + myMoney + "입니다.");			//else if 내의 중첩if는 중괄호 안써도됨.
																						// if는 한줄이상쓸거면 중괄호 꼭써야함
			}
			else if (selectMenu == 4) {
				System.out.println("나의 계좌 잔액 : " + myMoney + "원");
				System.out.println("상대 계좌 잔액 : " + yourMoney + "원");
			}
			else if (selectMenu == 0) {
				isRun = false;
				System.out.println("프로그램 종료");
			}
		}

		scan.close();
		
	}

}
