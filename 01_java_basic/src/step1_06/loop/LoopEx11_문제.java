package step1_06.loop;

import java.util.Scanner;

/*21-03-25 15:08 ~15:41
 * # 베스킨라빈스31
 * ssdfsdfsdf
 * 1. p1과 p2가 번갈아가면서 1~3을 입력한다.
 * 2. br은 p1과 p2의 입력값을 누적해서 저장한다.
 * 3. br이 31을 넘으면 게임은 종료된다.
 * 4. 승리자를 출력한다.
 * 
 * 예) 
 * 1턴 : p1(2)	br(2)
 * 2턴 : p2(1)	br(3)
 * 3턴 : p1(3)	br(6)
 * ...
 */


public class LoopEx11_문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int p1 = 0;
		int p2 = 0;
		
		
		int turn = 0;
		int br = 0;
		while ( br < 31 ) {
			if (turn % 2 == 0 )
			System.out.println("p1님 입력하세요.");	
			int x = scan.nextInt();
			p1 += x ;
			br += x ;
			turn++ ;
			System.out.println("누적 수치" + br );
			if ( br < 31 ) {
				if (turn % 2 == 1)
				System.out.println("p2님 입력하세요.");	
				int y = scan.nextInt();
				p2 += y ;
				br += y ;
				turn++ ;
				System.out.println("누적 수치" + br );
			}
										
		}
		if (turn % 2 == 0 ) System.out.println("p1승리");
		if (turn % 2 == 1 ) System.out.println("p2승리");
		System.out.println("종료");
		
		scan.close();
		

	}

}
