package chap5.ex07;

import java.util.Arrays;

public class Ractangle_Array7 {

	public static void main(String[] args) {
		/*
				2차원 배열 선언 방법 4가지
		 */
		
		// 1. 가장 많이 사용
		int[][] arr1 = new int[3][4];		// 선언과 동시에 방의 크기를 할당
		
		int[][] arr2;						// 선언
		arr2 = new int [3][4];				// 방 크기 할당
		
		
		// 2. 배열 변수에 [][]
		int arr3[][] = new int[3][4];		// 선언과 동시에 방의 크기를 할당
		
		int arr4[][];						// 선언
		arr4 = new int [3][4];				// 방 크기 할당
		
		
		// 3. 배열 변수 선언시 값을 바로 할당 : 방 크기를 지정하면 오류 발생
		int[][] arr5 = new int [][] { {1, 2, 3, 4, 5}, {10, 20, 30, 40, 50}, {100, 200, 300, 400, 500} };
		
		System.out.println(arr5[2][2]);				// 300
		System.out.println(arr5[1][4]);				// 350
		
		int[][] arr6;																	// 선언
		arr6 = new int[][] { {1, 2, 3, 4}, {11, 22, 33, 44}, {111, 222, 333, 444} };	// 값은 나중에
		
		System.out.println(arr6[0][2]);				// 3
		System.out.println();
		
		System.out.println(Arrays.toString(arr6[0]));
		System.out.println(Arrays.toString(arr6[1]));
		System.out.println(Arrays.toString(arr6[2]));
//		System.out.println(Arrays.toString(arr6[3]));	// 오류 발생
		
		
		// 4. 배열 변수 선언시 값을 바로 할당 (new int[][] 생략 사용)
			// 주의 : 선언과 값을 분리할 수 없다. 오류 발생
		
		int[][] arr7 = { {1, 2, 3}, {11, 22, 33}, {111, 222, 333} };
		
//		int [][] arr8 ;											// 선언
//		arr8 = { {1, 2, 3}, {11, 22, 33}, {111, 222, 333} };	// 값 할당 : 오류 발생
		
		
		
	}

}
