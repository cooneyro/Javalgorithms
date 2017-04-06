// Given 2 sorted arrays, A and B, where A has large enough buffer to hold B
// Merge B into A in sorted order
public class Q1SortedMerge {
    private static void mergeArrays(int[] arrayA, int[] arrayB, int lastA, int lastB){
        int indexA = lastA -1;
        int indexB = lastB -1;
        int indexMerged = lastA + lastB - 1;

        while(indexB >= 0){
            if(indexA >= 0 && arrayA[indexA] > arrayB[indexB]){
                arrayA[indexMerged] = arrayA[indexA];
                indexA--;
            }else{
                arrayA[indexMerged] = arrayB[indexB];
                indexB--;
            }
            indexMerged--;
        }
    }

    public static void main(String[] args){
        int lastA = 2;
        int lastB = 3;
        int[] array1 = new int[5];
        int[] array2 = new int[3];
        for(int i=0;i<lastA;i++){
            array1[i]=i;
        }

        for(int j=0;j<lastB;j++){
            array2[j]=j;
        }
        mergeArrays(array1,array2,lastA,lastB);
        for(int i=0;i<lastA+lastB;i++){
            System.out.println(array1[i]);
        }

    }
}
