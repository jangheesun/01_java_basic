package step1_06.loop;

import java.util.Scanner;

/*
 * # 영수증 출력[2단계]
 * 1. 5번 주문을 받는다.
 * 2. 주문이 끝난 후, 돈을 입력받는다.
 * 3. 각 메뉴별 주문수량과 총금액을 출력한다.
 * 
 * 예)
 * 메뉴 선택 : 1
 * 메뉴 선택 : 1
 * 메뉴 선택 : 2
 * 메뉴 선택 : 2
 * 메뉴 선택 : 3
 * 총 금액 = 31300원
 * 현금 입력 : 32000
 * === 롯데리아 영수증 ===
 * 1. 불고기  버거 : 2개
 * 2. 새우    버거 : 2개
 * 3. 콜        라 : 1개
 * 4. 총   금   액 : 31300원
 * 5. 잔        돈 : 700원
 */


public class LoopEx05_문제 {

	public static void main(String[] args) {
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		int i = 1;
		int priceSum = 0;
		int x = 0;
		int y = 0;
		int z = 0;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우   버거 : " + price2 + "원");
		System.out.println("3.콜       라 : " + price3 + "원");
		System.out.println();
		System.out.println("5개를 주문합니다. 메뉴 번호를 입력하세요.");
		
		Scanner scan = new Scanner(System.in);
		while ( i <= 5 ) {
				
			int order = scan.nextInt();
			i++;
			if (order == 1) { priceSum += price1; x++;}
			if (order == 2) { priceSum += price2; y++;}
			if (order == 3) { priceSum += price3; z++;}
		}
		
			System.out.println("지불할 금액을 입력하세요.");
			int myMoney = scan.nextInt();
			
			
			System.out.println("=== 롯데리아 영수증 ===");
			System.out.println("1.불고기  버거 : "+x +"개");
			System.out.println("2.새우    버거 : "+y +"개");
			System.out.println("3.콜        라 : "+z +"개");
			System.out.println("4.총   금   액 : " + priceSum + "원");
			System.out.println("5.잔        돈 : " + (myMoney - priceSum) + "원");
	
		
		
		scan.close();
		

	}

}
