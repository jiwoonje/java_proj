package lab.chap17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_vs_ArrayList {

	public static void main(String[] args) {
		/*
			배열		: arr	: 100번방까지. 10의 배수만 저장 후 출력. for, Arrays.toString() 두가지 출력
			컬렉션 	: aList	: 100번방까지. 20의 배수만 저장 후 출력. for 출력
		 */
		
		// 1-1. 배열 선언. 방 개수 설정
		int arr[] = new int[100];
		
		// 1-2. 10의 배수 값 입력
		for ( int i = 0, j = 10 ; i < arr.length ; i++ ) {
			arr[i] = j ;
			j += 10 ;
		}
		
		// 1-3. for 문으로 출력
		System.out.println("= for 문으로 출력 =");
		for ( int i = 0 ; i < arr.length ; i++ ) {
			System.out.print(arr[i]);
			System.out.print("\t");
		}
		System.out.println();
		
		System.out.println("= Arrays.toString() 으로 출력 =");
		// 1-4. Arrays.toString() 으로 출력
		System.out.println(Arrays.toString(arr));
		
		// 2-1. 컬렉션 선언
		List<Integer> aList = new ArrayList<Integer>();
		
		// 2-2. 20의 배수 값 입력. 방 크기는 100개
		for ( int i = 0, j = 0 ; i < 100 ; i++ ) {
			j += 20 ;
			aList.add(j);
		}
		
		// 2-3. for 문으로 출력
		System.out.println("= for 문으로 출력 =");
		for ( int i = 0 ; i < aList.size(); i++ ) {
			System.out.print(aList.get(i));
			System.out.print("\t");
		}
	
	}

}
