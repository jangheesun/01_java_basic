package step1_03.operator;

public class OpEX07 {

	public static void main(String[] args) {
		
		int tempData1 = 100;
		tempData1 -= 3; // 이것은 tempData1 = tempData1 - 3;과 같다. 간단한표현이 더 일반적인 표현이다.
		System.out.println(tempData1);
		
		int tempData2 = 10;
		//tempData2 = tempData2 + 100;
		tempData2 += 100;
		System.out.println(tempData2);
		
		int tempData3 = 100;
		//tempData3 = tempData3 * 7;
		tempData3 *= 7;
		System.out.println(tempData3);
		
		int x = 0 ;
		//x++; 독립적으로 존재할때는 변수를 바꿔버린다. ++x;도똑같다. 나중되면 헷갈리지 않으므로 굳이 신경쓸필요없다.
		System.out.println(x++); // x값을 출력하고 ++를 처리한다. 헷갈린다. // ++변수 오니쪽 명령어를 먼저 수행하고 ++ 명령어가 수행된다.
		System.out.println(x);
		System.out.println(1227);
		
		int y = 0 ;
	
		System.out.println(++y); //상식적으로이해하기쉬운형태 // ++명령어가 수행되고 ++변수 왼쪽 명령어가 수행된다.
		System.out.println(y);
		System.out.println();
		
		//tempData1 = tempData1 - 3;	//tempData1 - 3; 이렇게쓰면 이줄에서만 3이 빠진것으로 값이 재정의되지 않았다. = 연산자는 같다가 아니고 대입이다. 대입할때는 오른쪼고 값을 왼쪽에 넣는다.
		
		// TODO Auto-generated method stub
		
		/*
		 * 
		 *  x = x + 1
		 *  x += 1
		 *  x++
		 *  ++x
		 * 
		 *  x = x - 1
		 *  x -= 1
		 *  x--
		 *  --x
		 * 
		 * 
		 * */
		//++변수와 --변수의 차이점
	}

}
