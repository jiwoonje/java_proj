package lab.chap04;

import java.util.Scanner;

public class Do_While_Statement2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a ;
		int b ;
		int c ;
		int d ;
		int e ;
		int f ;
		int g ;
		int h ;
		int i ;
		int j ;
		int k ;
		
		// 스캐너로 인풋 받는 변수
		
		do {
			System.out.println("=====================================================================");
			System.out.println("1. 구구단 출력 || 2. 19단 출력 || 3. 1~1000 까지 3의 배수 출력 || ");
			System.out.println("4. 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇 개인지 출력하는 프로그램");
			System.out.println("5. 프로그램 종료");
			System.out.println("=====================================================================");
			System.out.println("위 내용을 선택하세요. 예) 1 >>>");
		
			a = sc.nextInt();
			
			
			if ( a == 1 ) {
				System.out.println("1. 구구단 출력");
				// for 구구단 출력 프로그램
				for ( int aa = 1 ; aa < 10 ; aa++ ) {
					System.out.println("===" + aa + "단 출력===");
					for ( int bb = 1 ; bb < 10 ; bb++ ) {
						System.out.printf( "%d * %d = %d \t", aa, bb, aa*bb );
					}
					System.out.println();
				}
				
			} else if ( a == 2 ) {
				System.out.println("2. 19단 출력");
				// 19단 출력 프로그램 작성
				for ( int cc = 1 ; cc < 10 ; cc++ ) {
					System.out.println("19 * " + cc + " = " + 19*cc);
				}
				
			} else if ( a == 3 ) {
				System.out.println("3. 이름 출력");
				// for 문 , while 문 , do while 문 / 1~1000 까지 3의 배수 출력 프로그램 작성
				for ( int dd = 1 ; dd < 1000 ; dd++ ) {
					if ( dd % 3 == 0 ) {
						System.out.println(dd);
					}
				}
				
				
				
			} else if ( a == 4 ) {
				System.out.println("4. 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇 개인지 출력하는 프로그램");
			
				b = sc.nextInt();
				c = sc.nextInt();
				d = sc.nextInt();
				e = sc.nextInt();
				f = sc.nextInt();
				g = sc.nextInt();
				h = sc.nextInt();
				i = sc.nextInt();
				j = sc.nextInt();
				k = sc.nextInt();
				
				System.out.println( ((b%2)+(c%2)+(d%2)+(e%2)+(f%2)+(g%2)+(h%2)+(i%2)+(j%2)+(k%2)) + " 개 입니다.");
				
				
			} else if ( a == 5 ) {
				System.out.println("5. 프로그램을 종료합니다.");
				break;
			} 				
		}while (true) ;
		

		sc.close();									// 메모리에서 스캐너를 제거해야함

	}

}
