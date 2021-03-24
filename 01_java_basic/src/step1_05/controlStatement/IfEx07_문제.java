package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 성적 유효성 검사
 * 
 * 1. 성적을 입력받는다.
 * 2. 성적이 60점 이상이면 합격, 60점 미만이면 불합격이다.
 * 3. 단, 입력받은 성적이
 *    음수이거나 100점을 초과하면, 예외 메세지를 출력한다.
 *    예) 성적을 잘못 입력했습니다.
 */

public class IfEx07_문제 {

	public static void main(String[] args) {
		
		System.out.println("성적을 입력받습니다.");
		
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		if(score >= 60 && score <= 100 ){ 
			System.out.println("합격하셨습니다.");
			
		}
		if(score < 60 && score >= 0 ) {
			System.out.println("불합격하였습니다.");
		}
		
		if(score < 0 || score > 100 ) {
			System.out.println("올바른 점수 형태가 아닙니다.");
		}
				
				
				scan.close();
		
	}

}
