package z_Collection_Framework;

import java.util.ArrayList;
 
public class b_ArrayList와_제네릭활용 {
 
    public static void main(String[] args) {
        
        ArrayList<String> al = new ArrayList<String>();//제네릭활용
        //타입의 안정성을 가져옴
       /* public void add(String element){
        ArrayList.this.add(nextIndex++, element);
        }*/
        
        al.add("one");
        al.add("two");
        al.add("three");
        
        for(int i=0; i<al.size(); i++){
            String value = al.get(i);//(String)형변환 필요없음
            //get을 통해 가져오는게 string타입이기때문
            /*public String get(int index) {
            	return elementData[index];
            	}*/
            System.out.println(value);
        }
    }
}