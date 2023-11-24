package lab.chap04;

public class While_Statement {

	public static void main(String[] args) {
		/*
			1000부터 1까지 / 5씩 감소하면서 출력 : for 문, while 문으로 출력
		 */
		
		// for
		
		for ( int i = 1000 ; i > 0 ; i -= 5 ) {
			System.out.println("for 문으로 출력 : " + i);
		}
		
		
		
		// while
		
		int i = 1000 ;
		while ( i > 0 ) {
			System.out.println("while 문으로 출력 : " + i);
			i -= 5 ;
		}
		
		
		
	}

}
