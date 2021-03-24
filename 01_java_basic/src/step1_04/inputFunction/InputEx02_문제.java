package step1_04.inputFunction;

import java.util.Scanner;

public class InputEx02_문제 {

	public static void main(String[] args) {
		/*
		 * 
		 * # 콘솔에 키보드로 입력받기
		 * 
		 * [ 순서 중요 ]
		 * 
		 * 1) import java.util.Scanner;  				// Scanner클래스를 불러온다.
		 * 2) Scanner scan = new Scanner(System.in);    // scan 객체를 생성한다.
		 * 3) System.out.println("#나이 입력: ");       // 안내문을 작성한다.
		 * 4) scan.nextInt();                           // 키보드로 입력받는다.(숫자)
		 * 5) scan.close();								// scan을 다 사용한 코드 뒤에 작성한다. 하지만 맨처음부터 입력해놓는게 좋다.
		 * 
		 * */
		// 문제1) 숫자 2개를 입력받아서 합 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("#숫자 2개를 입력하여 합을 출력합니다.");
		System.out.println("첫 번째 숫자를 입력하세요.");
	
		int oneNumber = scan.nextInt();
		System.out.println("두 번째 숫자를 입력하세요.");
		int twoNumber = scan.nextInt();
		
		System.out.println("두 숫자의 합은" + (oneNumber + twoNumber) + "입니다.");
		
		
		// 문제2) 숫자 1개를 입력받아서 , 홀수이면 true 출력
		//Scanner scan = new Scanner(System.in);
		//System.out.println("#홀수면 true, 짝수면 false가 출력됩니다.");
		//int firstNumber = scan.nextInt();
		//System.out.println("결과는" + firstNumber%2 == 0 + "입니다.");
		
		
		// 문제3) 성적을 입력받아, 60점 이상이고 100점 이하이면 true 출력
	//	System.out.println("60점 이상이면 합격(true), 60점 미만이면 불합격(false)입니다.")
	//	System.out.println("점수를 입력하세요")
	//	int testNumber = scan.nextInt();
	//	System.out.println( (testNumber >= 60) + "입니다.");
		scan.close();
		
	}
	
}
