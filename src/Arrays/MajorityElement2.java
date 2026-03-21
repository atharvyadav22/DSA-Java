package Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

//Problem No- 229 https://leetcode.com/problems/majority-element-ii/description/
public class MajorityElement2 {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        List<Integer> list = new ArrayList<>();

        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for (int num : map.keySet()) {
            if (map.get(num) > n / 3) {
                list.add(num);
            }
        }
        return list;
    }
}
