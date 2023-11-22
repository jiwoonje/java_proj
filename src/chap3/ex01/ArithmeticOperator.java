package chap3.ex01;

public class ArithmeticOperator {

	public static void main(String[] args) {
		/*
		 	산술 연산자 : + , - , * , / , % (나머지만 출력)
		 	증감 연산자 : ++(1씩 증가) , --(1씩 감소)		<== 변수 앞, 변수 뒤
		 	
		 */
		
		// 1. 산술 연산자
		int a = 5 ;
		int b = 10 ;
		System.out.println(a + b);	// 15
		System.out.println(a - b);	// -5
		System.out.println(a * b);	// 50
		System.out.println(a / b);	// 0 (나누어서 몫만 출력)
		System.out.println(a % b);	// 5 (나누어서 나머지만 출력)		<== 중요
		System.out.println();
		
		// 캐스팅해서 연산
		System.out.println( 2 + 3 );			// 5 	int
		System.out.println( 2 + (double) 3 );	// 5.0	double
		System.out.println();
		
		//
		System.out.println(10 % 5);				// 0 나머지만 출력
			// 값 % 3 = 0 일 때, 값은 3의 배수
			// 값 % 5 = 0 일 때, 값은 5의 배수
		System.out.println(8 / 5);				// 1 몫만 출력
		System.out.println( (int)(8 / 5.0) );	// 1 몫만 출력
		System.out.println(8 % 5);				// 3 나머지만 출력
		System.out.println(8 / 5.0);			// 1.6
		System.out.println();
		
		// 2. 증감 연산자 : ++ , --
		int val1 = 3 ;
		System.out.println(++val1);		// 4	값을 증가 후 출력
		System.out.println(val1);		// 4
		
		System.out.println(--val1);		// 3
		System.out.println(val1--);		// 3
		System.out.println(val1);		// 3
		
		System.out.println("=========================");
		
		int val2 = 3 ;
		System.out.println(val2++);		// 3	값을 출력 후 증가
		System.out.println(val2);		// 4
		
		System.out.println("=========================");

		int val7 = 3 ;
		int val8 = 4 ;
		int val9 = 2 + val7-- + ++val8 ;
		
		System.out.println("val9 : " + val9);		// 10
		System.out.println("val7 : " + val7);		// 2
		System.out.println("val8 : " + val8);		// 5
		
		System.out.println("=========================");
		
		int val10 = 30 ;
		int val11 = 40 ;
		int val12 = 50 ;
		
		int val13 = 7 + --val10 + ++val11 + val12-- ;		// 7 + 29 + 41 + 50 = 127
		
		System.out.println("val13 : " + val13);
		System.out.println(val10);	// 29
		System.out.println(val11);	// 41
		System.out.println(val12);	// 49
		
		
		

	}

}
