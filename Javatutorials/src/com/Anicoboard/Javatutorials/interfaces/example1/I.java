package com.Anicoboard.Javatutorials.interfaces.example1;

interface I{ // 인터페이스
    public void z();
}
 
class A implements I{ // 해당 인터페이스는 A 클래스에서 I 인터페이스안의 메소드를 구현해야한다.
    public void z(){}
}