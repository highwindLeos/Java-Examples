package Loop;

public class WhileDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		// i의 값이 10보다작다면 true. 크다면 false가 된다. 현제의 값은 1이기때문에 true.
		
		while (i <= 10) {
			System.out.println("coding working days" + i);
			// i 에 1을 더한다. 반복문의 중괄호의 마지막 라인에 도달하면 반복문의 조건은 검사한다.
			i++;
		}
		
	}

}
