package step1_04.inputFunction; //입력기능이라는뜻

import java.util.Scanner; //Scanner 기능을 쓰겠다는 선언문이 생긴다 

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

/*
 * #콘솔에 키보드로 입력받기
 * 
 */

public class inputEx01 { //예제1번이라는뜻

	public static void main(String[] args) {
		//Scanner 사용문법, 시작할때 맨 위에서 한번만 생성하면 된다.
		Scanner scan = new Scanner(System.in); //Scanner 쓰고나서 컨트롤 스페이스를 누르면(추천)
		
		System.out.print("#나이를 입력하세요 : ");
		int getAge = scan.nextInt(); 
		
		System.out.println("입력하신 나이는 : " + getAge + "살 입니다.");
		System.out.println("내년 나이는 : " + (getAge + 1) + "살 입니다.");
		System.out.println("5년 뒤 나이는 : " + (getAge + 5 ) + "살 입니다.");
		
		
		scan.close(); //코드의 맨 마지막에 딱 한번만 작성한다. 중간에 쓰면 또 다시 열어야 한다.
		
		
	}

}
