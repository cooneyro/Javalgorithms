// There are 3 types of edits on string - replace, insert or remove a character
// Check if two strings are 1 or 0 edits away from each other
// Eg. pale -> pal = true
//     pale -> bake = false
//     pale -> pae = true
// **Doesn't check if input strings are actually words**

public class Q5OneAway {
    private static boolean isOneAway(String input1, String input2){
        if(input1==null || input2 ==null){
            if(input1==null && input2==null){
                return true;
            }else if(input1!=null){
                if(input1.length()==1 || input1.length()==0){
                    return true;
                }
            }else{
                if(input2.length()==1 || input2.length()==0){
                    return true;
                }
            }
        }else if(input1.equals(input2)){
            return true;
        }else if(Math.abs(input1.length()-input2.length())>1){
            return false;
        }

        char[] toChar1 = input1.toCharArray();
        char[] toChar2 = input2.toCharArray();

        int differenceCount = 0;
        int char2i = 0;
        for(int i=char2i;i<toChar1.length && differenceCount<=1;i++){
            if(toChar1[i]!=toChar2[char2i]) {
                if (toChar1[i + 1] == toChar2[char2i]) {
                    i++;
                } else if (toChar1[i] == toChar2[char2i + 1]) {
                    char2i++;
                }
                differenceCount++;
            }
            char2i++;
        }
        return differenceCount<=1;
    }


    public static void main(String []args){
        System.out.println(isOneAway("pale","pae"));
        System.out.println(isOneAway("pale","bake"));
        System.out.println(isOneAway("palle","pale"));
    }
}
