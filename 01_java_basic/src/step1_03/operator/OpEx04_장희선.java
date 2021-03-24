package step1_03.operator;

// 포트폴리오를 위한 날짜와 걸린시간 입력 2021-03-18 15:26 ~ 15:52
public class OpEx04_장희선 {

	public static void main(String[] args) {
		
		//예) 점수가 60점 이상이면 true 출력
        int score = 30;
        System.out.println(score >= 60);
        
        
        //문제1) 15가 3의 배수이면 true 출력
        //힌트) 숫자를 3으로 나눈 나머지가 0이면 3의 배수
        int number = 15;
        System.out.println(number%3 == 0);
        
        //문제2) 100이 짝수이면 true 출력
        //힌트) 숫자를 2로 나눈 나머지가 0이면 짝수
        //      숫자를 2로 나눈 나머지가 1이면 홀수
        int a = 100;
        System.out.println(a%2 ==0);

        
        //문제3)아래돈중 1000원짜리 이상화폐를 제외한 1000원짜리가 3장 이상이면 true 출력
        int money = 178600;
        System.out.println((money-(money/10000)*10000)-((money-(money/10000)*10000)/5000)/1000>=3);
     
        
	}

}
