package step1_02.variable;
/*
 * 변수의 생명주기 ( scope )
 * ♥박스안에서 끝난다.
 */

public class VarEx05 {

	public static void main(String[] args) {
	
		int x = 10;
		
		if (true) {
			int y = 7;
			System.out.println(x);
			System.out.println(y);  //중괄호를 벗어나면 접근이 안된다.
		//	System.out.println(z);
		}
		
		if (true) {
			int z = 3;
			System.out.println(x);
		//	System.out.println(y);	//빨간줄이 그어진다.
			System.out.println(z);
		}
		
		
		System.out.println(x);
	//	System.out.println(y);
	//	System.out.println(z);			//빨간줄이어디서그어지는지 확인해본다.
		

	}

}
