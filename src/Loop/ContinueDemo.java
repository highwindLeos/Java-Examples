package Loop;

public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for( int i = 0; i < 10; i++) {
			
			if (i == 5) { continue; } // 일단 종료하지만. 다음 반복문을 실행한다.
			
			System.out.println("Coding working days" + i);
		}
	}

}
