package chap17.ex02;

import java.util.ArrayList;
import java.util.List;

public class Student_Test {

	public static void main(String[] args) {
		// 1. Student 객체 생성
		
		Student s1 = new Student();		// 기본 생성자 호출
		Student s2 = new Student("홍길동");
		Student s3 = new Student("1111");
		Student s4 = new Student("김길동", "서울");
		Student s5 = new Student("최길동", "서울", 1111);
		
		// 2. 객체를 ArrayList<Student>에 저장
			// <타입> : 제너릭 타입. 객체형 타입이 와야함.
					// Boolean, Byte, Short, Integer, Long, Float, Double, Short, Character
		List<Student> aList = new ArrayList<>();
		
		// 3. aList 에 Student 객체 저장
		aList.add(s1);
		aList.add(s2);
		aList.add(s3);
		aList.add(s4);
		aList.add(s5);
		
		System.out.println("======================");
		
		int[] arr = new int[] {1, 2, 1, 3, 3, 3, 4, 5, 5};
		
		// 1. Method (클래스, 타입) ==> 객체 생성
		Method m = new Method();	// 기본 생성자
		
		m.arryListOut(aList);
		
		System.out.println("======================");
		
		m.arryOutput(arr, 5);
		
		System.out.println("======================");
		
		m.nameAddr(aList);
		
		
		
		
		
	}

}
