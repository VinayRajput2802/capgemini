import java.util.Arrays;
import java.util.Scanner;
public class Array_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entet Number of Rows: ");
        int m = sc.nextInt();
        System.out.print("Enter Number of Columns: ");
        int n = sc.nextInt();
        int[][] grid = new int[m][n];

        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print("Value at index "+i+" "+j+" - ");
                int val = sc.nextInt();
                grid[i][j] = val;
            }
        }
        for (int i=0;i<m;i++){
            System.out.println(Arrays.toString(grid[i]));
        }

    }
}
