package step1_06.loop;

import java.util.Random;

/*21-03-25 16:32~16:43
 * # 랜덤학생
 * 
 * 1. 10회 반복을 한다.
 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
 * 3. 성적이 60점 이상이면 합격생이다.
 * ---------------------------------------
 * . 전교생(10명)의 총점과 평균을 출력한다.
 * . 합격자 수를 출력한다.
 * . 1등 학생의 번호와 성적을 출력한다.
 * 
 */

public class LoopEx15_문제_실습O {

	public static void main(String[] args) {
		
		int habNum = 0;
		int sumScore = 0;
		int i = 1 ;
		int maxScore = 0;
		int firstStudent = 0;
		
		while (i <= 10) {
					Random ran = new Random();
					int score = ran.nextInt(100)+1;
					System.out.print(score + " ");
						if ( maxScore <= score ) {
												maxScore = score;
												firstStudent = i ;
												}
						
					sumScore += score;

						if (score>=60) habNum++;
						i++;
			}
		System.out.println();
		System.out.println("점수총합 : "+ sumScore );
		System.out.println("점수평균 : "+ ( sumScore / 10.0 ) );
		System.out.println("합격생수 : "+ habNum );
		System.out.println(" 1등학생 : "+ firstStudent +"번" );
		System.out.println("최고득점 : "+ maxScore );
		
	}

}
