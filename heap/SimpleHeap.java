import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int temp = sc.nextInt();
            int num;
            switch(temp){
                case 1:
                num = sc.nextInt();
                queue.add(num);
                break;
                case 2:
                num = sc.nextInt();
                queue.remove(num);
                break;
                default:
                System.out.println(queue.peek());
            }
            
        }
    }
}
