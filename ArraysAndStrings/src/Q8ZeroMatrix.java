// Sets entirety of row and column of any 0 element in MxM matrix to 0

import java.util.ArrayList;

public class Q8ZeroMatrix {
    private static void zeroMatrix(int[][] matrix, int M){

        ArrayList<Integer> rows = new ArrayList<>();
        ArrayList<Integer> columns = new ArrayList<>();

        for(int i=0;i<M;i++){
            for(int j=0;j<M;j++){
                if(matrix[i][j]==0){
                    if(!rows.contains(i)){rows.add(i);}
                    if(!columns.contains(j)){columns.add(j);}
                }
            }
        }

        for(int i=0;i<M;i++){
            for(int j=0;j<M;j++){
                if(columns.contains(j)){
                    matrix[i][j] = 0;
                }
                else if(rows.contains(i)){
                    matrix[i][j] = 0;
                }
            }

        }
    }

    public static void main(String []args){
        int N = 4;
        int myMatrix[][] = new int[N][N];
        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                myMatrix[i][j] = i*4 + j;
            }
        }
        myMatrix[N-1][N-1] = 0;



        System.out.println("Starting matrix:");
        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                System.out.print(myMatrix[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("\nResult:");

        zeroMatrix(myMatrix,N);
        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                System.out.print(myMatrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
