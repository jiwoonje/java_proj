package chap04.ex01;

public class If_Statement {

	public static void main(String[] args) {
		/*
		 * 
		 */
		
		/*
			제어문 : 프로그램의 순서를 바꾸어서 처리함.
				If 문		<== break ; 가 내장,
				Switch 문	<== break ; (블락을 빠져나올 때 사용함.)
				
			If -- 3가지 구문
			
			1.	조건이 하나일 때			<== 삼항 연산자로 수정		(조건) ? 참 : 거짓 ;
			
				if (조건) {
					조건이 true 일 때 실행문 ;
				} else {
					조건이 false 일 때 실행문 ;
				}
				
			
			2. 조건이 여러개일 때
			
				if (조건1) {
					조건1 일 때 ;
				} else if (조건2) {
					조건2 일 때 ;
				} else if (조건3) {
					조건3 일 때 ;
				} else if (조건4) {
					조건4 일 때 ;
				} else {
					위의 모든 조건이 만족하지 않을 때 실행문 ;
				}
				
			
			3. 한 라인으로 사용
			
				if (조건) { 조건이 true 일 때 } 
				if (조건) 조건이 true 일 때 ;
					
		 */
		
		
		// 조건이 1개일 때 = if ~ else ~ 구문
		int a = 10 ;
		
		if ( a < 30 ) {
			System.out.println(" 참입니다. ");		// 조건이 참이면 실행
			System.out.println("참일 때 또 실행됩니다. ");
		}else {
			System.out.println(" 거짓입니다. ");	// 조건이 거짓이면 실행
		}
		
		
		// 조건이 여러개일 때 : 점수가 90점 이상일 때 A학점, 80점 이상일 때 B학점, 70점 이상일 때 C학점
		int score = 85 ;
		
		if ( score >= 90 ) {
			System.out.println("A 학점입니다. ") ;
		}else if ( score >= 80 ) {
			System.out.println("B 학점입니다. ") ;
		}else if ( score >= 70 ) {
			System.out.println("C 학점입니다. ") ;
		}else if ( score >= 60 ) {
			System.out.println("D 학점입니다. ") ;
		}else {
			System.out.println("F 학점입니다. ") ;
		}
		
		
		System.out.println("================");
		
		 score = 90 ;
		 
		if ( score >= 60 && score < 70 ) {				// true && false == false
			System.out.println("D 학점입니다. ") ;
		}else if ( score >= 70 && score < 80 ) {		// true && false == false
			System.out.println("C 학점입니다. ") ;
		}else if ( score >= 80 && score < 90 ) {		// true && false == false
			System.out.println("B 학점입니다. ") ;
		}else if ( score >= 90 && score <= 100 ) {		// true && true == true
			System.out.println("A 학점입니다. ") ;
		}else {
			System.out.println("F 학점입니다. ") ;
		}
		
		System.out.println("================");

		
		// 조건이 true 일 때만 실행 : 중괄호를 넣어도 되고 생략될 수도 있다.
		
		if ( 10 > 5 ) { System.out.println( "참입니다."); }
		if ( 10 > 5 ) System.out.println( "참입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
