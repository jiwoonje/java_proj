package lab.chap04;

public class For_Statement2 {

	public static void main(String[] args) {
		/*
		 	실습 : 2중 For 문을 사용해서 1 ~ 19단까지, 각 단을 옆으로 출력 printf
		 		-- 6단, 7단, 12단 제외하고 출력 : continue 
		 */
		
		for ( int i = 1 ; i <= 19 ; i++ ) {
			if ( i == 6 || i == 7 || i == 12 ) {
				continue;
			}
			for ( int j = 1 ; j <= 9 ; j++ ) {
				System.out.printf("%d * %d = %d \t", i, j, i*j);
			}
			System.out.println();
			System.out.println();
		}
		
		
		System.out.println("==== 19단 출력 ====");
		for ( int i = 1 ; i < 20 ; i++ ) {
			if ( i == 6 || i == 7 | i == 12 ) continue;			
			for ( int j = 1 ; j < 10 ; j++) {
				System.out.printf("%d * %d = %d \t", i, j, i*j);
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
