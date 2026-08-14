import java.util.Scanner;

public class Solution {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Read number of rows
    int rows = sc.nextInt();

    // Create jagged 2D array
    int[][] matrix = new int[rows][];

    // Read each row
    for (int i = 0; i < rows; i++) {

        // Read number of elements in current row
        int cols = sc.nextInt();

        matrix[i] = new int[cols];

        // Read elements
        for (int j = 0; j < cols; j++) {
            matrix[i][j] = sc.nextInt();
        }
    }

    // Read target element
    int target = sc.nextInt();

    boolean found = false;

    // Search for the target
    for (int i = 0; i < matrix.length; i++) {

        for (int j = 0; j < matrix[i].length; j++) {

            if (matrix[i][j] == target) {

                System.out.println(
                    "Element found at row " + i + ", column " + j
                );

                found = true;
                break;
            }
        }

        // Stop after finding the first occurrence
        if (found) {
            break;
        }
    }

    // Target not found
    if (!found) {
        System.out.println("Element not found");
    }

    sc.close();
}


}
