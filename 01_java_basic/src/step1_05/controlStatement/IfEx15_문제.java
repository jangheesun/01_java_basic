package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;
import java.util.Scanner;
/*
 * # 당첨복권[1단계] 
 * 
 * 30%의 확률로 화면에 '당첨'이라는 글자가 화면에 출력된다.
 * 당첨되지 않은 경우는 '꽝'이라는 글자가 화면에 출력된다.
 */


public class IfEx15_문제 {
	
	public static void main(String[] args) {
	System.out.println("30%확률로 당첨되는 복권, 1부터 10까지중 1개 입력후 엔터누르세요.");
	Scanner scan = new Scanner(System.in);
	int me = scan.nextInt();
	
	
	Random ran = new Random();
	int x = ran.nextInt(10) + 1;
	
	if( me == x ) System.out.println("당첨");
	if( me != x ) System.out.println("꽝");
	
	
	
	
	
	scan.close();
	
		
	}

}
