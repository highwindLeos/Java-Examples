package javatutorials;

public class OrDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if (true || true) { // 출력
			System.out.println(1);
		}
		
		if (true || false) { // 출력
			System.out.println(2);
		}
		
		if (false || true) { // 출력
			System.out.println(3);
		}
		
		if (false || false) { // 실행 되지 않음
			System.out.println(4);
		}

	}

}
