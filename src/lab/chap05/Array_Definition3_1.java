package lab.chap05;

import java.util.Scanner;

public class Array_Definition3_1 {

	/*
		1. 스캐너로 인풋 값을 받아서 배열 방의 크기를 지정하고, 각 방에 7의 배수와 8의 배수를 저장 후 출력
		2. 스캐너로 인풋 값을 받아서 배열 방의 크기를 지정하고, 1씩 증가하는데 4의 배수는 제외하고 저장 후 출력
		3. 스캐너로 인풋 값을 받아서 배열 방의 크기를 지정하고, 3의 배수는 저장하고, 6의 배수는 제외하고 저장 후 출력
	 */
	public static void main(String[] args) {
	
		// 1. Scanner 선언
		
		Scanner sc = new Scanner(System.in);		// 콘솔로 값을 인풋
		
		// 내부 블락에서 사용할 변수 선언
		// 배열 변수, 스캐너로 선택하는 변수, 배열의 방의 크기를 스캐너로 받는 변수
//		int[] arr1 = new int[50] ;					// 배열 변수 선언, 방의 크기 지정
		
		int[] arr ;									// 배열 변수만 선언
//		arr = new int [50] ; 						// 배열의 방의 크기를 나중에 선언
		
		int n ;										// 출력을 선택하는 변수 : scanner로 콘솔로 인풋
		int idx ;									// 배열의 방의 크기를 지정하는 변수

		do {
			System.out.println("=====================================================================================");
			System.out.println("1. 스캐너로 인풋 값을 받아서 배열 방의 크기를 지정하고, 각 방에 7의 배수와 8의 배수를 저장 후 출력");
			System.out.println("2. 스캐너로 인풋 값을 받아서 배열 방의 크기를 지정하고, 1씩 증가하는데 4의 배수는 제외하고 저장 후 출력");
			System.out.println("3. 스캐너로 인풋 값을 받아서 배열 방의 크기를 지정하고, 3의 배수는 저장하고, 6의 배수는 제외하고 저장 후 출력");
			System.out.println("4. 프로그램을 종료");
			System.out.println("=====================================================================================");
			System.out.println("위의 번호 중 하나를 입력하세요 >>> ");
			
			n = sc.nextInt();
			
			if ( n == 1 ) {
				System.out.println("1. 스캐너로 인풋 값을 받아서 배열 방의 크기를 지정하고, 각 방에 7의 배수와 8의 배수를 저장 후 출력");
				System.out.println("배열 방의 크기를 정수로 넣으세요. >>> ");
				
				idx = sc.nextInt(); 
				arr = new int[idx] ;
				
				System.out.println("입력된 배열 방의 크기는 : " + arr.length);
				
				int a = 1 ;
				for ( int i = 0 ; i < arr.length ; a++ ) {			// 조건이 공백이면 무한 루프
																	// i = 방 번호, a = 값(7의 배수, 8의 배수), idx = 방 크기
						if ( a % 7 == 0 || a % 8 == 0 ) {
							arr[i] = a;
							i++ ;
						}
					}
					
				// 각 배열의 방에 내용을 출력 : 
				for ( int i = 0 ; i < arr.length ; i++ ) {
					System.out.println("방 번호 : " + i + ", 값 : " + arr[i]);
				}
				
			} else if ( n == 2 ) {
				System.out.println("2. 스캐너로 인풋 값을 받아서 배열 방의 크기를 지정하고, 1씩 증가하는데 4의 배수는 제외하고 저장 후 출력");
				System.out.println("배열 방의 크기를 정수로 넣으세요. >>> ");
				
				idx = sc.nextInt(); 
				arr = new int[idx] ;
				
				System.out.println("입력된 배열 방의 크기는 : " + arr.length);
				
				int a = 1 ;
				for ( int i = 0 ; i < arr.length ; a++ ) {
					if ( a % 4 == 0 ) {continue; }			// 4의 배수일 때는 아래의 내용을 처리하지 않는다.
					
					arr[i] = a ;
					i++ ;
				}
				for ( int i = 0 ; i < arr.length ; i++ ) {
					System.out.println("방 번호 : " + i + ", 값 : " + arr[i]);
				}
				
			} else if ( n == 3 ) {
				System.out.println("3. 스캐너로 인풋 값을 받아서 배열 방의 크기를 지정하고, 3의 배수는 저장하고, 6의 배수는 제외하고 저장 후 출력");
				System.out.println("배열 방의 크기를 정수로 넣으세요. >>> ");
				
				idx = sc.nextInt(); 
				arr = new int[idx] ;
				
				System.out.println("입력된 배열 방의 크기는 : " + arr.length);
				
				int a = 1 ;
				for ( int i = 0 ; i < arr.length ; a++ ) {
//					if ( a % 6 == 0 ) {continue;}
					if ( a % 3 == 0 ) {
						if ( a % 6 != 0 ) {					// 6의 배수는 제외
						arr[i] = a ;
						i++ ;
						}
					}
				}
				for ( int i = 0 ; i < arr.length ; i++ ) {
					System.out.println("방 번호 : " + i + ", 값 : " + arr[i]);
				}
				
			} else if ( n == 4 ) {
				System.out.println("4. 프로그램을 종료");
				break;
			}
		} while ( true ) ;
		System.out.println("도달할 수 없는 코드 --");
	}

}
