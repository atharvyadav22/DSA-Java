package Arrays_2D;

import java.util.ArrayList;
import java.util.List;

//Problem No-54 https://leetcode.com/problems/spiral-matrix/description/
public class SpiralMatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {

        return printSpiral(matrix);
    }

    private static List<Integer> printSpiral(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        int startRow = 0, endRow = matrix.length - 1;
        int startCol = 0, endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

            // L - R
            for (int j = startCol; j <= endCol; j++) {
                list.add(matrix[startRow][j]);
            }
            startRow++;

            // T - B
            for (int i = startRow; i <= endRow; i++) {
                list.add(matrix[i][endCol]);
            }
            endCol--;

            // R - L
            if (startRow <= endRow) {
                for (int j = endCol; j >= startCol; j--) {
                    list.add(matrix[endRow][j]);
                }
                endRow--;
            }

            // B - T
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    list.add(matrix[i][startCol]);
                }
                startCol++;
            }
        }

        return list;
    }
}

