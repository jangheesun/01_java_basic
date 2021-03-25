package step1_06.loop;

import java.util.Scanner;

/*21-03-25 16:17~16:29
 * # 최대값 구하기[2단계]
 * 
 * 1. 3회 반복을 하면서 정수를 입력받는다.
 * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
 * 
 */

public class LoopEx14_문제_실습O {

	public static void main(String[] args) {
		System.out.println( "세가지 숫자를 차례로 입력하세요.");
		Scanner scan = new Scanner(System.in);
		
		
				int x = scan.nextInt();
				int y = scan.nextInt();
				int z = scan.nextInt();
				
				if( x - y <= 0 ) 	{ if( y - z >= 0 ) System.out.println( "제일큰수는"+ y );
										else System.out.println( "제일큰수는"+ z );}
				
				else if ( x - y >= 0) {if ( x - z >= 0 ) System.out.println( "제일큰수는"+ x );
										else System.out.println( "제일큰수는"+ z );}
				
				
				
				
				
				
				
		scan.close();

	}

}

