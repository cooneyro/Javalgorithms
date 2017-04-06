// Rotates image denoted by NxN matrix by 90 degrees
// Each pixel is 4 bytes

public class Q7RotateMatrix {
    private static void rotateMatrix(int N, int[][] matrix){

        for(int layer=0;layer<N/2;layer++){
            int first = layer;
            int last = N-1 - layer;
            for(int i = first;i < last; i++){
                int offset = i - first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last-offset][first];
                matrix[last-offset][first] = matrix[last][last-offset];
                matrix[last][last-offset] = matrix[i][last];
                matrix[i][last] = top;
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

        System.out.println("Starting matrix:");
        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                System.out.print(myMatrix[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("\nResult:");

        rotateMatrix(N,myMatrix);
        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                System.out.print(myMatrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
