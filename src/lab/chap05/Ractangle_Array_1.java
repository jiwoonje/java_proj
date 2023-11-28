package lab.chap05;

import java.util.Arrays;

public class Ractangle_Array_1 {

	public static void main(String[] args) {
		/*
		// 1. 배열 변수 선언
			arr[3][10]	<== 방번호 : 행 0 ~ 2, 열 0 ~ 9
						<== 행의 개수 : 3 (=arr.length)
		// 2. 배열 방에 값을 저장
			<2중 for 문을 써서 값을 저장>
			0행에는 1부터 시작해서 1씩 증가 		1,2,3,...
			1행에는 3의 배수를 저장				3.6.9,...
			2행에는 7의 배수와 8의 배수를 저장		7,8,14,...
		// 3. 출력
			<2중 for 문을 써서 출력>
			<Enhanced for 문을 써서 출력>
			<Arrays.toString()을 써서 출력>
		 */
	
		
		// 1. 배열 변수 선언
		int[][] arr = new int [3][10] ;
		
//		System.out.println(arr.length);		// 3 ;  행의 개수
//		System.out.println(arr[0].length);	// 10 ; 1행의 열의 개수
	
		
		System.out.println("== 2. 배열 방에 값을 저장 ==");
		// 2. 배열 방에 값을 저장
		for ( int i = 0 ; i < arr.length ; i++ ) {				// 행을 반복. 1차원 배열
//			System.out.println("행의 방번호 : " + i);
			
			if ( i == 0 ) {
				// 각 방에 1부터 1씩 증가하는 값을 넣기
				int a = 1 ;
				for ( int j = 0 ; j < arr[i].length ; j++ ) {
					arr[0][j] = a ;
					a++;
				}
				
			}else if ( i == 1 ) {
				// 각 방에 3의 배수 를 저장
				int a = 3 ;
				for ( int j = 0 ; j < arr[i].length ; j++ ) {
					arr[1][j] = a ;
					a+=3 ;					
				}
				
			}else if ( i == 2 ) {
				// 각 방에 7의 배수와 8의 배수를 저장
				int a = 1 ;
				for ( int j = 0 ; j < arr[i].length ; a++ ) {
					if ( a % 7 == 0 || a % 8 == 0 ) {
						arr[2][j] = a ;
						j++ ;
					} 
				}
			}
			
		}
		
		
		System.out.println("== 3. 2중 for 문으로 출력 ==");
		// 3. 출력 1 - 2중 for 문을 써서 출력
		for ( int i = 0 ; i < arr.length ; i++ ) {
			for (int j = 0 ; j < arr[i].length ; j++) {
				System.out.print("arr[" + i + "][" + j + "] = " + arr[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
			
		System.out.println("== 3. Enhanced for 문으로 출력 ==");
		// 3. 출력 2 - Enhanced for 문을 써서 출력
		for ( int[] a : arr ) {
			for ( int b : a ) {
				System.out.print(b);
				System.out.print("\t");				
			}
			System.out.println();
		}
		
		System.out.println("== 3. Arrays.toString() 으로 출력 ==");
		// 3. 출력 3 - Arrays.toString() 을 써서 출력
		for ( int i = 0 ; i < arr.length ; i++ ) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
	}

}
