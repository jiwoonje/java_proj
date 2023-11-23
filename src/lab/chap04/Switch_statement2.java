package lab.chap04;

import java.util.Scanner;

public class Switch_statement2 {

	public static void main(String[] args) {
		/*
		 	switch ~ case 문으로 프로그램을 작성
		 	
			월을 입력해서 해당 월은 00일 입니다.
			
			31이 출력되는 월 : 1, 3, 5, 7, 8, 10, 12월
			30이 출력되는 월 : 4, 6, 9, 11월
			28이 출력되는 월 : 2월
		
			스캐너로 월을 입력 받고, 해당 달에 대한 일을 출력
				출력 내용 : "해당 월은 00월이고, 00일까지 존재합니다."
			
		 */
		
		int month ;			// 스캐너로 input을 받는다.
		int day = 30 ;		// 
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("1 ~ 12 사이의 월을 입력하세요. 예) 1 >>>");
		
		month = sc.nextInt();
		
		switch (month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
			day += 1 ;
//			System.out.println("해당 월은 " + month + "월이고, " + (day+1) + "일까지 존재합니다.");
			System.out.printf("해당 월은 %d월이고, %d일까지 존재합니다.", month, day);
			break;
		case 4 : case 6 : case 9 : case 11 :
//			System.out.println("해당 월은 " + month + "월이고, " + day + "일까지 존재합니다.");
			System.out.printf("해당 월은 %d월이고, %d일까지 존재합니다.", month, day);
			break;
		case 2 :
			day -= 2 ;
//			System.out.println("해당 월은 " + month + "월이고, " + (day-2) + "일까지 존재합니다.");
			System.out.printf("해당 월은 %d월이고, %d일까지 존재합니다.", month, day);
			break;
		default :
			System.out.println("잘못 입력하였습니다. 1 ~ 12 사이의 정수를 입력하세요.");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
