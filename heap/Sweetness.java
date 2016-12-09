import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int elements=in.nextInt();
    int sweetness=in.nextInt();
    PriorityQueue<Integer> Cookies=new PriorityQueue<Integer>();
    int operations=0;
    while(elements-->0){
        Cookies.offer(in.nextInt());
    }
    try{
      while(Cookies.peek() < sweetness){
          int newsweetness=(1*Cookies.poll()+2*Cookies.poll());
          Cookies.offer(newsweetness);
          operations++;
      }
      if(Cookies.peek()>= sweetness){
        System.out.println(operations);
      }
    }catch(Exception e){
       System.out.println(-1);
     }
  } 
}
