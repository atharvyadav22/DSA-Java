package Sorting;

import java.util.Arrays;

//Problem No-2037 https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/description/?envType=problem-list-v2&envId=sorting
public class MinimumNoOfMovesToSeat {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);

        int sum =0;
        for(int i =0; i < seats.length; i++){
            sum += Math.abs(seats[i] - students[i]);
        }

        return sum;
    }
}
