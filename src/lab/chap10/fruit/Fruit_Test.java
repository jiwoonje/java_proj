package lab.chap10.fruit;

import java.util.ArrayList;
import java.util.List;

public class Fruit_Test {

	public static void main(String[] args) {
		/*
			1. 자식 개체를 생성 후
				Apple("사과", 30, 5000) Fruit 타입으로 정리
				Banana("바나나", 44, 6000)
				Strawberry("딸기", 55, 7000)
			2. ArrayList 객체 3개를 저장
			3. For 문으로 ArrayList를 꺼내서 totalPrice() 호출시 전체
			4. 출력 : "000 의 전체 가격은 000 입니다.
			
			자식 객체를 생성하면서 부모 타입으로 저장하면, 배열이나 클래스에 동일한 타입으로 저장
		 */
		
		
		Fruit f1 = new Apple("사과", 30, 5000);
		f1.totalPrice();
		
		Fruit f2 = new Banana("바나나", 44, 6000);
		f2.totalPrice();
		
		Fruit f3 = new Strawberry("딸기", 55, 7000);
		f3.totalPrice();
		
		System.out.println("==================================");
		List<Fruit> aList = new ArrayList<>();
		
		aList.add(f1);
		aList.add(f2);
		aList.add(f3);
		
		for ( int i = 0 ; i < aList.size(); i++ ) {
			aList.get(i).totalPrice();
		}
	}
}
