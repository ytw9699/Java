﻿package l_overloading;
class Calculator{
    int left, right;
    int third = 0;

    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
// 이름과 리턴값은 같지만 매개변수의 갯수나 시그니처는 다른 메소드를 중복으로
    //선언 할 수 있는 방법을 메소드 오버로딩(overloading)이라고 한다.

    public void setOprands(int left, int right, int third){
      this.setOprands(left, right);//중복의제거
    /*    this.left = left;
        this.right = right;*/
        this.third = third;
    }
    public void sum(){
        System.out.println(this.left+this.right+this.third);
    } 
    public void avg(){
        System.out.println((this.left+this.right+this.third)/3);
    }
}
public class a_오버로딩 {
      
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sum();       
        c1.avg();
        
        c1.setOprands(10, 20, 30);
        c1.sum();       
        c1.avg();   
    }
}
