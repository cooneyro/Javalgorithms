public class Q4PalindromePermutation {
    /**
     * @param input string to be checked
     * @return true if input string is permutation of palindrome, otherwise false
     */
    public static boolean isPalindromePermutation(String input){
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
