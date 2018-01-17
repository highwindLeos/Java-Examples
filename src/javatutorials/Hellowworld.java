package javatutorials;

public class Hellowworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("헬로우 월드");
		
		// 사칙연산.
		System.out.println(1 + 2);
		System.out.println(1.2 + 1.3);
		System.out.println(2 * 5);
		System.out.println(6 / 2);
		
		// 문자열
		// 문장은 ' 작은 따옴표로 작성시 에러가 난다.
		// 문자열을 + 로 연결해서 출력할수 있다.
		
		System.out.println('레');
		System.out.println("레오데이");
		System.out.println("레오데이" + " 입니다."); 
		System.out.println("이");
		
		// 문자열 안에서 " 를 출력하고 싶다면 이스케이프를 해주어야 한다. \ " (역슬레쉬 뒤로 " 문자)
		System.out.println("Leos said \"Welcome programming world\" \n");
		
		//여러 줄을 표시하고 싶을 때는 아래와 같이 하면 된다. ( \n )  줄바꿈.
		System.out.println("HTML\n CSS\n JavaScript\n");

	}

}
