package com.Anicoboard.Javatutorials.Inheritance;
 
class MultiplicationableCalculator extends Calculator { //Calculator class �� ����ϰ� �ִ� Ŭ����. (Calculator�� �޼ҵ��� ����� ������´�)
	
    public void Multiplication() { //������ �ϴ� �Լ��� ����
        System.out.println(this.left * this.right);
    }
    
}
  
public class CalcuatorDemo2 {

    public static void main(String[] args) {
    	 
    	MultiplicationableCalculator c1 = new MultiplicationableCalculator();
        c1.setOprands(10, 20); //�Լ��� �Ű����� �Է°��� ����.
        c1.sum();
        c1.avg();
        c1.Multiplication();
    }

}
