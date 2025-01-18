package Arrays;

//Problem No-66 https://leetcode.com/problems/plus-one/description/?envType=problem-list-v2&envId=array
public class PlusOne {
    public int[] plusOne(int[] digits) {

        for(int i = digits.length-1; i >=0; i--){
            digits[i] += 1;

            if(digits[i] == 10){
                digits[i] = 0;

            }
            else {
                return digits;
            }
        }

        int[] result = new int[digits.length+1];
        result[0] = 1;
        return result;
    }
}
