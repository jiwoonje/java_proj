package lab.chap10.fruit;

public class Fruit {	// 부모 클래스
	
	String name ;		// 과일의 이름
	int cnt;			// 과일의 개수
	int price;			// 과일의 가격
	
	// 메소드
	void totalPrice () {
		System.out.println("모든 과일의 가격 합계는 : " + (cnt*price) );
	}

}
