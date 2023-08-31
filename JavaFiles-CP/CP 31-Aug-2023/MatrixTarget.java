import java.util.Arrays;
import java.util.Scanner;

class Coordinate {
    int row = 0;
    int column = 0;

    int[] value = {row,column};

    public Coordinate(int row_, int column_){
        row = row_;
        column = column_;
    }

    public void printCoordinate(){
        System.out.println(Arrays.toString(value));
    }
}

public class MatrixTarget {

    public static Coordinate getCoordinates(int [][] A, int target){
        Coordinate Cord1 = new Coordinate(-1,-1);

        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
                if(A[i][j] == target){

                    Cord1.row = i;
                    Cord1.column = j;
                    return Cord1;
                }
            }
        }

        return Cord1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] Array2 = {{1,2},{1,1}};
        Coordinate cord = getCoordinates(Array2, 3);
        cord.printCoordinate();

        sc.close();

    }
}
