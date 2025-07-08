package Arrays_2D;

//Problem No-240 https://leetcode.com/problems/search-a-2d-matrix-ii/description/
public class SearchArray2D {

    public static boolean searchMatrix(int[][] matrix, int target) {

        int row = 0, col = matrix[0].length - 1;

        while (row <= matrix.length - 1 && col >= 0) {

            int pos = matrix[row][col];

            if (target == pos) return true;
            else if (pos > target) col--;
            else row++;
        }

        return false;

    }
}
