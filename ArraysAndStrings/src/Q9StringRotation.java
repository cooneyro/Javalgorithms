//Check if one string is a rotation of another using only 1 call to isSubstring

public class Q9StringRotation {
    /**
     *
     * @param input1 First input string
     * @param input2 Second input string
     * @return
     */
    public static boolean isRotation(String input1, String input2){
        int length = input1.length();
        if(length==input2.length() && length > 0){
            String inputRevised = input1 + input1;
            return inputRevised.contains(input2);
        }
        return false;
    }

    public static void main(String [] args){
        String in1 = "hello";
        String in2 = "elloh";
        String in3 = "helol";

        System.out.println(in2 + " is " + (isRotation(in1,in2)?"":"not ") + "a rotation of " + in1);
        System.out.println(in3 + " is " + (isRotation(in1,in3)?"":"not ") + "a rotation of " + in1);
    }
}
