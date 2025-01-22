package Strings;

//Problem No-1967 https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/
public class SubstringWords {

    public int numOfStrings(String[] patterns, String word) {

        int count = 0;

        for (String p : patterns) {
            if (word.contains(p)) {
                count++;
            }
        }

        return count;
    }
}
