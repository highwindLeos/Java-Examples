package com.Anicoboard.Javatutorials.interfaces.example2;

class Calculator implements Calculatable { // 이 클래스는 Calculatable 인터페이스를 구현하고 있다. (implements)
	// Calculatable 안에 존재하는 메소드와 매개변수 데이터형을 모두 참고하여 이 클래스를 구현해야한다.
	// 그렇지 않다면 자바는 오류가나고 컴파일 되지 않는다.
	
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