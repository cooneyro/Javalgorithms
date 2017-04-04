package heap;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RunningMedian {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        PriorityQueue<Integer> minh = new PriorityQueue<Integer>();
        PriorityQueue<Integer> maxh = new PriorityQueue<Integer>(11,new Comparator<Integer>() {

            public int compare(Integer lhs, Integer rhs) {
                if(lhs<rhs) return +1;
                if(lhs>rhs) return -1;
                return 0;
            }
        });
        
        int min=0,max=0;
        
        for(int i=0; i<n; i++){
            
            int val = scan.nextInt();
            
            if(min==0) {minh.add(val);min++;}
            else if((max!=0)&&(val<maxh.peek())){
                maxh.add(val); max++;
                while(max-min>1) {
                    int m = maxh.poll(); max--;
                    minh.add(m); min++;
                }
                
            } else{
                minh.add(val); min++;
                while(min>max){
                    int m = minh.poll(); min--;
                    maxh.add(m); max++;
                }
            }    
            
            if(max==min) {System.out.println(((double)minh.peek()+(double)maxh.peek())/2);}
            else if(max==0) {System.out.println((double)minh.peek());}
            else {System.out.println((double)maxh.peek());}
            
        }
        
    }
}
