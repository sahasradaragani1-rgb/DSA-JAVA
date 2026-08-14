import java.util.Scanner;

public class Solution {

```
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

    int positiveCount = 0;
    int negativeCount = 0;
    int zeroCount = 0;

    // Traverse the matrix
    for (int i = 0; i < matrix.length; i++) {

        for (int j = 0; j < matrix[i].length; j++) {

            if (matrix[i][j] > 0) {
                positiveCount++;
            }
            else if (matrix[i][j] < 0) {
                negativeCount++;
            }
            else {
                zeroCount++;
            }
        }
    }

    // Display results
    System.out.println("Positive elements: " + positiveCount);
    System.out.println("Negative elements: " + negativeCount);
    System.out.println("Zero elements: " + zeroCount);

    sc.close();
}
```

}
