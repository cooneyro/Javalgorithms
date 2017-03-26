import java.util.Scanner;

public class CheckPermutation {
    public static void main(String args[]) throws Exception {
        System.out.println("Enter two strings to check if permutations of each other (lower case)");
        Scanner scan = new Scanner(System.in);

        String inputString1 = scan.next();
        String inputString2 = scan.next();

        boolean result = checkPerm(inputString1, inputString2);

        String output = ("Given strings are " + (result?"":"not ") + "permutations of each other");
        System.out.println(output);
    }

    /**
     *
     * @param string1 First input string
     * @param string2 Second input string
     * @return true if string1 and string2 are permutations of each other, false otherwise
     */

    public static boolean checkPerm(String string1, String string2){
        if(string1.length()!=string2.length()){
            return false;
        }

        int[] characters = new int[128];

        for(int i=0;i<characters.length;i++){
            characters[i] = 0;
        }

        for(int i=0;i<string1.length();i++){

            characters[(int) string1.charAt(i)] +=1;
            characters[(int) string2.charAt(i)] -=1;
        }

        for(int i=0;i<characters.length;i++){
            if(characters[i]!=0){
                return false;
            }
        }
        return true;
    }
}
