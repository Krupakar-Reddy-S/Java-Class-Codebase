import java.util.*;

public class AddMatrix {

    public static int[][] AddArray2d(int M1[][], int M2[][]){


        if(M1.length != M2.length){
            throw new RuntimeException("Mismatched matrix Dimensions!");
        }
  
        for(int i = 0; i < M1.length; i++){
            if(M1[i].length != M2[i].length){
                throw new RuntimeException("Mismatched matrix Dimensions!");
            }
        }

        int [][] SumMatrix = new int[M1.length][];

        for(int i = 0; i < M1.length; i++){
            for(int j = 0; j < M1[i].length; j++){
                SumMatrix[i][j] = M1[i][j] + M2[i][j];
            }
        }

        return SumMatrix;
    }

    public static void main(String[] args) {

        {   int Matrix1[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
            };

            int Matrix2[][] = {
                {10,20,30},
                {40,50,60},
                {70,80,90}
            };

            int AddedMatrix[][] = AddArray2d(Matrix1, Matrix2);
            System.out.println(Arrays.deepToString(AddedMatrix));
            System.out.println();
        }

        /*{   int Matrix3[][] = {
                {1,2,3},
                {3,4,5},
                {3,4,5},
                {6,7,8}
            };

            int Matrix4[][] = {
                {10,20,30},
                {40,50,60},
                {70,80,90}
            };

            int AddedMatrix[][] = AddArray2d(Matrix3, Matrix4);
            System.out.println(Arrays.deepToString(AddedMatrix));
            System.out.println();
        }*/

        /*{   int Matrix5[][] = {
                {1,2,3},
                {3,4,5,100},
                {6,7,8}
            };

            int Matrix6[][] = {
                {10,20,30},
                {40,50,60},
                {70,80,90}
            };

            int AddedMatrix[][] = AddArray2d(Matrix5, Matrix6);
            System.out.println(Arrays.deepToString(AddedMatrix));
            System.out.println();
        }*/

        /*{   int Matrix7[][] = {
                {1,2,3},
                {3,4,5,100},
                {6,7,8}
            };

            int Matrix8[][] = {
                {10,20,30},
                {10,50,60,100},
                {70,80,90}
            };

            int AddedMatrix[][] = AddArray2d(Matrix7, Matrix8);
            System.out.println(Arrays.deepToString(AddedMatrix));
            System.out.println();
        }*/ 

    }
}
