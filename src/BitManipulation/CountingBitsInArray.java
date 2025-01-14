package BitManipulation;

public class CountingBitsInArray {

    public int[] countBits(int n) {
        int [] ans = new int[n+1];

        for(int i = 0; i < n+1 ; i++){
            ans[i] = count(i);
        }

        return ans;
    }

    private int count(int val){

        int count = 0;

        while(val > 0){
            val = val & (val-1);
            count++;
        }

        return count;
    }
}
