package Z_스트림;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx{
		
		public void prevStream() {
			
		}
	
	    public static void main(String[] args) {
	    	
	    	String[] strArr = { "bbb", "aaa", "ccc"};
	    	List<String> strList = Arrays.asList(strArr);
	    	
	    /*	for(String str : strArr) {
	    		System.out.println(str);
	    	}
	    	
	    	for(String str : strList) {
	    		System.out.println(str);
	    	}
	    	
	    	System.out.println();
	    	
	    	Arrays.sort(strArr);
	    	Collections.sort(strList);
	    	
	    	for(String str : strArr) {
	    		System.out.println(str);
	    	}
	    	
	    	for(String str : strList) {
	    		System.out.println(str);
	    	}*/
	    			
	    	Stream<String> strStream1 = strList.stream(); // 스트림을 생성
	    	Stream<String> strStream2 = Arrays.stream(strArr); // 스트림을 생성
	    	
	    	strStream1.sorted().forEach(System.out::println);
	    	strStream2.sorted().forEach(System.out::println);
	    	
	    }
}
