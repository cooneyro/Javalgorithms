// Given two linked lists, determine if they are intersecting. If they are, return the node where they intersect

public class Q7Intersecting extends Node {
    public Node getIntersectingNode(Node listOne, Node listTwo){
        Node runnerOne = listOne, runnerTwo = listTwo;
        int lengthOne = 0, lengthTwo = 0;
        while(runnerOne!=null){
            runnerOne = runnerOne.next;
            lengthOne++;
        }

        while(runnerTwo != null){
            runnerTwo = runnerTwo.next;
            lengthTwo++;
        }

        if(runnerOne == runnerTwo){ //intersecting at end of list
            runnerOne = listOne;
            runnerTwo = listTwo;
            int countForward = Math.abs(lengthOne-lengthTwo); //number of places to advance from head
            if(lengthOne>lengthTwo){                          //of longer linked list
                while(countForward>0){
                    runnerOne = runnerOne.next;
                }
            }
            else{
                while(countForward>0){
                    runnerTwo = runnerTwo.next;
                }
            }

            while(runnerOne!=runnerTwo){
                runnerOne = runnerOne.next;
                runnerTwo = runnerTwo.next;
            }

            return runnerOne;
        }
        else{
            return null;
        }



    }

}
