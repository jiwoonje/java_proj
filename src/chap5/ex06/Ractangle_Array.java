package chap5.ex06;

import java.util.Arrays;

public class Ractangle_Array {

	public static void main(String[] args) {
		/*
			다차원 배열 : 2차원 정방형 배열
		 */
		
		// 1. 2차원 정방형 배열 선언
				// [] : 행, [] : 열
		int[][] arr1 = new int [3][4];		// Heap에 값을 저장할 방을 만들어라. 행3 열4
		
		
		// 2. 각 index(방번호)에 값을 넣음
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		arr1[0][2] = 3;
		arr1[0][3] = 4;
		
		arr1[1][0] = 10;
		arr1[1][1] = 20;
		arr1[1][2] = 30;
		arr1[1][3] = 40;
		
		arr1[2][0] = 100;
		arr1[2][1] = 200;
		arr1[2][2] = 300;
		arr1[2][3] = 400;
		
//		arr1[2][4] = 500;			// 컴파일 단계의 오류 : 이클립스에서 오류를 확인
									// 실행 단계의 오류 : 실행시에 오류 발생
									// 배열의 방 번호를 넘길 때 발생하는 오류
		
		System.out.println("===== 직접 출력 ====");
		// 3. 출력 : 방 번호를 직접 출력
		System.out.println(arr1[0][0]);			// 1
		System.out.println(arr1[1][0]);			// 10
		System.out.println(arr1[2][0]);			// 100
		
		System.out.println("===== for ====");
		// 4. 출력 : for 문을 사용해서 출력
			/* arr1.length		<== 1차원 배열 : 열의 개수
								<== 2차원 배열 : 행의 개수
			 */
//		System.out.println(arr1.length);						// arr1의 행의 개수 : 3
//		System.out.println(arr1[0].length);						// arr1의 첫번째 행의 개수 : 4
			// 2차원 배열은 2중 for를 사용해서 출력
			for ( int i = 0 ; i < arr1.length ; i++ ) {			// 행을 루프 돌림. i : 행의 방 번호
				for ( int j = 0 ; j < arr1[i].length ; j++ ) {	// 열을 루프 돌림. j : 열의 방 번호
					System.out.print("arr[" + i + "][" + j + "] = " + arr1[i][j]);
					System.out.print("\t");
				}
				System.out.println();
			}
			
			/* 혼자 해봄
			for ( int i = 0 ; i < arr1.length ; i++ ) {			// 행을 루프 돌림. i : 행의 방 번호
				for ( int j = 0 ; j < arr1[i].length ; j++ ) {	// 열을 루프 돌림. j : 열의 방 번호
					int k = arr1[i][j];
					System.out.printf("arr[%d][%d] = %d", i, j, k);
					System.out.print("\t");
				}
				System.out.println();
			}
			 */
		
		System.out.println("===== Enhanced For ====");
		// 5. 출력 : Enhanced For 문으로 출력 : 2중 for 사용
		for ( int[] a : arr1) {								// 행 자체를 루프 돌림. a 배열에 있는 값을 꺼냄
			for ( int b : a ) {								// a 배열의 0 ~ 마지막 방까지의 값을 b 변수에 담음
				System.out.print(b);
				System.out.print("\t");
			}
			System.out.println();
		}
				
		
		System.out.println("===== Arrays.toString() ====");
		// 6. 출력 : Arrays.toString(배열변수명)
//		System.out.println(Arrays.toString(arr1));			// Heap 주소
		System.out.println(Arrays.toString(arr1[0]));		// 한 행의 값만 출력되는 1차원 출력
		System.out.println(Arrays.toString(arr1[1]));		// 다음 행도 지정해주어야 함
		System.out.println(Arrays.toString(arr1[2]));
		
		System.out.println("===== for 문을 사용해서 Arrays.toString() ====");
		for ( int i = 0 ; i < arr1.length ; i++ ) {
			System.out.println(Arrays.toString(arr1[i]));
		}
		
	}

}
