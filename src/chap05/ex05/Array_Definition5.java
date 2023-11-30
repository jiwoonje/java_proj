package chap05.ex05;

public class Array_Definition5 {

	public static void main(String[] args) {
		/*
			기본 데이터 타입 (8가지) 변수명	vs 참조 데이터 타입[] 참조변수명
		 */
		
		// 1. 기본 데이터 타입에서 대입 연산 ( = ) : stack의 값을 복사
		int val1 = 3 ;
		int val2 = val1 ;			// = : Stack에 저장된 값을 대입
		System.out.println(val2);	// 3
		val2 = 7 ;
		
		System.out.println(val1);	// 3
		System.out.println(val2);	// 7
		
		
		System.out.println("===============");
		// 2. 참조 데이터 타입에서 대입 연산 ( = ) : stack의 Heap의 주소를 복사
		int[] arr1 = new int[] {3, 4, 5};		// 배열 선언과 동시에 값 할당
		int[] arr2 = arr1;						// arr2에는 arr1의 참조 주소가 복사
		
		System.out.println(arr1);				// Heap의 주소 (메모리의 주소)
		System.out.println(arr2);				// Heap의 주소		
		
		arr1[0] = 7 ;
		System.out.println(arr1[0]);			// 7 ; 변수값
		System.out.println(arr2[0]);			// 7			
		
		
	}

}
