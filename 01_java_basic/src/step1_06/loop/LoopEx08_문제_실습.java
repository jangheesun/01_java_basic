package step1_06.loop;

import java.util.Scanner;

/* 21-03-23 17:32~17:58
 * # ATM[2단계]
 * 
 * identfier 변수가 -1 이면 로그아웃 상태이고
 * 				     1 이면 dbAcc1유저가 로그인한 상태이며
 * 				     2 이면 dbACcc2유저가 로그인한 상태이다.
 *  
 * 
 * 1. 로그인
 *  - dbAcc1유저 및 dbAcc2유저가 로그인 후 다시 로그인을 누를경우 '현재 000 유저님 로그인중' 출력
 * 	- 로그아웃 상태에서만 이용 가능
 * 		> 로그인 되었습니다. '000 유저님 환영합니다.' 출력
 * 2. 로그아웃
 *  - 로그 아웃 상태에서 진행시 '로그인 이후 이용해주세요' 출력
 * 	- 로그인 후 이용가능 ' 로그아웃 되었습니다.' 출력
 * 
 */

public class LoopEx08_문제_실습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		
		int identifier = -1;						// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		boolean isRun = true;

		System.out.println("==1.로그인   ==");
		System.out.println("==2.로그아웃 ==");
		System.out.println("==0.종료     ==");
		System.out.print("메뉴 선택 : ");		
		while (isRun) {
			
		
			int selectMenu = scan.nextInt();
			
			if (selectMenu == 1) { System.out.println("ID를 입력하세요.");
									int personId = scan.nextInt();
							       System.out.println("PW를 입력하세요.");
							        int personPw = scan.nextInt();

					if (personId == dbAcc1 && personPw == dbPw1 ) {{if ( identifier == 1 ) System.out.println("1번유저님 로그인중. 로그인할 수 없습니다.");
												else System.out.println("1번유저님 환영합니다."); identifier = 1 ;}}
						
						
				
					else if (personId == dbAcc2 && personPw == dbPw2 ) {{if ( identifier == 2 ) System.out.println("2번유저님 로그인중. 로그인할 수 없습니다.");
												else System.out.println("2번유저님 환영합니다."); identifier = 2 ;}}
					
					else System.out.println("틀렸습니다. 다시 입력하세요."); 
					
					
				
					}
			else if (selectMenu == 2) {int ideentifier = -1 ; System.out.println("로그인 후 이용해주세요.");}
			else if (selectMenu == 0) {
				isRun = false;
				System.out.println("프로그램 종료");
			}
		}

		scan.close();
	}

}
