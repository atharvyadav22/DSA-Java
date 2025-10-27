package Dp;

//Problem No- 70 https://leetcode.com/problems/climbing-stairs/description/
public class ClimbingStairs {
    public int climbStairs(int n) {

        if(n == 1 ) return 1;
        else if(n==2) return 2;

        int prev1 = 2; //n-1
        int prev2 = 1; //n-2
        int curr = 0;

        for(int i = 3; i <= n; i++){
            curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return curr;
    }
}
