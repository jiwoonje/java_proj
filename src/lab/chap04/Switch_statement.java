package lab.chap04;

import java.util.Scanner;

public class Switch_statement {

	public static void main(String[] args) {
		/*
		 	switch문을 사용해서 출력 / if ~ else if ~ 로 바꾸어서 출력
		 	
			스캐너로 점수를 입력 받으세요.
			1	"당신은 금메달을 획득했습니다."
			2	"당신은 은메달을 획득했습니다."
			3	"당신은 동메달을 획득했습니다."
				"정수 1 ~ 3 중 하나를 넣으세요."
				
		 */
		
		Scanner sc = new Scanner (System.in);
		
		
		int score  ;
		
		System.out.println("정수로 1 ~ 3 사이의 값을 입력하세요. >>>");
		
		score = sc.nextInt();
		
		System.out.println("====switch 문으로 출력====");
		switch (score) {
		case 1 : case 10 : case 100 :
			System.out.println("당신은 금메달을 획득했습니다.");
			break;
		case 2 : case 20 : case 200 : 
			System.out.println("당신은 은메달을 획득했습니다.");
			break;
		case 3 : case 30 : case 300 : 
			System.out.println("당신은 동메달을 획득했습니다.");
			break;
		default :
			System.out.println("정수 1 ~ 3 중 하나를 넣으세요.");
		}
		
		
		
		System.out.println("====if else 문으로 출력====");
		if ( score == 1 || score == 10 || score == 100 ) {
			System.out.println("당신은 금메달을 획득했습니다.");
		}else if (score == 2 || score == 20 || score == 200 ) {
			System.out.println("당신은 은메달을 획득했습니다.");
		}else if (score == 3 || score == 30 || score == 300 ) {
			System.out.println("당신은 동메달을 획득했습니다.");
		}else {
			System.out.println("정수 1 ~ 3 중 하나를 넣으세요.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
