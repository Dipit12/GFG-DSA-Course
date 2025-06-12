package Matrix;

public class rotate90Degree {

    static void transposeMatrix(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr[i].length; j++){
                // swap arr[i][j] with arr[j][i]
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        // first transpose the matrix
        transposeMatrix(arr);
        // now print it in this particular order
        for(int i = 0; i < arr.length;i++){
            for(int j =0; j < arr[i].length;j++){
                System.out.print(arr[arr.length-1-i][j] + " ");
            }
            System.out.println();
        }
    }
}
