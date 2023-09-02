import java.util.Arrays;
import java.util.Scanner;

class Coordinate {
    int row;
    int column;

    int[] value = {row,column};

    public Coordinate(){
        row = 0;
        column = 0;
    }

    public Coordinate(int row, int column){
        this.row = row;
        this.column = column;
    }

    public String toString(){
        return Arrays.toString(this.value);
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
        System.out.println(cord);

        sc.close();

    }
}
