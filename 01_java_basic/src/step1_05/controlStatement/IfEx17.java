package step1_05.controlStatement;

public class IfEx17 {

	public static void main(String[] args) {
	
		int finalScore = 61;	
		
		
		
		
		if (finalScore >= 60) {							//1안
			System.out.println("합격");
		}
		if (finalScore < 60) {
			System.out.println("불합격");
		}
		
		
		
		
		
		
		
		
		
		if (finalScore >= 60) {							//2안
			System.out.println("합격");					//조건식이 true일때 수행할 명령어
		}
		else {
			System.out.println("불합격");				//조건식이 false일때 수행할 명령어
		}												//if가여러개이고 else가 하나일때 가장가까운 if와 짝을 이룬다.
														//if와 else 사이에 명령어를 쓸 수 없다.
														//else는 여러개를 쓰지 않는다.

		
		
		
		System.out.println();
		finalScore = 95;
		if (finalScore > 90) {
			System.out.println("A점수");			
		}
		else if (finalScore > 80) {
			System.out.println("B점수");
			
		}
		else if (finalScore>70) {
			System.out.println("C점수");					//A/B/C순서를 거꾸로하면 출력이 이상하게 된다.
		}
		
		
		
		
	}

}
