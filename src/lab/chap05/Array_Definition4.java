package lab.chap05;

import java.util.Arrays;

public class Array_Definition4 {

	public static void main(String[] args) {
		/*
		 *		변수 : 1개의 값만 저장. Stack에 변수명, 변수값 저장. 								==		기본자료형 8가지
		 *		배열 : 여러개의 값을 한꺼번에 저장. Stack에 변수명과 참조주소 저장. Heap에 변수값 저장  .equals	참조자료형.
		 *				정수 : 초기값 0
		 *				실수 : 초기값 0.0
		 *				boolean : 초기값 false
		 */
		
		int a = 10 ;				// 변수
		
		int[] b = new int[10];		// 배열 선언, Heap 공간에는 초기값이 반드시 들어가야함.
		System.out.println(b[0]);
		
		// b 배열에 값을 할당
		b[0] = 3;
		b[1] = 6;
		b[9] = 10;
		
		// for 문을 통해서 배열의 각 방의 값을 모두 출력
		for ( int i = 0 ; i < 10 ; i++ ) {
			System.out.println(b[i]);
		}
		
		System.out.println(b.length);		// 배열 방의 개수 : 10
		System.out.println("===== for ====");
		
		for ( int i = 0 ; i < b.length ; i++ ) {
			System.out.println(b[i]);
		}
		
		// Enhanced for 문 : 배열 0 ~ 마지막 방까지 모두 출력
		System.out.println("==== Enhanced For ====");
		for ( int k : b ) {
			System.out.println(k);
		}
		
		// Arrays.toString(배열변수)
		System.out.println("==== Arrays.toString() ====");
		System.out.println(Arrays.toString(b));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
