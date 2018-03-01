package com.Anicoboard.Javatutorials.Inheritance;

class Calculator {
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left; // member variable �� ���� (this)
        this.right = right; // member variable �� ���� (this)
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
    
}
 
class SubstractionableCalculator extends Calculator { //Calculator class �� ����ϰ� �ִ� Ŭ����. (Calculator�� �޼ҵ��� ����� ������´�)
	
    public void substract() { //����� �ϴ� �Լ��� ����
        System.out.println(this.left - this.right);
    }
    
}

  
public class CalcuatorDemo1 {

    public static void main(String[] args) {
    	 
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20); //�Լ��� �Ű����� ���� ����.
        c1.sum();
        c1.avg();
        c1.substract();
        
    }

}
