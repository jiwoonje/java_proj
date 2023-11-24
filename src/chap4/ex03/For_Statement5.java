package chap4.ex03;

public class For_Statement5 {

	public static void main(String[] args) {
		/*
		 	반복문(for, while, dowhile) 내에서 continue; break; 키워드 사용		<== if 조건을 넣어서 사용
		 		- continue;	<== 아래 코드는 실행하지 않고 증감식으로 이동
		 		- break;	<== 반복문을 빠져나온다
		 */
		
		// continue ;
		for ( int i = 1 ; i < 10 ; i++ ) {
			if ( i % 3 == 0 ) {						// 3의 배수일 때 true
				continue;
			}
			System.out.println("i 변수의 값 : " + i);
			System.out.println("369의 배수 출력 안 됨");
		}
		System.out.println("=================");
		
		// break ;
		for ( int i = 1 ; i < 10 ; i++ ) {
			System.out.println("i 변수값 출력 : " + i);
			if ( i == 7 ) break;
		}
		
	}

}
