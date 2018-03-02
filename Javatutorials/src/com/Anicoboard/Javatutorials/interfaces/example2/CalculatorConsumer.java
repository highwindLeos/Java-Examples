package com.Anicoboard.Javatutorials.interfaces.example2;

class Calculator implements Calculatable { // �� Ŭ������ Calculatable �������̽��� �����ϰ� �ִ�. (implements)
	// Calculatable �ȿ� �����ϴ� �޼ҵ�� �Ű����� ���������� ��� �����Ͽ� �� Ŭ������ �����ؾ��Ѵ�.
	// �׷��� �ʴٸ� �ڹٴ� ���������� ������ ���� �ʴ´�.
	
    int first, second, third;
    
    public void setOprands(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    
    public int sum() {
        return this.first + this.second + this.third;
    }
    
    public int avg() {
        return (this.first + this.second + this.third) / 3;
    }
}

public class CalculatorConsumer {
	
    public static void main(String[] args) {
    	
        Calculator c = new Calculator();
        c.setOprands(10, 20, 30);
        
        System.out.println(c.sum());
        System.out.println(c.avg());
        System.out.println(c.sum() + c.avg());
        
    }
}