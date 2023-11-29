package lab.chap06;

class Animal {
	
	// 1. 필드
	String aName ;
	String aColor ;
	int aLeg ;
	int aSpeed ;
	String aCry ;
	
	// 2. 생성자 : 필드의 기본 값을 입력하는 생성자
	Animal (){}
	Animal (String aName, String aColor, int aLeg, int aSpeed, String aCry){
		this.aName = aName ;
		this.aColor = aColor ;
		this.aLeg = aLeg ;
		this.aSpeed = aSpeed ;
		this.aCry = aCry ;
	}
	
	// 3. 메소드 : 필드의 모든 값을 출력하는 메소드
	void printAll () {
		System.out.println("동물 이름 : " + aName);
		System.out.println("색깔 : " + aColor);
		System.out.println("팔다리 개수 : " + aLeg);
		System.out.println("속력 : " + aSpeed);
		System.out.println("울음소리 : " + aCry);
	}
	
	// 4. 메소드 : int abc () { return aLeg + aSpeed ; }
	int abc () {
		return aLeg + aSpeed;
	}
	
}



public class Object_Definition {
	public static void main(String[] args) {
		// 객체 생성 및 테스트
		
		// 호랑이, 독수리, 사자, 개
		Animal tiger = new Animal("호랑이", "검정+노랑", 4, 100, "어흥");
		Animal eagle = new Animal("독수리", "검정", 4, 120, "없음");
		Animal lion = new Animal("사자", "갈색", 4, 80, "어흥");
		Animal dog = new Animal("개", "흰색", 4, 10, "멍멍");
		
		System.out.println("==========");
		tiger.printAll();
		System.out.println("팔다리 개수 + 속력 : " + tiger.abc());
		
		System.out.println("==========");
		eagle.printAll();
		System.out.println("팔다리 개수 + 속력 : " + eagle.abc());
		
		System.out.println("==========");
		lion.printAll();
		System.out.println("팔다리 개수 + 속력 : " + lion.abc());
		
		System.out.println("==========");
		dog.printAll();
		System.out.println("팔다리 개수 + 속력 : " + dog.abc());
		
		
		
		
		
	}
}
