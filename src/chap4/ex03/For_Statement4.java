package chap4.ex03;

public class For_Statement4 {

	public static void main(String[] args) {
		// 이중 for : for 내의 for
		
		for ( int i = 0 ; i < 10 ; i++ ) {
			System.out.println("바깥쪽 for문 : " + i);
//			for ( int i = 0 ) {					// 한 블락 내에서 변수가 같아서 오류 발생
			for ( int j = 0  ; j < 10 ; j++ ) {					// 한 블락 내에서 변수가 같아서 오류 발생
				System.out.println("i 변수 : " + i + " j 변수 : " + j);
			}
			
			System.out.println("===================");
		}
		
		
		// 이중 for : for 문을 사용해서 구구단 출력
		
		System.out.println("====구구단 아래로 출력====");
		for ( int i = 1 ; i < 10 ; i++ ) {
			System.out.println("====" + i + "단 출력====");
			for ( int j = 1  ; j < 10 ; j++ ) {
				System.out.println(i + " * " + j + "= " + i*j);
			}
					
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		System.out.println("====구구단 옆으로 출력====");
		for ( int i = 1 ; i < 10 ; i++ ) {						// 1단
			System.out.println("====" + i + "단 출력====");
			for ( int j = 1  ; j < 10 ; j++ ) {
				System.out.printf("%d * %d = %d ", i, j, i*j);
			}					
			System.out.println();
			System.out.println();
		}
	}

}
