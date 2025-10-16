package Greedy;

import java.util.Arrays;

//Problem No-455 https://leetcode.com/problems/assign-cookies/description/?envType=problem-list-v2&envId=greedy
public class AssignCookie {
        public int findContentChildren(int[] g, int[] s) {

            Arrays.sort(g);
            Arrays.sort(s);
            int i = 0; //Child
            int j = 0; //Cookie

            while (i < g.length && j < s.length) {
                if (s[j] >= g[i]) {
                    i++;
                }
                j++;
            }

            return i;
        }
    }
