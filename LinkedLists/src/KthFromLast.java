
public class KthFromLast extends Node {


    /**
     *
     * @param head Head of linked list
     * @param k Kth from last Node of list
     * @return Returns Kth from last Node of list
     */
    public Node getKthFromLast(Node head, int k){
        Node node = head;
        int length = 0;

        while(node.next != null){
            node = node.next;
            length++;
        }

        return getK(head,length-k);

    }

    public Node getK(Node node, int k){
        if(k==0){
            return node;
        }
        else {
            return getK(node.next, k - 1);
        }
    }
}
