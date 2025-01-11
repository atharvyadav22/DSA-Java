package Strings.Hashing;

import java.util.HashMap;
import java.util.HashSet;

//Problem No- 1941 https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/description/
public class EqualOccurrence {
    public boolean areOccurrencesEqual(String s) {

        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        HashSet<Integer> uniqueFrequencies = new HashSet<>(freqMap.values());

        return uniqueFrequencies.size() == 1;
    }
}
