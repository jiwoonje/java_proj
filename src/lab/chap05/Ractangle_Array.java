package lab.chap05;

public class Ractangle_Array {

	public static void main(String[] args) {
		/*
			// 1. 배열 변수 선언
				arr[3][10]	<== 방번호 : 행 0 ~ 2, 열 0 ~ 9
							<== 행의 개수 : 3 (=arr.length)
			// 2. 배열 방에 값을 저장
				<2중 for문을 써서 값을 저장>
				0행에는 1부터 시작해서 1씩 증가 		1,2,3,...
				1행에는 3의 배수를 저장				3.6.9,...
				2행에는 7의 배수와 8의 배수를 저장		7,8,14,...
			// 3. 출력
				<2중 for문을 써서 출력>
				<Enhanced for문을 써서 출력>
				<Arrays.toString()을 써서 출력>
		 */
		
		// 1. 배열 변수 선언
		int[][] arr = new int [3][10] ;
	
		// 2. 배열 방에 값을 저장 - 0행
		for( int i = 0 ; i < arr.length ; i++) {
			for ( int j = 0 ; j < arr[i].length ; j++) {
				int a = arr[i][j] ;
				
				if ( i == 0 ) {
					for ( j = 0 ; j < arr[i].length ; j++) {
						for ( a = 1 ; j < arr[i].length ; a++ ) {
							System.out.println(arr[0][j]);
						}
					}
				}
				if ( i == 1 ) {
					for ( j = 0 ; j < arr[i].length ; j++) {
						for ( a = 3 ; j < arr[i].length ; a += 3) {
							System.out.println(arr[1][j]);
						}
					}
				}
				if ( i == 2 ) {
					if ( a % 7 == 0 || a % 8 == 0 ) {
						j++;
					}
					
				}

		
			}
			
		}
		
		// 3. 2중 for 문을 써서 출력
		for ( int i = 0 ; i < arr.length ; i++ ) {
			for (int j = 0 ; j < arr[i].length ; j++) {
				System.out.print("arr[" + i + "][" + j + "] = " + arr[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}
