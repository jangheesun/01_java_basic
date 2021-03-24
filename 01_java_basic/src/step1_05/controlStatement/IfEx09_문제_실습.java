package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 놀이기구 이용제한
 * 
 * 1. 키를 입력받는다.
 * 2. 입력받은 키가 120 이상이면, 놀이기구를 이용할 수 있다.
 * 3. 키가 120 미만이면, 놀이기구를 이용할 수 없다.
 * 4. 단, 부모님과 함께 온 경우 놀이기구 이용이 가능하다.
 *    예) 부모님과 함께 오셨나요?(yes:1, no:0)
 */


public class IfEx09_문제_실습 {

	public static void main(String[] args) {
		System.out.println("#놀이기구 이용제한 안내");
		System.out.println("키가 120이상이어야 이용가능합니다.");
		System.out.println("키가 120미만이면 놀이기구를 이용할 수 없습니다.");
		
		System.out.println("키가 몇인지 입력하세요.");
		Scanner scan = new Scanner(System.in);
			int height = scan.nextInt();
			
		System.out.println("부모님이랑 같이왔으면 1 아니면 0을 입력하세요.");
			int x = scan.nextInt();
			
			if (height < 120 && x == 0) {
				System.out.println("탑승불가");
			}
			if (height >=120 || x == 1) {
				System.out.println("탑승가능");
			}
		
		
		
		scan.close();
		
		
		
		
	
	}

}
