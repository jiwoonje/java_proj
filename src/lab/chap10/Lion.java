package lab.chap10;

public class Lion extends Animal {			// Animal의 자식

	
	String lionName ;
	int lionAge ;
	
	void lionCategory () {
		System.out.println("사자는 고양이과입니다.");
	}
	
	void lioninfo() {
		System.out.println("사자의 이름은 " + name + "이고, 나이는 " + age + "세 입니다.");
	}
}
