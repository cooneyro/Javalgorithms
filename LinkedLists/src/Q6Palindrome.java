// Check if linked lists is palindrome

import java.util.Stack;

public class Q6Palindrome extends Node{
    private static boolean isPalindrome(Node head){
        Node firstRunner = head;
        Stack<Node> myStack = new Stack<>();
        Node secondRunner = firstRunner.next;

        while(secondRunner.next.next!=null){
            myStack.push(firstRunner);
            firstRunner = firstRunner.next;
            secondRunner = secondRunner.next.next;
        }

        myStack.push(firstRunner);

        if(secondRunner.next!=null){ //odd number of elements in list
            firstRunner = firstRunner.next.next;
        }


        while(firstRunner!=null){
            Node temp = myStack.pop();
            if(temp.getData()!=firstRunner.getData()){
                return false;
            }else{
                firstRunner=firstRunner.next;
            }
        }
        return true;
    }

    public static void main(String []args){
        Node head = new Node(1);
        Node myList = head;
        for(int i=2;i<6;i++){
            Node newNode = new Node(i);
            myList.next = newNode;
            myList = newNode;
        }


        for(int i=6;i>0;i--){
            Node newNode = new Node(i);
            myList.next = newNode;
            myList = newNode;
        }

        System.out.println(isPalindrome(head));
    }

}
