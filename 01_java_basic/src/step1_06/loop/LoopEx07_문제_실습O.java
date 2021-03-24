package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

//21-03-23- 17:11~ 17:31
/*
 * # Up & Down 게임[2단계]
 * 
 * 1. 1 ~ 100까지의 난수를 생성한다.
 * 2. 스캐너를 이용해 정답을 맞추기를 시도하고 정답을 맞출경우 게임은 종료된다.
 * 3. 점수는 100점부터 시작해서 오답을 입력할 때마다 5점씩 차감된다.
 * 4. 게임 종료 후, 점수를 출력한다.
 * 
 */

public class LoopEx07_문제_실습O {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		
		int score = 0;
		int i = -1;
		
		while( i < 0 ) {
			int me = scan.nextInt();
			int comNumber = ran.nextInt(100) + 1;
			if( me != comNumber) i = -1;
			else i = 0;
			
			score -= 5 ;
			System.out.println("컴퓨터:"+ comNumber);
			System.out.println("나:"+ me);
			System.out.println("점수:"+ score);
		}
		

		
	}

}
