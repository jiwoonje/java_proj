package lab.chap17.account;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Account_Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Account a = new Account();
		
			
		
     out: do {
			System.out.println("=====================");
			System.out.println("0. 이름과 계좌번호 등록");
			System.out.println("1. 입금");
			System.out.println("2. 출금");
			System.out.println("3. 종료");
			System.out.println("=====================");
			System.out.println("위 내용의 정수를 입력하세요.");
			int select = sc.nextInt();
			
			switch (select) {
			case 0:
				
				// 이름, 계좌번호 입력
				System.out.println("이름 : ");
				a.name = sc.next();
					
				System.out.println("계좌번호 : ");
				a.account = sc.nextInt();
					
				System.out.println(a);
				break;
				
			case 1:
				// 입금
				System.out.println("입금할 금액을 입력하세요. >>>");
				a.deposit(sc.nextInt());
				break;
				
			case 2:
				// 출금
				System.out.println("출금할 금액을 입력하세요. >>>");
				a.withdraw(sc.nextInt());
				break;
				
			case 3:
				// 종료
				System.out.println("프로그램 종료");
				break out;
			}
			
		} while (true);
     
	}

}
