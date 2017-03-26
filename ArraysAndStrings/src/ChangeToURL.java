import java.util.*;

public class ChangeToURL {
    private static void replaceSpaces(char[] in, int trueLength){

        int spaces = 0;
        int i;
        for(i=0;i<trueLength;i++){
            if(in[i] == ' '){
                spaces++;
            }
        }

        int index = trueLength + spaces * 2;
        if(trueLength < in.length){
            in[trueLength] = '\0';
        }

        for(i = trueLength-1;i>=0;i--){
            if(in[i]==' '){
                in[index-1] = '0';
                in[index-2] = '2';
                in[index-3] = '%';
                index = index-3;
            }
            else{
                in[index-1] = in[i];
                i--;
            }
        }
    }
}
