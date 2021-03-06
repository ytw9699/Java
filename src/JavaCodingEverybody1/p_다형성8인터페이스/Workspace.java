﻿package p_다형성8인터페이스;

interface father{}
interface mother{}
interface programmer{
    public void coding();
}

class Steve implements father, programmer{
	
    public void coding(){
        System.out.println("fast");//빠르게
    }
}

class Rachel implements mother, programmer{
	
    public void coding(){
        System.out.println("elegance");//우아하게
    }
}

public class Workspace{
	
    public static void main(String[] args){
    	
        programmer employee1 = new Steve();
        programmer employee2 = new Rachel();
         
        employee1.coding();
        employee2.coding();
    }
}