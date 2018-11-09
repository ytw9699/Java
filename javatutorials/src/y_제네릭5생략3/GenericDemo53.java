package y_제네릭5생략3;

import y_제네릭5생략3.Person;

class Person<U,K>{
     public void printInfo(U info,K infos){
         System.out.println(info);
         System.out.println(infos);
     }
 }
  public class GenericDemo53{
  public static void main(String[] args) {
  Person<String,Integer> p1 = new Person<String,Integer>();
  p1.printInfo("1",1);
 }
}