package step1_06.loop;

//# 반복문 기본문제[2단계]

public class LoopEx03_문제_실습O {

	public static void main(String[] args) {
		
		// 문제1) 1~5까지의 합 출력
		// 정답 1) 15
		
		// 문제2) 1~10까지 반복해 3미만 7이상만 출력
		// 정답2) 1, 2, 7, 8, 9, 10
		
		// 문제3) 문제2의 조건에 맞는 수들의 합 출력
		// 정답3) 37
		
		// 문제4) 문제2의 조건에 맞는 수들의 개수 출력
		// 정답4) 6
	
		System.out.println("(문제1번) 1~5까지의 합");
		
		int i = 1;
		int sum = 0;
		while ( i <= 5 ) {
			sum = sum + i ;
			i = i + 1 ;
		}
		System.out.println( sum );
		
		
		System.out.println("(문제2번)3미만 7이상만 출력");
		
		i = 1;
			while ( i <= 10 ) {
				if ( i < 3  || i >=7 ) System.out.print(i+",");
				i = i + 1 ;
			}
		
			
		System.out.println();	
		System.out.println("(문제3번)문제2의 조건에 맞는 수들의 합 출력");
		
		i = 1;
		sum = 0;
		while ( i <= 10 ) {
			if ( i < 3  || i >=7 ) { sum = sum + i ; }
			i = i + 1 ;
			
		}
		System.out.println(sum);
		
		
		
		System.out.println("(문제4번)문제2의 조건에 맞는 수들의 개수 출력");
		
		i = 1;
		int countNum = 0;
		while ( i <= 10 ) {
			if ( i < 3  || i >=7 ) { countNum = countNum + 1 ; }
			i = i + 1 ;
			
		}
		System.out.println(countNum + "개");
				
		

	}

}
