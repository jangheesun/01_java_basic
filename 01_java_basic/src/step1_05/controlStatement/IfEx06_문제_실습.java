package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 구구단 게임[1단계]
 * 
 * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 입력받는다.
 * 2. 입력받은 숫자를 토대로 구구단 문제를 출력한다.
 * 예)	3 x 7 = ?
 * 3. 문제에 해당하는 정답을 입력받는다.
 * 4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
 */


public class IfEx06_문제_실습 {

	public static void main(String[] args) {
		System.out.println("A와 B를 곱합니다.");
		System.out.println("A값과 B값을 순서대로 입력하세요.");
		
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		System.out.println("그 둘을 곱한 값은 얼마인가요?");
		int z = scan.nextInt();
		
		if (x * y == z) {
			System.out.println("정답");
		}
		if (x * y != z) {
			System.out.println("땡");
		}
		
		
		
		
		scan.close();
		

	}

}
