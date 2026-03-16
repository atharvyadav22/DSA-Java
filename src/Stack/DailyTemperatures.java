package Stack;

import java.util.Stack;

//Problem No-739 https://leetcode.com/problems/daily-temperatures/description/
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] answer = new int[len];

        Stack<Integer> stack = new Stack<>();

        for(int i =0; i < len; i++){

            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){

                int prev = stack.pop();
                answer[prev] = i - prev;
            }

            stack.push(i);

        }

        return answer;
    }
}
