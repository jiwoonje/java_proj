package lab.chap03;

import java.util.Scanner;

public class ConditionalOperator2 {

	public static void main(String[] args) {
		// Scanner 로 "안녕" 문자열을 입력, "안녕" 문자열이 입력 되었을 때 "안녕하세요" "안녕 못합니다."
			// == 을 사용하면 안됨, .equals("안녕") ?
			// 삼항 연산자 사용
		
		Scanner sc = new Scanner(System.in);
		
		String aa ;				// 참조 자료형. 변수의 값이 Heap에 저장
		
		System.out.println("문자열을 입력하세요. >>>");
		
		aa = sc.next();		
		
		System.out.println( aa == "안녕" ? "안녕하세요." : "안녕 못합니다.");
		System.out.println( aa .equals ("안녕") ? "안녕하세요." : "안녕 못합니다.");
		
		// 참조 자료형일 때 변수의 값은 Heap 공간에 저장됨. Stack 에는 변수명과 Heap 에 저장된 값의 번지가 저장
		
	}

}
