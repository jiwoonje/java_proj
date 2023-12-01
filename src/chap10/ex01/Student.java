package chap10.ex01;

public class Student extends Human {	// student : 자식. human : 부모.
	
	// Human 클래스의 필드와 메소드가 Student 클래스로 상속되었다.
	
	// 기본 생성자 생략됨
	Student(){
		super();	// 부모 클래스
	}
	
	Student(int studentID) {
		super("김똘똘", 20);
		this.studentID = studentID;
		this.stuName = super.name;
		super.eat();
	}
	
	// 필드 :
	int studentID ;
	String stuName ;
	
	// 메소드 :
	void goToSchool () {
		System.out.println("모든 학생은 학교를 갑니다.");
	}

	void studentInfo() {
		System.out.println("학생 이름은 " + name + "이고, 나이는 " + age + "세 입니다.");
										// name, age : Human class(부모)에 있는 값
	}
}
