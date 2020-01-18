package o_인터페이스;
//아래는 약속을 정의하고 있는 인터페이스이다.
public interface c_Calculatable {//이렇게 약속을 처음부터 해두자 혼란이 일어나지않게
    public void setOprands(int first, int second, int third) ;
    public int sum(); 
    public int avg();
}