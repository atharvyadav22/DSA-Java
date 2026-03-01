package Arrays;

import java.util.HashMap;
import java.util.PriorityQueue;

//Problem No-347  https://leetcode.com/problems/top-k-frequent-elements/description/
public class TopKElements {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Integer> p = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        for (int i : map.keySet()) {
            p.add(i);

            if (p.size() > k) {
                p.poll();
            }
        }

        int[] arr = new int[k];

        for (int i = 0; i < k; i++) {
            arr[i] = p.poll();
        }

        return arr;


    }

}
