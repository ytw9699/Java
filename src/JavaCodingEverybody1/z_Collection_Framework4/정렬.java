package z_Collection_Framework4;//여기는 다시해보자..알고리즘,자료구조와 연관도된듯..
import java.util.*;//콜렉션 프레임워크에서 정렬하는법
class Computer implements Comparable{
    int serial;//인스턴스 변수
    String owner;//인스턴스 변수
    Computer(int serial, String owner){//생성자
        this.serial = serial;
        this.owner = owner;
    }
    public int compareTo(Object test) {//Comparable인터페이스는 compareTo를 구현하도록 강제
        return this.serial - ((Computer)test).serial;
    }//메소드 sort를 실행하면 내부적으로 compareTo를 실행하고 그 결과에 따라서 객체의 선후 관계를 판별하게 된다.
    public String toString(){//스트링 리턴
        return serial+" "+owner;//시리얼과 오너의값 리턴
    }
}
public class 정렬 {
    public static void main(String[] args) {
        List<Computer> computers2 = new ArrayList<Computer>();
        computers2.add(new Computer(500, "egoing"));//3개의 객체를 어레이리스트 컨테이너에담음
        computers2.add(new Computer(200, "leezche"));
        computers2.add(new Computer(3233, "graphittie"));
        Iterator i = computers2.iterator();
        System.out.println("before");
        while(i.hasNext()){
            System.out.println(i.next());//어레이리스트는 순서가있어서 순서대로출력
        }//낮은숫자가 먼저오게 정렬해보자 그럴려면 Comparable하는 인터페이스를 사용해야함
        Collections.sort(computers2);//Collections라는 클래스 정렬이나 데이터와관련된 작업을도와주는 클래스 그안에 메소드는
        //거의 static이라 객체생성없이 바로접근//sort라는 메소드에 리스트타입을 전달하면 정렬해줌//리스트만해줌
        //public static <T extends Comparable<? super T>> void sort(List<T> list) {//리스트라는 매개변수
        //제네릭이 T인데 그 T라는 computers2가 Comparable인터페이스를 구현해한다는것
        //결국  Comparable인터페이스를 구현하는 리스트만 정렬해준다는거
        System.out.println("\nafter");
        i = computers2.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}