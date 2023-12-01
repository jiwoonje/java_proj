package lab.chap10;

public class Tiger extends Animal {		// Animal을 상속

	Tiger(){
		super();
	}
	
	Tiger(String tigerName) {
		super("호돌이", 5);
		this.tigerName = tigerName;
		this.tigerAge = tigerAge;
		super.water();
	}
	
	String tigerName ;
	int tigerAge ;
	
	void tigerCategory () {
		System.out.println("호랑이는 고양이과입니다.");
	}
	
	void tigerinfo() {
		System.out.println("호랑이의 이름은 " + tigerName + "이고, 나이는 " + tigerAge + "세 입니다.");
	}
	
}
