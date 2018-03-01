package com.Anicoboard.Javatutorials.Overriding.example1;
 
class Calculator {
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
 
class SubstractionableCalculator extends Calculator {
     
    public void sum() { // ���� Ŭ������ sum() �� ���� �Ǿ������� ���� Ŭ�������� ������ �ؼ� ����� �Ǿ���. (�������̵�)
        System.out.println("���� ����� " +(this.left + this.right)+"�Դϴ�.");
    }
     
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorDemo {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(20, 10);	
        c1.sum(); // �ش� �޼ҵ�� �������̵��� �Լ��� ȣ��ǰ� �ȴ�.
        c1.avg();
        c1.substract();
    }
}