package chap05.ex01;

public class Array_Definition {

	public static void main(String[] args) {
		/*
			자료형 : 변수, 상수, 배열(Array)을 정의할 때 자료형이 정의되어야 함
				- 기본 자료형 : Stack 공간에 변수명, 값. 값 비교 : ==
					boolean, 정수(byte, short, int, long), 실수(float, double), 문자(char)
					- Stack은 초기값이 할당되지 않아도 오류가 발생하지 않음
				- 참조 자료형 : Stack 공간에 변수, 참조주소 / Heap 공간에 값. 값 비교 : 변수명.equals()
					String : 참조 자료형, 문자열	<== 객체
					- Heap에는 초기값이 할당되어야 한다.
						-- boolean : false
						-- 정수형 : 0
						-- 실수형 : 0.0
					객체, 배열, 인터페이스...
					
					배열(Array) : 하나의 배열 변수에 여러개의 값을 넣을 수 있다.
						- 방 번호(index) : 0번 방부터 시작
						- 배열을 선언 시 방 번호가 선언되어야 한다.
						- 배열 방의 개수 : 배열 변수명.length()	<== 배열 방의 개수를 확인
		 */
		
		// 변수 : 하나의 값만 넣을 수 있다.
		int a = 10 ;	// 선언시 값을 할당
		int b ;			// 선언만
		int c ;
		c = 20 ;
		c = 30 ;
		c = 40 ;
		
		
		System.out.println(a);
//		System.out.println(b);		// 오류 발생 : 기본 자료형은 초기값이 할당되지 않으면 오류가 발생
		System.out.println(c);		// 가장 마지막에 할당된 값이 부여됨
		
		
		// 배열(Array) : 배열 변수 하나에 여러개의 값을 넣을 수 있다.
		// 1. 배열 선언
		int[] arr = new int[5] ;	// index : 0, 1, 2, 3, 4
			// 자료형[] 배열변수 = new 자료형[방의 개수] ;
				// new		: 배열의 값을 Heap 공간에 저장
				// int[5]	: 틀 생성
		
		System.out.println("==== 배열 방의 값을 출력 ====");
		// 2. 배열의 각 방의 값을 출력 : 값이 할당되지 않아서 기본값이 출력된다 (정수라서 0)
		System.out.println("arr 배열의 0번째 방의 값 : " + arr[0]);
		System.out.println("arr 배열의 1번째 방의 값 : " + arr[1]);
		System.out.println("arr 배열의 2번째 방의 값 : " + arr[2]);
		System.out.println("arr 배열의 3번째 방의 값 : " + arr[3]);
		System.out.println("arr 배열의 4번째 방의 값 : " + arr[4]);
		
		// 3. 배열 각 방에 값을 입력
		arr[0] = 10 ;
		arr[1] = 20 ;
		arr[2] = 30 ;
		arr[3] = 40 ;
		arr[4] = 50 ;
//		arr[5] = 60 ;			// 실행시 오류 발생 : 런타임 오류
								// ArrayIndexOutOfBoundsExceeption	<== 배열의 방 번호를 넘긴 경우
		
		System.out.println("==== 배열 방의 값을 출력 ====");
		// 3. 배열의 각 방의 값을 출력 (값을 수정 후 출력)
		System.out.println("arr 배열의 0번째 방의 값 : " + arr[0]);
		System.out.println("arr 배열의 1번째 방의 값 : " + arr[1]);
		System.out.println("arr 배열의 2번째 방의 값 : " + arr[2]);
		System.out.println("arr 배열의 3번째 방의 값 : " + arr[3]);
		System.out.println("arr 배열의 4번째 방의 값 : " + arr[4]);
		
		
		
		
		
		
		
	}

}
