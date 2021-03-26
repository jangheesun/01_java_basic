package step1_06.loop;

import java.util.Scanner;

public class LoopEx19_do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner scan = new Scanner(System.in);
			
			int num = 0;
			while ( num > 0 && num < 4) {
				System.out.print("숫자 입력(1,2,3) : ");
				num = scan.nextInt();
				
			}
			
			
			System.out.println("=====================");
			
			
			
			
			
			
			
			
			do {
				System.out.print("숫자 입력(1,2,3) : ");
				num = scan.nextInt();
			
			} while ( num > 0 && num < 4 );				//끝에 세미콜론들어가는것이 독특함
			
			
			scan.close();}

}
