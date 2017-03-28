// Base class for node

public class Node{
    public Node next;
    private int data;

    public Node(){
        this.data = 0;
        this.next = null;
    }

    public Node(int thisData){
        this.next = null;
        this.data = thisData;
    }

    public void addToEnd(int data){
        Node lastNode = this;
        while(lastNode.next!=null){
            lastNode = lastNode.next;
        }
        lastNode.next = new Node (data);
    }

    /**
     *
     * @param head Previous head of list
     * @param data Data to be added as new head
     * @return new head of list
     */
    public Node addToHead(Node head,int data){
        Node firstNode = new Node(data);
        firstNode.next = head;
        return firstNode;
    }

    public void setData(int data){
        this.data = data;
    }

    public int getData(){
        return this.data;
    }

    /**
     *
     * @param newList Node to be set as end node of current list
     */
    public void setLast(Node newList){
        Node runner = this;
        while(runner.next!=null){
            runner=runner.next;
        }
        runner.next=newList;
    }

    /**
     *
     * @param nextNode node to be pointed to
     */
    public void setNext(Node nextNode){
        this.next = nextNode;
    }
}
