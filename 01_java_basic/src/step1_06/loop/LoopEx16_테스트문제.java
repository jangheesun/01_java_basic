package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*21-03-25 17:05~
 * # 카카오 택시
 * 
 * 1. 손님을 태워 목적지까지 이동하는 게임이다.
 * 2. -10~10 사이의 랜덤 숫자 2개를 저장해 목적지로 설정한다.
 * 3. 메뉴는 아래와 같다.
 * 		1) 방향설정 : 동(1)서(2)남(3)북(4)
 * 		2) 속도설정 : 1~3까지만 가능
 * 		3) 이동하기 : 설정된 방향으로 설정된 속도만큼 이동
 * 4. 거리 2칸 당 50원씩 추가되어 요금도 출력한다.
 * 예) 1(50) 2(50) 3(100) 4(100) ...
 * 
 * 
 * 
 */

public class LoopEx16_테스트문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
				
		// 목적지(destination)

		int desX = ran.nextInt(21)-10;
		int desY = ran.nextInt(21)-10;
		
		// 방향(direction)
		int dir = 0;
		
		// 속도
		int speed = 0;
		
		// 현재 위치1
		int x = 0;
		int y = 0;
		
		// 요금
		int fee = 0;
		
		boolean isRun = true;
		
		System.out.println("= 카카오 택시 =");
		System.out.println("목적지 : " + desX + "," + desY);
		
		System.out.println("방   향 : " + dir);
		System.out.println("속   도 : " );
		System.out.println("============");
		
		System.out.println("1.방향설정");
		System.out.println("2.속도설정");
		System.out.println("3.이동하기");
		while (isRun) {
			
			
			System.out.print("메뉴 선택 : ");
			int selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {
								System.out.println("(1)동(2)서(3)남(4)북");
								int meIn = scan.nextInt();
								dir = meIn;

			}
			if (selectMenu == 2) {
								System.out.println("1~3중 선택");
								int inSpeed = scan.nextInt();
									 if (inSpeed == 1)	{
															 if ( dir == 1 ) x += 1;
														else if ( dir == 2 ) x -= 1;
														else if ( dir == 3 ) y -= 1;
														else if ( dir == 4 ) y += 1;
									  					}
								else if (inSpeed == 2)	{
															 if ( dir == 1 ) x += 2;
														else if ( dir == 2 ) x -= 2;
														else if ( dir == 3 ) y -= 2;
														else if ( dir == 4 ) y += 2;
									  					}
								else if (inSpeed == 3)	{
															 if ( dir == 1 ) x += 3;
														else if ( dir == 2 ) x -= 3;
														else if ( dir == 3 ) y -= 3;
														else if ( dir == 4 ) y += 3;
														}
									
								
			}
			else if (selectMenu == 3) {
										System.out.println("▶현위치 : " + x + "," + y);
										System.out.println();
									  }
			
		}

	}

}
