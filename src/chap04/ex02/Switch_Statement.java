package chap04.ex02;

public class Switch_Statement {

	public static void main(String[] args) {
		/*
			switch : 기본적으로 case문 내에서 break; 
				- default에서는 break;없이 빠져나올 수 있다.
				
		 */
		
		// switch 문
		
		int val1 = 6 ;
		
		switch (val1) {		// val1 : 점프변수, case에 값으로 점프	<== 정수, 문자, 문자열
		case 1 :
			System.out.println("A");
			break;
		case 2 :
			System.out.println("B");
			break;
		case 3 :
			System.out.println("C");
			break;
		case 4 :
			System.out.println("D");
			break;
		default :									// case에 없는 값은 default로 점프
			System.out.println("F");
		}
		
		
		// 문자(char)가 들어간 switch 문
		
		char ch = 'a' ;
		
		switch (ch) {
		case 'a' :
			System.out.println("A 학점입니다.");
			break;
		case 'b' :
			System.out.println("B 학점입니다.");
			break;
		case 'c' :
			System.out.println("C 학점입니다.");
			break;
		case 'd' :
			System.out.println("D 학점입니다.");
			break;
		default :
			System.out.println("F 학점입니다.");
		}
		
		
		System.out.println("===============");
		
		// 문자열(String)이 들어간 switch 문
		
		String abc = "일요일";
		
		switch (abc) {
		case "월요일" :
			System.out.println("월요일은 자바를 공부합니다.");
			break;
		case "화요일" :
			System.out.println("화요일은 데이터베이스를 공부합니다.");
			break;
		case "수요일" :
			System.out.println("수요일은 html을 공부합니다.");
			break;
		case "목요일" :
			System.out.println("목요일은 자바를 공부합니다.");
			break;
		case "금요일" :
			System.out.println("금요일은 JSP를 공부합니다.");
			break;
		case "토요일" :
			System.out.println("토요일은 운동을 합니다.");
			break;
		case "일요일" :
			System.out.println("일요일은 TV를 시청합니다.");
			break;
		default :
			System.out.println("잘못된 값을 입력하였습니다. 요일을 입력하세요.");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}


