package lab.chap10;

public class Animal {	
	
	Animal() {
		super();
	}
	
	String name ;
	int age ;
	
	Animal (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void water() {
		System.out.println("모든 동물은 물을 좋아한다.");
	}
	
	void sleep() {
		System.out.println("모든 동물은 잠을 잔다.");
	}
}
