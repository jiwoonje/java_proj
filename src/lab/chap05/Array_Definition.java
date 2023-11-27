package lab.chap05;

public class Array_Definition {

	public static void main(String[] args) {
		// 배열 변수명 : arr
			// 배열 방의 갯수는 : 1000개 생성, 0 ~ 999, arr.length : 2000
			// 배열의 각 방에 3의 배수를 저장함 (for)
			// 배열의 각 방이 내용을 출력 (for)
		
		/*int[] arr = new int[1000];
			for ( int i = 0, j = 1 ; i < 1000 ; i++ ) {
				arr[i] = j;
				j++;
				if ( j % 3 == 0) {
					System.out.println(arr[i]);
				}
			}
		*/
		
		// 1. 배열 변수를 선언
		int[] arr = new int[1000];
		
		String[] arr1 = new String[10];		// arr1의 각 방에 문자열
		arr1[0] = "자바";
		arr1[1] = "HTML";
		
		System.out.println(arr.length);			// 배열 방의 개수를 출력
		System.out.println(arr1.length);		// 10
		
		// 2. 1000개의 방에 3의 배수를 저장
		for ( int i = 0, j = 3 ; i < arr.length ; i++ ) {
			arr[i] = j;
			j+=3;
//			System.out.println(arr[i]);
		}
		
		// 3. 1000개의 각 방의 값을 출력
		for ( int i = 0 ; i < arr.length ; i++ ) {
			System.out.println(arr[i]);
		}
		
	}

}
