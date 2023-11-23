package lab.chap04;

import java.util.Scanner;

public class If_Statement {

	public static void main(String[] args) {
		
		/*
			if ~ else if / .equals("월요일") 
			
			콘솔에서 "월요일" 입력되었을 때 출력 "월요일은 자바를 공부합니다."
			콘솔에서 "화요일" 입력되었을 때 출력 "화요일은 데이터베이스를 공부합니다."
			콘솔에서 "수요일" 입력되었을 때 출력 "수요일은 html javascript를 공부합니다."
			콘솔에서 "목요일" 입력되었을 때 출력 "목요일은 JSP를 공부합니다."
			콘솔에서 "금요일" 입력되었을 때 출력 "금요일은 Spring을 공부합니다."
			콘솔에서 "토요일" 입력되었을 때 출력 "토요일은 운동을 합니다."
			콘솔에서 "일요일" 입력되었을 때 출력 "일요일은 TV를 봅니다.
			
		 */
		
		
		System.out.println("=====================");
		
		Scanner sc = new Scanner(System.in);
		
		String day ;
		
		System.out.println("요일을 한글로 입력하세요. 예) 월요일 >>>");
		
		day = sc.next();
		
		if ( day.equals("월요일") ) {
			System.out.println("월요일은 자바를 공부합니다.");
		} else if ( day.equals("화요일") ) {
			System.out.println("화요일은 데이터베이스를 공부합니다.");
		} else if ( day.equals("수요일") ) {
			System.out.println("수요일은 html javascript를 공부합니다.");
		} else if ( day.equals("목요일") ) {
			System.out.println("목요일은 JSP을 공부합니다.");
		} else if ( day.equals("금요일") ) {
			System.out.println("금요일은 Spring를 공부합니다.");
		} else if ( day.equals("토요일") ) {
			System.out.println("토요일은 운동을 합니다.");
		} else if ( day.equals("일요일") ) {
			System.out.println("일요일은 TV를 봅니다.");
		} else {
			System.out.println("잘못 입력했습니다. 요일을 입력하세요.");
		}
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
