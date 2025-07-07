package Arrays_2D;

//Problem No-1572 https://leetcode.com/problems/matrix-diagonal-sum/description/
public class MatrixDiagonalSum {

    public int diagonalSum(int[][] mat) {

        return calculateSum(mat);
    }

    private int calculateSum(int[][] mat) {

        int sum = 0, length = mat.length;

        for (int i = 0; i < mat.length; i++) {

            int sd = mat.length - 1 - i;

            sum += mat[i][i];

            if (i != sd) {
                sum += mat[i][sd];
            }
        }

        return sum;
    }
}

