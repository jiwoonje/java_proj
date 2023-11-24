package lab.chap04;

import java.util.Scanner;

public class Do_While_Statement2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a ;										// 스캐너로 인풋 받는 변수
		
		do {
			System.out.println("=====================================================================");
			System.out.println("1. 구구단 출력 || 2. 19단 출력 || 3. 1~1000 까지 3의 배수 출력 || 4. 프로그램 종료");
			System.out.println("=====================================================================");
			System.out.println("위 내용을 선택하세요. 예) 1 >>>");
		
			a = sc.nextInt();
			
			if ( a == 1 ) {
				System.out.println("1. 구구단 출력");
				// for 구구단 출력 프로그램
				for ( int i = 1 ; i < 10 ; i++ ) {
					System.out.println("===" + i + "단 출력===");
					for ( int j = 1 ; j < 10 ; j++ ) {
						System.out.printf( "%d * %d = %d ", i, j, i*j );
						System.out.println();
					}
				}
				
			} else if ( a == 2 ) {
				System.out.println("2. 19단 출력");
				// 19단 출력 프로그램 작성
				for ( int i = 1 ; i < 10 ; i++ ) {
					System.out.println("19 * " + i + " = " + 19*i);
				}
				
			} else if ( a == 3 ) {
				System.out.println("3. 이름 출력");
				// for 문 , while 문 , do while 문 / 1~1000 까지 3의 배수 출력 프로그램 작성
				for ( int i = 1 ; i < 1000 ; i++ ) {
					if ( i % 3 == 0 ) {
						System.out.println(i);
					}
				}
				
			} else if ( a == 4 ) {
				System.out.println("4. 프로그램을 종료합니다.");
				break;
			} 				
		}while (true) ;
		

		sc.close();									// 메모리에서 스캐너를 제거해야함
	}

}
