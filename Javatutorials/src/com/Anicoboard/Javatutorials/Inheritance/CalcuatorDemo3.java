package com.Anicoboard.Javatutorials.Inheritance;
 
class DivisionableCalculator extends MultiplicationableCalculator { 
	//MultiplicationableCalculator class �� ����ϰ� �ִ� Ŭ����. 
	//(Calculator�� �޼ҵ��� ��ɵ� ����ϰ� �ֱ⶧���� �ش� �޼ҵ嵵 ��밡���ϴ�.)
	
    public void Division() { //�������� �ϴ� �Լ��� ����
        System.out.println(this.left / this.right);
    }
    
}
  
public class CalcuatorDemo3 {

    public static void main(String[] args) {
    	 
    	DivisionableCalculator c1 = new DivisionableCalculator(); // Class �� �̿��� ��ü ����.
        c1.setOprands(20, 10); //�Լ��� �Ű����� �Է°��� ����.
        c1.sum();
        c1.avg();
        c1.Multiplication();
        c1.Division();
    }

}
