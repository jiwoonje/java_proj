package chap3.ex03;

public class LogicalOperator {

	public static void main(String[] args) {
		/* 논리 연산자 : 결과 값으로 true or false 를 리턴		<== 아주 중요
				&& (AND) : 모두 true 여야 true
							true && true 	=> true
							true && false	=> false
							false && true	=> false		쇼트 서킷
							false && false	=> false		쇼트 서킷
					
				|| (OR)	  : 하나라도 true 이면 true
							true || true 	=> true			쇼트 서킷
							true || false	=> true			쇼트 서킷
							false || true	=> true
							false || false	=> false
							
				^ (XOR)	  : 앞뒤가 같을 때 false, 앞뒤의 값이 다를 때 true
							true ^ true 	=> false
							true ^ false	=> true
							false ^ true	=> true
							false ^ false	=> false
							
				! (NOT)	  : true 일 때 false, false 일 때 true
		 */
		
		
		System.out.println("====================");
		// && (AND) 연산 : 모두 true 여야 true
		System.out.println(true && true);	// true
		System.out.println(true && false);	// false
		System.out.println(false && true);	// false
		System.out.println(false && false);	// false
		
		System.out.println("====================");
		// || (OR) 연산 : 하나라도 true 이면 true
		System.out.println(true || true);	// true
		System.out.println(true || false);	// true
		System.out.println(false || true);	// true
		System.out.println(false || false);	// false
		
		System.out.println("====================");
		// ^ (XOR) 연산 : 앞뒤가 같을 때 false, 앞뒤의 값이 다를 때 true
		System.out.println(true ^ true);	// false
		System.out.println(true ^ false);	// true
		System.out.println(false ^ true);	// true
		System.out.println(false ^ false);	// false
		
		System.out.println("====================");
		// ! (NOT) 연산 : true 일 때 false, false 일 때 true
		System.out.println(!true);			// false
		System.out.println(!false);			// true
		
		
		System.out.println("====================");
		// 논리 연산자는 쇼트 버킷이 발생할 수 있다. 쇼트 서킷을 방지하기 위해서 비트 연산자를 사용해서 방지할 수 있다.
			// 앞의 연산자로만 결과값을 유추할 수 있을 때 뒤에 오는 값은 처리하지 않고 결과를 돌려줌
				// AND 연산에서 앞에 false가 올 경우 쇼트 서킷 발생
				// OR 연산에서 앞에 true가 올 경우 쇼트 서킷 발생
		
		// 쇼트 서킷이 발생되지 않는 경우 : && 연산에서 앞에 true 일 때 뒤의 값을 확인 후 결과 리턴
								// || 연산에서 앞에 false 일 때 뒤의 값을 확인 후 결과 리턴
		
		// 쇼트 서킷이 발생되는 경우 : && 연산에서 앞에 false 일 때 뒤의 값은 무시하고 결과 리턴
							// || 연산에서 앞에 true 일 때 뒤의 값은 무시하고 결과 리턴
		
		
		// && 연산에서 쇼트 서킷이 발생
		int val10 = 3 ;
		
		System.out.println(false && ++val10 > 6);		// 실제 값과 상관없이 false가 앞에 있는 && 이라 연산 안 함
		System.out.println(true && ++val10 > 6);		// false ; 연산 발생
		System.out.println(val10);						// 3
		
		System.out.println("====================");
		// || 연산에서 쇼트 서킷이 발생
		int val11 = 3 ;
		
		System.out.println(true || ++val11 > 6);		// 실제 값과 상관없이 true가 앞에 있는 || 이라 연산 안 함
		System.out.println(false || ++val11 > 6);		// false ; 연산 발생
		System.out.println(val11);						//4
		
		System.out.println("====쇼트 서킷을 방지하는 방법");
		// 비트연산자를 사용해서 쇼트 서킷을 방지할 수 있다. & (AND) , | (OR)
			// 비트 연산, 논리 연산 (쇼트 서킷을 방지할 때 사용함)
		
		// AND 연산에서 쇼트 서킷 방지 : & 사용하기
		int val12 = 3 ;
		
		System.out.println(false & ++val12 > 6);		// false ; 연산 발생
														// 비트연산자가 논리 연산 할 때도 사용 가능, 쇼트 서킷 방지
		System.out.println(false && ++val12 > 6);		// 실제 값과 상관없이 false가 앞에 있는 && 이라 연산 안 함
		System.out.println(val12);						// 4
		
		System.out.println("====================");
		// OR 연산에서 쇼트 서킷 방지 : | 사용하기
		int val13 = 3 ;
		
		System.out.println(true | ++val13 > 6);			// true ; 연산 발생
		System.out.println(true || ++val13 > 6);		// 실제 값과 상관없이 true가 앞에 있는 || 이라 연산 안 함
		System.out.println(val13);						// 4
		
		
		
		
		
		
	}

}
