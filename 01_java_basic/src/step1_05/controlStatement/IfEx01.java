package step1_05.controlStatement;

public class IfEx01 {

	public static void main(String[] args) {
		
		if (true) {
			System.out.println("실행 0"); // if문 안의 명령어는 tab으로 들여쓰기 한다. 무언가에속해있을때는 tab. 띄어쓰기(X)
		}
		
		if (false) {
			System.out.println("실행 0"); // if문 안의 명령어는 tab으로 들여쓰기 한다. 무언가에속해있을때는 tab. 띄어쓰기(X)
		}
		
		int number = 7;
		
		if (number % 2 == 0) {
			System.out.println("짝수");   //if문이 한줄일경우 {}를 생략할 수 있다. if (number % 2 == 0) System.out.println("짝수"); 이렇게 한줄로 써버린다. 
		}
		if (number % 2 == 1) {
			System.out.println("홀수");
		}
	
		if (number % 2 == 1) {
			System.out.println("홀수");
		}

	
		
}
}

/*제어문
if, if else, if else if
+ switch case ★★★★★★★★
분기문, 반복문, 함수(메서드)
if, else, else if / for while do~while / 함수 프로그래밍 방법
	*/
	