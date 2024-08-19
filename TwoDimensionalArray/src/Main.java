import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[][] basicTwoDimensional = new int[10][2];
        int[][] givenArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        System.out.println(Arrays.deepToString(givenArray));

        //jagged array or ragged array
        int[][] jaggedArray = {{1, 2, 3}, {4, 5}, {6}};
        System.out.println(Arrays.deepToString(jaggedArray));
    }
}