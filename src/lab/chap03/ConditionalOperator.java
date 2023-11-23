package lab.chap03;

import java.util.Scanner;

public class ConditionalOperator {

	public static void main(String[] args) {
		// 스캐너 장착, 정수, % 나머지 값, || 연산자 사용, 삼항 연산자 사용
				
		// 1. 스캐너로 정수 값을 인풋 받아서 : 출력 내용 : 인풋 받은 값은 00이고, 짝수 입니다. (홀수 입니다.)
		
		// 2. 스캐너로 값을 인풋 받아서 : 출력 내용 : 인풋 받은 값은 00이고, 3, 6, 9의 배수 입니다. (배수가 아닙니다.)
		
		System.out.println("============");
		
		Scanner sc = new Scanner(System.in);
		
		// 1.
		
		int aa ;
		
		System.out.println("정수 값 하나를 입력하세요. >>>");
		
		aa = sc.nextInt();
				
		System.out.printf("인풋 받은 값은 " + aa + " 이고, ");
		System.out.println( ((aa % 2) == 0) ? "짝수 입니다." : "홀수 입니다.") ;
				
		
		// 2.
			
		System.out.printf("인풋 받은 값은 %d 이고, ", aa);
		System.out.println( aa % 3 == 0 || aa % 6 == 0 || aa % 9 == 0 ? "3, 6, 9의 배수 입니다." : "3, 6, 9의 배수가 아닙니다." );
		
		
	}

}
