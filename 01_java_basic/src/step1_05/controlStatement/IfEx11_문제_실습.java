package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 영수증 출력[1단계]
 * 
 * 1. 메뉴판을 출력한다.
 * 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
 * 3. 현금을 입력받는다.
 * 4. 입력받은 현금과 메뉴가격을 확인해, 영수증을 출력한다.
 * 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
 */


public class IfEx11_문제_실습 {

	public static void main(String[] args) {
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("메뉴 1번 불고기 버거 : " + price1 + "원");
		System.out.println("메뉴 2번 새우   버거 : " + price2 + "원");
		System.out.println("메뉴 3번 콜       라 : " + price3 + "원");

		System.out.println("주문하고자 하는 메뉴의 '숫자만' 입력하세요.");
		Scanner scan = new Scanner (System.in);
		int price = scan.nextInt();
		
		System.out.println("지불한 금액을 입력하세요.");
		int money = scan.nextInt();
		if ( (money - price3) >= 0 ) {
			
			if ( price == 1 ) {
				System.out.println("거스름돈은 " + ( money - price1 ) + "원 입니다.");
			
			}
		
			if ( price == 2 ) {
				System.out.println("거스름돈은 " + ( money - price2 ) + "원 입니다.");
			}
			if ( price == 3 ) {
				System.out.println("거스름돈은 " + ( money - price3 ) + "원 입니다.");
			}
		
		
		}
		if( (money - price3) < 0 ) {
			System.out.println("잔액이 부족합니다.");
		}
		
		scan.close();
		

	}

}
