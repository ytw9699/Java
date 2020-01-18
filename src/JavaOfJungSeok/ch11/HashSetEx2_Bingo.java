package ch11;
import java.util.*; 

class HashSetEx2_Bingo { 
      public static void main(String[] args) { 
            Set set = new HashSet(); 
//          Set set = new LinkedHashSet(); //이걸쓰면 오름차순정렬안됨
            int[][] board = new int[5][5]; 

            for(int i=0; set.size() < 25; i++) { 
                  set.add((int)(Math.random()*50)+1+""); 
            } 

            Iterator it = set.iterator(); 

            for(int i=0; i < board.length; i++) { 
                  for(int j=0; j < board[i].length; j++) { 
                        board[i][j] = Integer.parseInt((String)it.next());//여기서 이터레이터가 오름차순정렬해줌 그래서 중간중간 오름차순으로나오는거
                        System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]); 
                  } 
                  System.out.println(); 
            } 
      } // main
} 
