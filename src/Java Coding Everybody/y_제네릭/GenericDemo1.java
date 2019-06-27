﻿package y_제네릭;
class StudentInfo{
    public int grade;
   StudentInfo(int grade){ //생성자
    	this.grade = grade;
  }
}
class StudentPerson{//중복
    public StudentInfo info;
    StudentPerson(StudentInfo info){
    	this.info = info;
    	}
}
class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
}
class EmployeePerson{//중복
    public EmployeeInfo info;
    EmployeePerson(EmployeeInfo info){ this.info = info; }
}
public class GenericDemo1 {
    public static void main(String[] args) {
        StudentInfo si = new StudentInfo(2);
        StudentPerson sp = new StudentPerson(si);
        System.out.println(sp.info.grade); // 2
        
        EmployeeInfo ei = new EmployeeInfo(1);
        EmployeePerson ep = new EmployeePerson(ei);
        System.out.println(ep.info.rank); // 1
    }
}