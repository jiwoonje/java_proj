package chap03.ex04;

public class RelationOpertor {
	public static void main(String[] args) {
		/* 비교 연산자 : 결과를 true, false를 리턴
			- 크기 비교 연산자 : > , < , >= , <=
			- 등가 비교 연산자 : == (같으면 true) , != (같지 않으면 true)
			
		 */
		
		// 1. 크기 비교 연산자
		System.out.println(5 > 2);				// true
		System.out.println(5 < 2);				// false
		System.out.println(5 >= 2);				// true
		System.out.println(5 <= 2);				// false
		System.out.println(5 == 2);				// false
		System.out.println(5 != 2);				// true
		
		char a = 'a' ;
		char b = 'a' ;
		
		System.out.println(a == b);				// true
		System.out.println(a != b);				// false
		
		System.out.println("=========");
		// 2. 참조 자료형일 때 등가 비교 연산자 사용
		String str1 = new String("안녕") ;
		String str2 = new String("안녕") ;
		
		System.out.println(str1 == str2);		// false
		// 참조 자료형일 때 Heap 영역의 값을 비교할 때 .equals() 를 사용한다.
		
		System.out.println(str1.equals(str2));
		
		
		System.out.println("=========");
		// String은 특수한 기능들이 많이 적용되어 있음
		
		String str3 = "오늘" ;
		String str4 = "오늘" ;
		
		System.out.println(str3 == str4);		// ==는 stack 에 저장된 변수의 값을 비교
		System.out.println(str3.equals(str4));	// Heap 에 저장된 값을 비교
		
		
		
		
		
		
	}

}
