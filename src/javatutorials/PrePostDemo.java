package javatutorials;

public class PrePostDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 3;
		i++;
		
		System.out.println(i); // 4 ���
		
		++i; //1�� ���� ������.
		System.out.println(i); // 5���
		
		System.out.println(++i); // 6���
		System.out.println(i++); // 6���. (����� ���� �ǰ� ������ ��)
		System.out.println(i); // 7��� (������ �� �Ŀ� ����ϱ⶧���� 7�� ���)
		
		// �������� �켱����
		
		int a = 4 - 3 * 6;  // -14 ��� (���ϱⰡ ���� �����)
		System.out.println(a);

	}
}
