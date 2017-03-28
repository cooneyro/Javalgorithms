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

    public void addToList(int data){
        Node lastNode = this;
        while(lastNode.next!=null){
            lastNode = lastNode.next;
        }
        lastNode.next = new Node (data);
    }

    public void setData(int data){
        this.data = data;
    }

    public int getData(){
        return this.data;
    }

    /**
     *
     * @param nextNode node to be pointed to
     */
    public void setNext(Node nextNode){
        this.next = nextNode;
    }
}
