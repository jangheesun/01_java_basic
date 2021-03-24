package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 로그인[1단계]
 * 
 * 1. Id와 Pw를 입력받는다.
 * 2. 입력받은 데이터와 db데이터를 비교해 로그인 처리를 진행한다.
 * 예) 로그인 성공 or 로그인 실패
 */


public class IfEx04_문제_실습 {

	public static void main(String[] args) {
		
		int dbId = 1234;
		int dbPw = 1111;
		Scanner scan = new Scanner(System.in);
		System.out.println("Id와 Pw를 입력하세요.");
		int id = scan.nextInt();
		int pw = scan.nextInt();
		
		if (id == dbId && dbPw == pw ){ 
			System.out.println("로그인 성공");
		}
		if (id != dbId || dbPw != pw ){ 
			System.out.println("로그인 실패");
		}
			
		scan.close(); //잊어먹으니미리적는다.
	}

}
