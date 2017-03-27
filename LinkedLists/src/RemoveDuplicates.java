import java.util.HashSet;

public class RemoveDuplicates {
    /**
     *
     * @param head Head of linked list
     *
     *  Removes duplicates in linked list given head node
     */

    public void removeDups(Node head){
        HashSet<Integer> set = new HashSet<>();
        Node prev = null;

        Node current = head;

        while(current != null){
            if(set.contains(current.data)){
                prev.next = current.next;
            }
            else{
                set.add(current.data);
                prev = current;
            }
            current = current.next;
        }
    }

    public void removeDupsNoStorage(Node head) {
        Node current = head;
        Node lookAhead = current;
        while (current.next != null) {
            while (lookAhead.next != null) {
                if (current.data == lookAhead.next.data) {
                    if(lookAhead.next.next!=null){
                        lookAhead.next = lookAhead.next.next;
                    }
                    else{
                        lookAhead.next = null;
                    }
                }
                lookAhead = lookAhead.next;
            }
            current = current.next;
        }
    }

    public class Node{
        private Node next;
        private int data;

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
    }

}
