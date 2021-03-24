package step1_05.controlStatement;

import java.util.Random;  //Random 타이핑 후 컨트롤스페이스 누르면 뜨는것.

/*
 * 
 * 랜덤 라이브러리 ( if문과 아무 관련이 없는데, if문을 공부할때 같이 있는 내용임 )
 * 랜덤을 알면 if문을 연습할게 많아짐
 * 라이브러리 == 기능 이라고 이해하면 좋다.
 * 
 */
public class ifEx13 {

	public static void main(String[] args) {
		// 0~9 사이의 랜덤 값
		Random ran = new Random();
		int rNum1 = ran.nextInt(10); // ran.nextInt(N) ---> 0 ~ N-1 까지 랜덤으로 나온다.
		System.out.println(rNum1);
		
		// 100~200 사이의 랜덤 값
		int rNum2 = ran.nextInt(101) + 100;	// [0~100] + 100;
		System.out.println(rNum2);
		
		// -3 ~ 3 사이의 랜덤 값
		int rNum3 = ran.nextInt(7) - 3;	//[0~6] - 3
		System.out.println(rNum3);
		
		
		/*
		 * scan.nextInt();
		 * ran.nextInt(범위);		-->범위넣어야하는거 헷갈리지않기
		 * 
		 */
	}

}
