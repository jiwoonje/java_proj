package lab.chap10;

public class Inheritance_Test {

	public static void main(String[] args) {
		// 상속 설정 후 필드의 메소드 생성
		// Animal
		//		 Tiger
		//			  TigerChild
		//		 Lion
		//		 Dog
		
		// 업캐스팅 <====> 다운캐스팅
		
		// Animal 객체 생성
		
		// Tiger 객체 생성
		Tiger t1 = new Tiger();
		t1.name = "호돌이";
		t1.age = 5;
		
		t1.water();
		t1.sleep();
		
		t1.tigerCategory();
		t1.tigerinfo();
		
		System.out.println("=============");
		// Lion 객체 생성
		Lion l1 = new Lion();
		l1.name = "라온이";
		l1.age = 7;
		
		l1.water();
		l1.sleep();
		
		l1.lionCategory();
		l1.lioninfo();
		
		System.out.println("=============");
		// Dog 객체 생성
		Dog d1 = new Dog();
		d1.name = "보리";
		d1.age = 3;
		
		d1.water();
		d1.sleep();
		
		d1.dogCategory();
		d1.doginfo();
		
	}

}
