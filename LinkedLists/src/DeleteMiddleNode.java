public class DeleteMiddleNode extends Node {
    /** 1->2->3 - 1->3
     *
     * @param node Node to be deleted, in middle of list (not first or last node)
     *
     *             Next node data/pointer is copied to node to be deleted to preserve pointer from node preceding
     *             node to be deleted
     */
    public void deleteNode(Node node){
        Node nextNode = node.next;
        node.setNext(nextNode.next);
        node.setData(nextNode.getData());
        nextNode = null;
    }
}
