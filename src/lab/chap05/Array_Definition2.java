package lab.chap05;

import java.util.Arrays;

public class Array_Definition2 {

	public static void main(String[] args) {
		// arr : 배열 변수 String 값을 저장, 방의 개수 6개, 방 번호 0 ~ 5
		
		//	arr[0] = "자바" ;
		//	arr[1] = "HTML" ;
		//	arr[2] = "css" ;
		//	arr[3] = "JavaScript" ;
		//	arr[4] = "Oracle" ;
		//	arr[5] = "Spring" ;
		
		
		// 0. 설정
		String[] arr = new String[6];
		arr[0] = "자바" ;
		arr[1] = "HTML" ;
		arr[2] = "css" ;
		arr[3] = "JavaScript" ;
		arr[4] = "Oracle" ;
		arr[5] = "Spring" ;
		
		// 출력 1 : 방 번호를 직접 찍어서 출력
		System.out.println("출력 1. 방 번호 직접 입력");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[5]);		
		
		// 출력 2 : for 문을 통해서 출력
		System.out.println("출력 2. for 출력");
		for ( int i = 0 ; i < arr.length ; i++ ) {
			System.out.println(arr[i]);
		}
		
		// 출력 3 : Enhanced For 문을 통해서 출력
		System.out.println("출력 3. Enhanced for 출력");
		for ( String k : arr ) {
			System.out.println(k);
		}
		
		// 출력 4 : Arrays.toStrin() 이용해서 출력
		System.out.println("출력 4. Arrays.toString() 출력");
		System.out.println(Arrays.toString(arr));
		
		
	}

}
