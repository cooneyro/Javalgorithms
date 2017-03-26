import java.util.Scanner;

public class PalPerm {
    public static void main(String args[]) throws Exception {
        System.out.println("Enter word to check if it's a permutation of a palindrome");
        Scanner scan = new Scanner(System.in);

        String inputString = scan.next();

        boolean result = isPalindromePermutation(inputString);

        String output = ("Given string is " + (result?"":"not ") + "permutation of palindrome");
        System.out.println(output);
    }

    private static boolean isPalindromePermutation(String input){
        if((input.length()==1)||(input.equals(new StringBuilder(input).reverse().toString()))){
            return true;
        }
        int[] characters = new int[128];
        for( char w : input.toCharArray()){
            characters[(int) w]++;
        }

        int oddCount = 0;

        for(int i=0;i<characters.length;i++){
            if((characters[i]%2)==1){
                oddCount++;

            }
            if(oddCount>1){
                return false;
            }
        }
        return true;
    }
}
