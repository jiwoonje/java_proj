package lab.chap10.fruit;

public class Strawberry extends Fruit {
	
	Strawberry(){}
	Strawberry (String name, int cnt, int price){
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
