package Arrays;

import java.util.ArrayList;
import java.util.List;

//Problem No-119 https://leetcode.com/problems/pascals-triangle-ii/?envType=problem-list-v2&envId=dynamic-programming
public class PascalsTriangle2 {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> row = new ArrayList();
        long coeff = 1;

        row.add(1);

        for(int i=1; i<=rowIndex; i++){
            coeff = coeff *(rowIndex - i +1)/i;
            row.add( (int) coeff);
        }

        return row;
    }
}
