package lab.chap05;

import java.util.Arrays;

public class Ractangle_Array2 {

	public static void main(String[] args) {
		/*
			arr : 배열 변수명, 2차원 배열. [5][10] 5행 10열.
				arr[0] : 짝수만 저장
				arr[1] : 홀수만 저장. 3의 배수는 제외
				arr[2] : 4, 5의 배수를 저장
				arr[3] : 10의 배수만 저장
				arr[4] : 8단의 값 입력
				
				// for 문으로 출력
				// Enhanced for 문으로 출력
				// Arrays.toString() 으로 출력
		 */
		
		
		// 1. 배열 변수 선언
		int[][] arr = new int [5][10];
		
		System.out.println("== 2. 배열 방에 값을 저장 ==");
		// 2. 배열의 방에 값을 저장
		for (int i = 0 ; i < arr.length ; i++ ) {		// i : 행 
			
			if ( i == 0 ) {										// 짝수만
				int a = 2 ;
				for ( int j = 0 ; j < arr[0].length ; j++ ) {
					arr[0][j] = a ;
					a+=2;
				}
				
			}else if ( i == 1 ){								// 홀수만, 3의 배수 제외
				int a = 1 ;
				for ( int j = 0 ; j < arr[1].length ; a+=2 ) {
					if ( a % 3 == 0 ) {continue ;}
//					if ( a % 3 != 0 )
					arr[1][j] = a ;
					j++;
				}
					
			}else if ( i == 2 ){								// 4,5의 배수
				int a = 1 ;
				for ( int j = 0 ; j < arr[2].length ; a++ ) {
					if ( a % 4 == 0 || a % 5 == 0 ) {
					arr[2][j] = a;
					j++;
					}
				}
			}else if ( i == 3 ){								// 10의 배수
				int a = 10 ;
				for ( int j = 0 ; j < arr[3].length ; j++ ) {
					arr[3][j] = a ;
					a+=10;
				}
			
			}else if ( i == 4 ){								// 8의 배수
				int a = 8 ;
				for ( int j = 0 ; j < arr[4].length ; j++ ) {
					arr[4][j] = a ;
					a+=8;
				}
			}
		}
		
		System.out.println();
		System.out.println("== for 문으로 출력 ==");
		// for 문으로 출력
		for ( int i = 0 ; i < arr.length ; i++ ) {
			for ( int j = 0 ; j < arr[i].length ; j++ ) {
				System.out.print("arr[" + i + "][" + j + "] = " + arr[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("== Enhanced For 문으로 출력 ==");
		// Enhanced for 문으로 출력
		for ( int[] a : arr ) {
			for ( int b : a ) {
				System.out.print(b);
				System.out.print("\t");				
			}
			System.out.println();			
		}
		
		System.out.println();
		System.out.println("== Arrays.toString() 문으로 출력 ==");
		// Arrays.toString() 으로 출력
		for ( int i = 0 ; i < arr.length ; i++ ) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
	

}
