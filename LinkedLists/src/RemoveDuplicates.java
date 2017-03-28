import java.util.HashSet;

public class RemoveDuplicates extends Node{
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
            if(set.contains(current.getData())){
                prev.next = current.next;
            }
            else{
                set.add(current.getData());
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
                if (current.getData() == lookAhead.next.getData()) {
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


}
