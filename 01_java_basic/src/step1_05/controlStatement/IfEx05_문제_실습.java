package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 로그인[2단계]
 * 
 * 1. Id와 Pw를 입력받아 회원가입을 진행한다.
 * 2. 이후 로그인을 위해 다시 Id와 Pw를 입력받는다.
 * 3. 가입 후 저장된 데이터와 로그인 시 입력받은 데이터를 비교한다.
 * 예) 로그인 성공 or 로그인 실패
 */


public class IfEx05_문제_실습 {

	public static void main(String[] args) {
		
		int dbId = 0;
		int dbPw = 0;
		System.out.println("id와 pw를 입력받아 회원가입 합니다.");
		
		Scanner scan = new Scanner(System.in);
		int id = scan.nextInt();
		int pw = scan.nextInt();
		dbId = id;
		dbPw = pw;
		
		System.out.println("id와 pw를 입력하여 로그인 합니다.");
		int idd = scan.nextInt();
		int pww = scan.nextInt();
		
		if(idd == id && pww == pw) {
			System.out.println("로그인 성공");
		}
		
		if(idd != id || pww != pw) {
			System.out.println("로그인실패");
		}
		
		
		
		
		scan.close();
	}

}
