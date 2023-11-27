package lab.chap05;

import java.util.Scanner;

public class Array_Definition3 {

	public static void main(String[] args) {
		/*
			1. 스캐너로 인풋 값을 받아서 배열 방의 크기를 지정하고, 각 방에 7의 배수와 8의 배수를 저장 후 출력
			2. 스캐너로 인풋 값을 받아서 배열 방의 크기를 지정하고, 1씩 증가하는데 4의 배수는 제외하고 저장 후 출력
			3. 스캐너로 인풋 값을 받아서 배열 방의 크기를 지정하고, 3의 배수는 저장하고, 6의 배수는 제외하고 저장 후 출력
		 */
		
		Scanner sc = new Scanner(System.in);
				
		int n ;						// 스캐너로 입력 받은 메뉴 번호
		int i ;						// 방의 크기
		int[] arr ;					// 배열 변수
		
		do {
			System.out.println("========================================");
			System.out.println("1. 각 방에 7의 배수와 8의 배수를 저장 후 출력");
			System.out.println("2. 1씩 증가하는데 4의 배수는 제외하고 저장 후 출력");
			System.out.println("3. 3의 배수 중 6의 배수를 제외하고 저장 후 출력");
			System.out.println("4. 프로그램을 종료");
			System.out.println("========================================");
			System.out.println("위의 번호 중 하나를 입력하세요 >>> ");
			
			
			n = sc.nextInt();
						// 1. 
			if ( n == 1 ) {
				System.out.println("1. 각 방에 7의 배수와 8의 배수를 저장 후 출력합니다");
				System.out.println("방의 크기를 정수로 지정하세요.");
				
				i = sc.nextInt();
				arr = new int[i];
				
				for ( i = 1 ; i < arr.length ; i++ ) {
					if ( i % 7 == 0 || i % 8 == 0 ) {
						System.out.println(arr[i]);
					}
				}
			} else if ( n == 2 ) {
				System.out.println("2. 1씩 증가하는데 4의 배수는 제외하고 저장 후 출력");
				
				
			} else if ( n == 3 ) {
				System.out.println("3. 3의 배수 중 6의 배수를 제외하고 저장 후 출력");
			
			} else if ( n == 4 ) {
				System.out.println("프로그램을 종료");
				break;
			}
		} while (true) ;
		
		// 2. 
		
	}


}