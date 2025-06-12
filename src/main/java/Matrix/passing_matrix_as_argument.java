package Matrix;

public class passing_matrix_as_argument {
    static void printArr(int[][] arr){
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},{45,6}
        };
        printArr(arr);
    }
}
