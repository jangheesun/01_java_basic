package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # 구구단 게임[3단계]
 * 
 * 1. 구구단 게임을 5회 반복한다.
 * 2. 정답을 맞추면 20점이다.
 * 3. 게임 종료 후, 성적을 출력한다.
 * 
 */


public class LoopEx04_문제_실습O {

	public static void main(String[] args) {
		
		System.out.println("구구단게임을 5회 합니다. 입력하세요.");
		System.out.println("맞추면 +20점입니다.");
		Scanner scan = new Scanner(System.in);
		
		int i = 1 ;
		int score = 0;
		
		while ( i <= 5 ) {
		
		Random ran = new Random();
		int num1 = ran.nextInt(8) + 2;
		int num2 = ran.nextInt(9) + 1;
		System.out.println(num1 + " X " + num2 + " = ");
		
		int me = scan.nextInt();
			if ( num1 * num2 == me ) score += 20 ;
				
		i = i+1;
		
		}
		System.out.println("점수는 "+score+"점 입니다.");
		
		
		scan.close();
	}

}
