package com.Anicoboard.Javatutorials.Constructor;

class Calculator {
    int left, right;
 
    public Calculator(int left, int right) { //������ �޼ҵ� (Constructor)
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
 
public class CalculatorDemo1 {
 
    public static void main(String[] args) {
 
        Calculator c1 = new Calculator(20, 10); // �����ڸ޼ҵ� ȣ��
        c1.sum();
        c1.avg();
 
        Calculator c2 = new Calculator(20, 40); // �����ڸ޼ҵ� ȣ��
        c2.sum();
        c2.avg();
    }
 
}