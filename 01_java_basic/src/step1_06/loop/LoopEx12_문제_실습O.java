package step1_06.loop;

/*21-03-25 15:41~15:52
 * # 369게임[2단계]
 * 
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 * 
 */

public class LoopEx12_문제_실습O {

	public static void main(String[] args) {
		
		int i = 1 ;
		while ( i <= 50 ) {
			
			if	( i % 10 == 0 )
					System.out.println("답 : " + i);	//10단위수에서 오류나서 추가함
			else if (  i / 10   == 3 && i % 10 % 3 == 0  )
					System.out.println("답 : 짝짝");
			else if (  i / 10 == 3 || i % 10 % 3 == 0  )
					System.out.println("답 : 짝");
			else
					System.out.println("답 : " + i);
					i++;
			 
		}
	}

}
