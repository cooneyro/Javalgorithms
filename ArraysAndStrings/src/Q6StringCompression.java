// String compression using counts of letters
// Eg. aabbcc becomes a2b2c2
// **Assumes string has only uppercase and lowercase letters
public class Q6StringCompression {
    private static String compressString(String input){
        StringBuilder myBuilder = new StringBuilder();
        for(int i=0;i<input.length();i++){
            char temp = input.charAt(i);
            int count = 1;
            while(i<input.length()-1 && temp==input.charAt(i+1)){
                i++;
                count++;
            }
            myBuilder.append(temp + "" + count); // was considering only executing this if count>1
                                                 // but would make decompression more difficult
        }
        return (myBuilder.length()>input.length()?input:myBuilder.toString());
    }

    public static void main(String []args){
        String in = "aabbcccccc";
        System.out.println(in+  " compressed is " + compressString(in));
        in = "abc";
        System.out.println(in+  " compressed is " + compressString(in));
        in = "AaBBBBBBBBBBcdddd";
        System.out.println(in+  " compressed is " + compressString(in));
    }
}
