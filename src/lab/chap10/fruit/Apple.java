package lab.chap10.fruit;

public class Apple extends Fruit{

	// 부모의 피드가 상속
	
	Apple (String name, int cnt, int price){
		super.name = name;
		super.cnt = cnt;
		super.price = price;
	}
	
	
	@Override
	void totalPrice() {
		// 출력 : "000 과일의 전체 가격은 000 입니다."
		System.out.println(name + " 과일의 전체 가격은 "+ (cnt*price) + " 입니다.");
	}
}
