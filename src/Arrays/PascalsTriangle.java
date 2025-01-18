package Arrays;

import java.util.ArrayList;
import java.util.List;

//Problem No-118 https://leetcode.com/problems/pascals-triangle/?envType=problem-list-v2&envId=array
public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            result.add(nCr(i));
        }

        return result;
    }

    public static List<Integer> nCr(int r) {
        List<Integer> row = new ArrayList<>();
        long coefficient = 1;

        row.add(1);

        for (int k = 1; k <= r; k++) {
            coefficient = coefficient * (r - k + 1) / k;
            row.add((int) coefficient);
        }

        return row;
    }
}
