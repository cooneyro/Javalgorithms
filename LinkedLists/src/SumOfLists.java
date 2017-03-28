//Calculate sum of two lists where each node represents a digit

public class SumOfLists extends Node {

    /**
     *
     * @param firstList Head of first list to be added (least significant digit first)
     * @param secondList Head of second list to be added
     * @return sum of lists (least significant digit first)
     */
    public Node SumListsRevOrder(Node firstList, Node secondList){
        Node first = firstList, second = secondList;
        Node newList = null;
        boolean carry =false;
        int result;

        while(first!=null && second!=null){
            result = (first.getData() + second.getData() + (carry?1:0));
            if(result>=10){
                carry = true;
                result %= 10;
            }
            else{
                carry = false;
            }

            if(newList==null){
                newList = new Node(result);
            }
            else{
                newList.addToEnd(result);
            }
        }

        if(first!=null){
            while(first!=null){
                result = (first.getData() + (carry?1:0));
                if(result>=10){
                    result %= 10;
                }
            }
        }
        else if(second!=null){
            while(second!=null){
                result = (second.getData() + (carry?1:0));
                if(result>=10){
                    result %= 10;
                    carry = true;
                }
                else{
                    carry = false;
                }
            }
        }


        if(carry){
                newList.addToEnd(1);  //if both lists are same length and carry left over after
                                            //traversing, add carry digit to end of sum list
            }

    }
}
