package Loop;

public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for ( int i = 1; i <= 10; i++) {
			
			System.out.println("coding working days " + i );
		
		}
		
		System.out.println("---------------------------------");
		
		for ( int i = 2; i <= 20; i = i+2) {
			
			System.out.println("coding working days " + i );
		
		}
		
		System.out.println("---------------------------------");
		
		int max = 100;
		
		for ( int i = 1; i <= max; i++) { // Max 의 값에 따라서 반복문을 제어할수 있다.
			
			System.out.println("coding working days " + i );
		
		}
		
		System.out.println("---------------------------------");
		
		for ( int i = 0; i <= 10; i++) { // 2의 배수를 출력할수 있다.
			
			System.out.println("coding working days " + (i+1)*2 );
		
		}
		
	}

}