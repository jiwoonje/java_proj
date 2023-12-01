package lab.chap10.car;

import java.util.ArrayList;
import java.util.List;

public class Car_Test {

	public static void main(String[] args) {
		//
		
		// 자식 객체를 생성하면서 부모타입으로 지정 후 부모의 메소드 호출시 Overriding 된 자신의 메소드가 작동
		// car.run() - 다형성
		
		
		Car c1 = new H_Car();
		c1.run();
		
		Car c2 = new S_Car();
		c2.run();
		
		Car c3 = new K_Car();
		c3.run();
		
		// ArrayList<Car>
		// 선언
		List<Car> aList = new ArrayList<>();
		
		aList.add(c1);
		aList.add(c2);
		aList.add(c3);
		
		System.out.println("==================");
		// for 문을 사용해서 끄집어내서 출력
		for ( int i = 0 ; i < aList.size(); i++ ) {
			aList.get(i).run();
		}
	}

}
