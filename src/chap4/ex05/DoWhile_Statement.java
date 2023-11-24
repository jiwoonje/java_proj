package chap4.ex05;

public class DoWhile_Statement {

	public static void main(String[] args) {
		/*
			while 문 	: 조건이 true 일 때 실행됨
			do while 문	: 조건에 상관없이 한 번은 실행문이 실행됨. 조건이 true 면 계속 반복
			 
			=======while 문==============
			초기값 ;
			while ( 조건 ) {
				실행문 ;			<== 조건이 true
				증감식 ;
			}
			
			do while 문 : 조건이 
			=======do while 문============
			초기값 ;
			do {
				실행문 ;
				증감식 ;
			} while ( 조건 ) ;	<== 
			============================
			
		 */
		
		// while 문
		int a = 0 ;
		while ( a < 0 ) {						// 조건이 false 이므로 아무것도 출력이 안 됨
			System.out.println("a : " + a);
		}
		
		// do ~ while (조건) ;
		int b = 0 ;
		do {
			System.out.println("b : " + b);		// 조건의 true or false 와 상관없이 1회 출력됨
		}while ( b < 0 );						// 조건이 false 이므로 최초 실행 1회 됨
		
		// do ~ while 에서 반목 처리
		int c = 0 ;
		do {
			System.out.println("c : " + c);
			c++;
		}while ( c < 100 ); 
		
		
		System.out.println("=================");
		// 반복 횟수가 100번인 경우 while 문, do while 문 비교
		
		System.out.println("=== while ===");
		
		a = 0 ;
		while ( a < 10 ) {
			System.out.println("a : " + a);
			a++;
		}
		
		
		System.out.println("=== do while ===");
		a = 0 ;
		do {
			System.out.println("a : " + a);
			a++;
		}while ( a < 10 );
		
		
		
		
		
		
		
		
		
		
	}

}
