package lab.chap10;

public class Dog extends Animal {			// Animal의 자식

	String dogName ;
	int dogAge ;
	
	void dogCategory () {
		System.out.println("개는 개과입니다.");
	}
	
	void  doginfo() {
		System.out.println("개의 이름은 " + name + "이고, 나이는 " + age + "세 입니다.");
	}
}
