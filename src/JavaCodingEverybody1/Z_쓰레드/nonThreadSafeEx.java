package Z_쓰레드;

 class Singleton {

    int num;

    private static Singleton singleton = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return singleton;
    }

    public int add(){
        return ++ num;
    }

}

class nonThreadSafeEx{
	
    public static void main(String[] args) {
    	
        Singleton singleton = Singleton.getInstance();

        for(int i=0; i<10; i++) {
        	
        	new Thread(() -> {
                System.out.println(singleton.add());
            }).start();
        }
    }
}