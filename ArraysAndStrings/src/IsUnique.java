import java.util.*;

/**
 * Checks if all characters in given string are unique
 * checkUniqueNoData checks if all characters are unique without using additional data structures (char array)
 */

public class IsUnique {
    public static void main(String args[]) throws Exception {
        System.out.println("Enter a string to check if all characters are unique");
        Scanner scan = new Scanner(System.in);
        String inputString = scan.next();

        boolean result = checkUnique(inputString);

        StringBuilder output = new StringBuilder("All characters in the given string are ");
        output.append(result ? "unique" : "not unique");
        System.out.println(output);
    }

    /**
     *
     * @param str input string
     * @return true if all characters are unique, otherwise false
     *
     * Assumes all characters are lower case
     */

    private static boolean checkUnique(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }

    /**
     *
     * @param in input string
     * @return true if all characters are unique, otherwise false
     *
     */
    private static boolean checkUniqueNoData(String in) {

        for (int i = 0; i < in.length() - 1; i++) {
            for (int j = i + 1; j < in.length(); j++) {
                if (in.charAt(i) == in.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
