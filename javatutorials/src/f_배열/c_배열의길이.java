package f_배열;

public class c_배열의길이 {
	
    public static void main(String[] args) {
    	//String[] classGroup = { "최진혁", "최유빈", "한이람", "이고잉" }; //이것과 같은 의미
        String[] classGroup = new String[4];//4개의 원소를 담을수있는 배열
        
        classGroup[0] = "최진혁";//0번 인덱스에 최진혁 저장
        System.out.println(classGroup.length);
        //length는 담겨진 원소의 갯수가 아니라 담을수있는 원소의 갯수 length는 길이
        //.length는 배열에 실제 담긴 데이터의 숫자를 의미하는 것이 아니라 
        //배열을 처음 생성할 때 지정한 배열의 크기를 의미한다는 점을 주의하자
        classGroup[1] = "최유빈";
        System.out.println(classGroup.length);//4
        classGroup[2] = "한이람";
        System.out.println(classGroup.length);
        classGroup[3] = "이고잉";
        System.out.println(classGroup.length);
    }
}