package com.Anicoboard.Javatutorials.abstractclass.example1;

abstract class A{
    public abstract int b(); // �߻� �޼ҵ�. �߻�޼ҵ�� ������ ������ ���� �ʰ� �Լ��� ������ �ִ�.
    public void d(){
        System.out.println("world");
    }
}

class B extends A{
    public int b(){ return 1; } 
    // A �� ����ؾ߸� ������ ���� �ʴ´�. 
    // A Class �� �����ϴ� b() ���� �߻� �޼ҵ��̱� ������ �ݵ�� �������̵� �ؾ߸� ������ ���� �ʴ´�.
    // ��ȯ���� int �̱� ������ 1�� �����ش�.
}

public class AbstractDemo {
	
    public static void main(String[] args) {
    	
        B obj = new B();
        System.out.println(obj.b());
        
    }
    
}