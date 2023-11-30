package chap05.ex02;

public class Array_Definition2 {

	public static void main(String[] args) {
		// 배열 : 방의 개수를 선언 해야함. 방의 개수를 수정할 수 있다.
				// 배열 방에 들어갈 자료형을 선언해야함.
		
		// 실수 배열
		double[] arr1 = new double[10]; 
		
		// 초기값이 없는 상태에서 출력 : 0.0 자동으로 들어감
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		System.out.println(arr1[5]);
		System.out.println(arr1[6]);
		System.out.println(arr1[7]);
		System.out.println(arr1[8]);
		System.out.println(arr1[9]);
//		System.out.println(arr1[10]);		// 방 번호 넘김. 런타임 오류 발생 : 실행시 오류
		
		// 2. 배열의 각 방에 값을 넣음
		arr1[0] = 10.1;
		arr1[1] = 11.1;
		arr1[2] = 12.1;
		arr1[3] = 13.1;
		arr1[4] = 14.1;
		arr1[5] = 15.1;
		arr1[6] = 16.1;
		arr1[7] = 17.1;
		arr1[8] = 18.1;
		arr1[9] = 19.1;
		
		// 3. 출력
		System.out.println(arr1[0]);		// 0번 방에 부여된 값을 출력
		
			// 배열의 값을 입력&출력 : for 문을 사용해서 입력하고 출력함
		System.out.println("==== for 문을 사용해서 출력");
		for ( int i = 0 ; i < 10 ; i++ ) {	// i = index 방 번호
			System.out.println(arr1[i]);
		}
		
		// arr1.length()		: 배열 방의 갯수를 출력
		System.out.println(arr1.length);	// 배열 방의 개수를 출력
		System.out.println("==== for 출력 : arr1.length 를 사용해서 출력");
		
		for ( int i = 0 ; i < arr1.length ; i++ ) {
			System.out.println(arr1[i]);
		}
		
		System.out.println("====================");
		// 배열 arr2 선언 : 100개의 정수 할당
		int[] arr2 = new int[100];			// arr2 : 배열, 0 ~ 99번방까지 100개의 정수 넣을 수 있음
		
		// for 문을 사용해서 배열의 각 방에 값을 입력
		for ( int i = 0, j = 1 ; i < arr2.length ; i++ ) {		// for 문을 사용해서 0 ~ 99번방까지 값을 부여함
			arr2[i] = j;
			j++ ;
		}
		
		// for 문을 사용해서 각 방의 내용을 출력
		for ( int i = 0 ; i < arr2.length ; i++ ) {
			System.out.println(arr2[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 문자열 배열
	}

}
