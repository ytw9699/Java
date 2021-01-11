package Z_쓰레드;

import java.util.Random;

public class multiThreadEx extends Thread {
 
    private int id = -1;
 
    public multiThreadEx(int id){
        this.id = id;
    }
 
    public void run(){
 
        System.out.println( id + "번 쓰레드 동작 중..." );
        
        Random r = new Random(System.currentTimeMillis());
        
        try{
            
        	long s = r.nextInt(3000);
            Thread.sleep(s); // 쓰레드를 잠시 멈춤
            
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println( id + "번 쓰레드 동작 종료..." );
    }
    
    public static void main(String[] args) {
        
        System.out.println("Start main method.");
        
        for(int i = 0 ; i < 10 ; i++ ){
        	
            multiThreadEx test = new multiThreadEx(i);
            test.start(); // 이 start 메소드를 실행하면 Thread 내의 run()메소드를 수행한다.
        }
        
        System.out.println("End main method.");
    }
}
