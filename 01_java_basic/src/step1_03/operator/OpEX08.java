package step1_03.operator;
/*
 * 
 * 삼항 연산자  : IF ELSE 쓰기 편함 근데 사람들이 별로안좋아해서 잘 안쓴다고 함
 * 
 * [ 형식 ]
 * 
 *  조건식 ? 참일때의 결과값 : 거짓일때의 결과값
 * 
 * 쓸데없는 궁금증의 해답 : 만든사람이 그렇게 만들었다.
 * */
public class OpEX08 {  //쓰는사람은 엄청쓰고 안쓰는사람은 한번도 안쓴다고 함

	public static void main(String[] args) {
		
		int totalGrade = 60 ;
		
		System.out.println(totalGrade >= 60 ? "합격" : "불합격"); // 조건, 참일때, 거짓일때
		System.out.println(totalGrade < 60 ? "합격" : "불합격"); 
		//int a = 100; a+=100; 이항 연산자라고 한다.
		//a++;단항 연산자라고 한다.
		// TODO Auto-generated method stub 이거 왜 자꾸 뜨지 안뜨게 할수있나요?? 걍 지우면 됨
		
		char result = totalGrade >= 60 ? 'P' : 'F' ;  //단일문자,단일한글은 작은따옴표
		//char result = (totalGrade >= 60 ? 'P' : 'F') ;  //단일문자,단일한글은 작은따옴표
		System.out.println(result);
	}

}
