package javatutorials;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = 1 + 2;
		System.out.println(result); //3
		
		result = result - 1;
		System.out.println(result); //2
		
		result = result * 2;
		System.out.println(result); //4
		
		result = result / 2;
		System.out.println(result); //2
		
		result = result + 8;
		System.out.println(result); //10
		
		result = result % 7; 
		System.out.println(result); //나머지 연산 3
		
		// 나머지 계산 결과
		System.out.println("-----------------------------------------------");

		
		int a = 3;
		System.out.println(0%a); //0
		System.out.println(1%a); //1
		System.out.println(2%a); //2
		System.out.println(3%a); //0
		System.out.println(4%a); //1
		System.out.println(5%a); //2
		System.out.println(6%a); //0

		//문자열을 합해서 출력
		System.out.println("-----------------------------------------------");

		String firstString = "This is ";
		String secondString = "a concatenated String";
		String thirdString = firstString + secondString;
		
		System.out.println(thirdString);
		
	}

}
