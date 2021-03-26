package step1_06.loop;


public class LoopEx18_문제 {

	public static void main(String[] args) {
		

		// 문제 1) 1부터 5까지 출력
		// 정답 1) 1, 2, 3, 4, 5
		System.out.println("(답1)");
		for ( int x = 1 ; x <= 5 ; x ++ ) {
			System.out.println(x);
		}

		// 문제 2) 1부터 10까지 반복해 5~9까지 출력
		// 정답 2) 5, 6, 7, 8, 9
		System.out.println("(답2)");
		for (int y = 1 ; y <= 10 ; y ++) {
			if( y >=5 && y<=9 ) System.out.println(y);
		}
		
		// 문제 3) 10부터 1까지 반복해 6~3까지 출력
		// 정답 3) 6, 5, 4, 3
		System.out.println("(답3)");
		for (int z = 10 ; z >= 1 ; z --) {
			if ( z >= 3 && z <= 6 ) System.out.println(z);
		}

		// 문제 4) 1부터 10까지 반복해 3미만 7이상 출력
		// 정답 4) 1, 2, 7, 8, 9, 10
		System.out.println("(답4)");
		for ( int m = 1 ; m <= 10 ; m ++) {
			if ( m < 3 || m >= 7 ) System.out.println(m);
		}
		
	}

}
