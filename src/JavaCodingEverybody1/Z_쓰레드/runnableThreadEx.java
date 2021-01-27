package Z_쓰레드;

public class runnableThreadEx {
	
	public static void main(String args[]) {
		
		Runnable runnable  = new runnableThread();
		
		Thread thread = new Thread(runnable);	  // 생성자 Thread(Runnable target)

		thread.start();
		
		/*Runnable 인터페이스 를 구현한 경우 , runnable 인터페이스를 구현한 클래스의 인스턴스를
		생성한 다음, 이 인스턴스를 Thread클래스의 생성자의 매개변 수로 제 공해야 한다*/
	}
}


class runnableThread implements Runnable {
	
	public void run() {
		
		for(int i=0; i < 5; i++) {
			// Thread.currentThread() - 현재 실행중인 Thread를 반환한다.
		    System.out.println(Thread.currentThread().getName());
		}
	}
}


