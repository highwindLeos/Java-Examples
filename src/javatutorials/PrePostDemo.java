package javatutorials;

public class PrePostDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 3;
		i++;
		
		System.out.println(i); // 4 출력
		
		++i; //1씩 증가 연산자.
		System.out.println(i); // 5출력
		
		System.out.println(++i); // 6출력
		System.out.println(i++); // 6출력. (출력이 먼저 되고 연산이 됨)
		System.out.println(i); // 7출력 (연산이 된 후에 출력하기때문에 7이 출력)
		
		// 연산자의 우선순위
		
		int a = 4 - 3 * 6;  // -14 출력 (곱하기가 먼저 연산됨)
		System.out.println(a);

	}
}
