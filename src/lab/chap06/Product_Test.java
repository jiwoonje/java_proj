package lab.chap06;

public class Product_Test {

	public static void main(String[] args) {
		// 1. Product 객체 4개 생성
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();

		// 2. Setter를 사용해서 객체의 필드의 값을 주입
		p1.setIdx(01);
		p1.setProName("거울");
		p1.setQty(5);
		p1.setYear(2018);
		p1.setProColor("white");
		
		p2.setIdx(02);
		p2.setProName("가습기");
		p2.setQty(7);
		p2.setYear(2034);
		p2.setProColor("silver");
		
		p3.setIdx(03);
		p3.setProName("휴대폰");
		p3.setQty(30);
		p3.setYear(2023);
		p3.setProColor("rosegold");
		
		p4.setIdx(04);
		p4.setProName("텀블러");
		p4.setQty(2);
		p4.setYear(2022);
		p4.setProColor("pink");
		
		// 3. 배열 arr 방 크기 10개 : 0 ~ 9번방. 각 방에 4개의 객체 주입
		Product[] arr = new Product[10];
		
		arr[0] = p1 ;
		arr[1] = p2 ;
		arr[2] = p3 ; 
		arr[3] = p4 ;
		
		// 4. 배열의 값을 꺼내서 Product 변수에 담고 출력
		for ( int i = 0 ; i < arr.length ; i++ ) {
			Product prod1 = arr[i];
			if ( arr[i] != null ) {
			System.out.println(prod1);
			}
		}
	}

}
