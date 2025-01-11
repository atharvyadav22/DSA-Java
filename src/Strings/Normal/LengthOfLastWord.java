package Strings.Normal;

//Problem No-58 https://leetcode.com/problems/length-of-last-word/description/?envType=problem-list-v2&envId=string
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {

        int lIdx = s.length() -1;
        int count = 0;

        for(int i = lIdx; i >= 0; i--){

            if(s.charAt(i) != ' '){
                count++;
            }
            else if(count> 0){
                return count;
            }


        }

        return count;
    }
}
