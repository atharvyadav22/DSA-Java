package Dp;

//Problem No-509 https://leetcode.com/problems/fibonacci-number/description/
public class FibonacciSeries {
    public int fib(int n) {

        if(n <= 1) return n;

        int prev1 = 1; //n-1
        int prev2 = 0; //n-2
        int curr = 0;

        for(int i =2; i <=n; i++){
            curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;

        }

        return curr;

    }
}
