package lab.chap17.account;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Account {
	
	// 1. 필드
	String name;				// 이름
	int account;				// 계좌번호
	int money = 10000;
	
	
	
	
	// 2. 생성자
	Account(){}
	Account(String name, int account) {this.name = name; this.account = account; }
	

	
	
	
	// 3. 메소드
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAccount() {
		return account;
	}
	
	public void setAccount(int account) {
		this.account = account;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
	
	void deposit (int money) {	// 입금. 출력 : OOO 원이 입금되었습니다. 잔액은 000 원 입니다.
		this.money += money;
		System.out.println(money + " 원이 입금되었습니다. 잔액은 " + this.money + " 원입니다.");
	}
	
	void withdraw (int money) {	// 출금. 출력 : 000 원이 출금되었습니다. 잔액은 000 원 입니다.
		this.money -= money;
		System.out.println(money + " 원이 출금되었습니다. 잔액은 " + this.money + " 원입니다.");
		
	}
	@Override
	public String toString() {
		return "Account [name=" + name + ", account=" + account + ", money=" + money + "]";
	}
	
	
	
	
	
	
	
}
