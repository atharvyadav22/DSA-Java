package Arrays;

//Problem No-443 https://leetcode.com/problems/string-compression/description/
public class StringCompressingCharArray {
        public static int compress(char[] chars) {

            int arrIdx = 0;

            for(int i = 0; i < chars.length; i++){
                Integer count = 1;
                while(i < chars.length - 1 && chars[i] == chars[i+1]){
                    count++;
                    i++;
                }

                chars[arrIdx++] = chars[i];

                if(count > 1){
                    for(char c: String.valueOf(count).toCharArray()){
                        chars[arrIdx++] = c;
                    }
                }

            }
            return arrIdx;
        }
    }
}
