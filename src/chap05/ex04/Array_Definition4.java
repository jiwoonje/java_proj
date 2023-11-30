package chap05.ex04;

public class Array_Definition4 {

	public static void main(String[] args) {
		/*
			배열의 선언 방법 : 3가지
		 */
		
		// 1. 배열 선언 - 1	: 배열 변수 선언과 동시에 방의 크기 지정
			// 자료형[]
		
		int[] arr1 = new int[3];						// 배열 변수 선언과 동시에 방의 크기 지정
		
		int[] arr2 ;									// 배열 변수 선언
		arr2 = new int[3];								// 방의 크기 나중에 지정
		
		// 2. 배열 선언 - 2
			// 변수명[]
		
		int arr3[] = new int[3];						// 배열 변수 선언과 동시에 방의 크기 지정		
		
		int arr4[] ;									// 배열 변수 선언
		arr4 = new int[3];								// 방의 크기 나중에 지정
		
		// 3. 배열 선언 - 3	: 배열 선언과 동시에 값을 할당
		int[] arr5 = new int[] {10, 20, 30, 40, 50};	// 배열 변수 선언, 값 지정. 방의 크기 저절로 할당됨
						//	 -> 여기에 방 크기를 지정하면 안 됨
		System.out.println(arr5[0]);
		System.out.println(arr5[1]);
		System.out.println(arr5[2]);
		System.out.println(arr5[3]);
		System.out.println(arr5[4]);
		
		System.out.println("배열 방의 개수 : " + arr5.length);
		System.out.println("================");
		
		int[] arr6;										// 배열 변수 선언
		arr6 = new int[] {100, 200, 300, 400, 500, 600, 700};		// 값은 나중에 지정, 방의 크기 저절로 할당됨
		
		System.out.println(arr6[0]);
		System.out.println(arr6[1]);
		System.out.println(arr6[2]);
		System.out.println(arr6[3]);
		System.out.println(arr6[4]);
		System.out.println(arr6[5]);
		System.out.println(arr6[6]);
		
		System.out.println("배열 방의 개수 : " + arr6.length);
		System.out.println("================");
		
		// 4. 배열 선언 - 4	: 배열 선언하며 값을 바로 할당
		int[] arr7 = {11, 22, 33, 44, 55};
		
		System.out.println(arr7[0]);
		System.out.println(arr7[1]);
		System.out.println(arr7[2]);
		System.out.println(arr7[3]);
		System.out.println(arr7[4]);
		
		System.out.println("배열 방의 개수 : " + arr7.length);
		System.out.println("================");
	
			// 주의 : 선언과 값 할당을 분리하면 오류 발생
			int[] arr8 ;
//			arr8 = {66, 77, 88, 99};
			arr8 = new int[] {666, 77, 88, 99};
		
		
		System.out.println("================================");
		
		String[] arr9 = {"아버님", "어머님", "형제", "동생"};
		
		// 출력
		for ( int i = 0 ;  i < arr9.length ; i++ ) {	// arr9.length : 방의 개수
			System.out.println(arr9[i]);
		}
		System.out.println("================");
		
		// 배열 방의 값을 수정
		arr9[0] = "BTS";
		arr9[1] = "걸스그룹";
		arr9[2] = "소녀시대";
		arr9[3] = "원더걸스";
		
		for ( int i = 0 ;  i < arr9.length ; i++ ) {	// arr9.length : 방의 개수
			System.out.println(arr9[i]);
		}
		System.out.println("================");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
