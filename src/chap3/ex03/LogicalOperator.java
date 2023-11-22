package chap3.ex03;

public class LogicalOperator {

	public static void main(String[] args) {
		/* 논리 연산자 : 결과 값으로 true or false 를 리턴		<== 아주 중요
				&& (AND) : 모두 true 여야 true
							true && true 	=> true
							true && false	=> false
							false && true	=> false
							false && false	=> true
					
				|| (OR)	  : 하나라도 true 이면 true
							true || true 	=> true
							true || false	=> true
							false || true	=> true
							false || false	=> false
							
				^ (XOR)	  : 앞뒤가 같을 때 false, 앞뒤의 값이 다를 때 true
							true ^ true 	=> false
							true ^ false	=> true
							false ^ true	=> true
							false ^ false	=> false
							
				! (NOT)	  : true 일 때 false, false 일 때 true
		 */
		
		// && (AND) 연산 : 모두 true 여야 true
		System.out.println(true && true);	// true
		System.out.println(true && false);	// false
		System.out.println(false && true);	// false
		System.out.println(false && false);	// false
		
		// || (OR) 연산 : 하나라도 true 이면 true
		System.out.println(true || true);	// true
		System.out.println(true || false);	// true
		System.out.println(false || true);	// true
		System.out.println(false || false);	// false
		
		// ^ (XOR) 연산 : 앞뒤가 같을 때 false, 앞뒤의 값이 다를 때 true
		System.out.println(true ^ true);	// false
		System.out.println(true ^ false);	// true
		System.out.println(false ^ true);	// true
		System.out.println(false ^ false);	// false
		
		// ! (NOT) 연산 : true 일 때 false, false 일 때 true
		System.out.println(!true);			// false
		System.out.println(!false);			// true
		
		
		// 논리 연산자는 쇼트 버킷이 발생할 수 있다. 쇼트 서킷을 방지하기 위해서 비트 연산자를 사용해서 방지할 수 있다.
			// 앞의 연산자로만 결과값을 유추할 수 있을 때 뒤에 오는 값은 처리하지 않고 결과를 돌려줌
				// AND 연산에서 앞에 false가 올 경우 쇼트 서킷 발생
				// OR 연산에서 앞에 true가 올 경우 쇼트 서킷 발생
		
	}

}
