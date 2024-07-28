public class P19 {
    public static void main(String[] args) {
        int[][] matrixa ={{1,3},{2,4}};
        int[][] matrixb={{1,2},{2,3}};
        int[][] result =new int[2][2];
        
        for (int i = 0;i<matrixa.length;i++){
            for (int j = 0;j<matrixa[i].length;j++){
                //print method 1
               int a = result[i][j]= matrixa[i][j]* matrixb[i][j];
               System.out.print(a+" ");
            }
            System.out.println();
        }

        //print method 2
        // for (int[] row : result) {
        //     for (int elem : row) {
        //         System.out.print(elem + " ");
        //     }
        //     System.out.println();
        // }
    }
}

