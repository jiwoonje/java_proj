package lab.chap02;

import java.util.Scanner;

public class UsingScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 스캐너로 각 변수의 값을 인풋 받아서 
		String stu1 ; 	// 학생1
		String stu2 ; 	// 학생2
		String stu3 ; 	// 학생3
		
		int kor ; 		// 국어 점수
		int eng ;		// 영어 점수
		int math ;		// 수학 점수
		
		int hap ;		// 점수의 합계
		double avg ;	// 평균
		
		System.out.println("학생 1의 이름 국어점수 영어점수 수학점수를 입력하세요. >>> ");
		// 코드 부문
		System.out.println("홍길동의 모든 점수의 합계는 333점 이고 평균은 88 입니다.");		// 출력 결과
		
				
		System.out.println("=======첫번째 학생======");				
		
		System.out.println("학생 1의 [이름 국어점수 영어점수 수학점수]를 입력하세요. >>> ");
		
		stu1 = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		hap = (kor + eng + math);
		avg = (hap/3.0);
		
		System.out.println(stu1 + "의 모든 점수의 합계는 " + hap + "점 이고 평균은 " + avg + " 입니다.");
		System.out.println("=============");
		
		System.out.println("=======두번째 학생======");				
		System.out.println("학생 2의 [이름 국어점수 영어점수 수학점수]를 입력하세요. >>> ");
		
		stu2 = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		hap = (kor + eng + math);
		avg = (hap/3.0);
		
		System.out.println(stu2 + "의 모든 점수의 합계는 " + hap + "점 이고 평균은 " + avg + " 입니다.");
		System.out.println("=============");
		
		System.out.println("=======세번째 학생======");				
		System.out.println("학생 3의 [이름 국어점수 영어점수 수학점수]를 입력하세요. >>> ");
		
		stu3 = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		hap = (kor + eng + math);
		avg = (hap / 3.0);
		
		System.out.println(stu3 + "의 모든 점수의 합계는 " + hap + "점 이고 평균은 " + avg + " 입니다.");
		
		
		
		
		
		

	}

}
