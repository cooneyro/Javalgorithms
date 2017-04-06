//Partitioning linked list around value x

public class Q4Partition extends Node{
    /**
     *
     * @param head Head of list to be partitioned
     * @param x value around which list will be partitioned
     * @return Node pointing to head of partitioned list
     */
    public Node partitionList(Node head, int x){
        Node runner = head;
        Node leftList = null;
        Node rightList = null;
        while(runner!=null){
            if(runner.getData()<x){
                if(leftList==null){
                    leftList = new Node(runner.getData());
                }
                else{
                    leftList = addToHead(leftList, runner.getData());
                }
            }
            else{
                if(rightList==null){
                    rightList = new Node(runner.getData());
                }
                else{
                    rightList.addToHead(rightList, runner.getData());
                }
            }
        }

        leftList.setLast(rightList);
        return leftList;

    }
}
