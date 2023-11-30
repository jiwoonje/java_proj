package chap05.ex03;

import java.util.Arrays;

public class Array_Deifinition3 {

	public static void main(String[] args) {
		// 배열의 값을 출력하는 방법 4가지
		
		// 1. 배열 변수 선언 : 정수, 방 1000개, 방 번호 0 ~ 999
		int[] arr = new int[1000];
		
		// 2. 각 방에 6의 배수를 저장함
		for ( int i = 0, j = 6 ; i < arr.length ; i++ ) {	// i 배열의 방 번호, j : 값
			arr[i] = j ;
			j += 6;
		}
		
		// 출력 1 : 방 번호를 직접 출력
		System.out.println("==== 출력 1 ====");
		System.out.println(arr[0]);
		System.out.println(arr[999]);
		
		// 출력 2 : for 문을 사용해서 출력. 출력을 조절 가능 (출력 조건 부여 가능)
		System.out.println("==== 출력 2 ====");
		for ( int i = 0 ; i < arr.length ; i++ ) {
			System.out.println(arr[i]);
		}
		
		// 출력 3 : 향상된(Enhanced) for 문을 사용해서 출력. 모든 방의 값을 출력
		System.out.println("==== 출력 3 : Enhanced For ====");
		for ( int k : arr) {				// arr 배열 변수의 0 ~ 마지막 방까지 출력
			System.out.println(k);
		}
		
		// 출력 4 : Arrays.toString(배열변수) : 배열의 모든 값을 출력
		System.out.println("==== 출력 4 : Arrays.toString ====");
		System.out.println(Arrays.toString(arr));	// 배열에 저장된 모든 내용을 출력
													// [6, 12, 18, ... ]
		
		
	}

}
