package com.Leetcode;

import java.util.*;

public class LeetCode0416 {

}

class Solution1 {
    public static int findRepeatNumber(int[] nums) {
        HashSet<Integer> integers = new HashSet<Integer>();
        for (int num : nums) {
            if (integers.contains(num))
                return num;
            else integers.add(num);
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] test = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber(test));
    }
}


class Solution2 {
    static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int height = matrix.length;
        int length = matrix[0].length;
        for (int i = height - 1; i >= 0; i--) {
            if (target > matrix[i][length-1]);
            else if (target == matrix[i][length-1])
                return true;
            else
                for (int j = length - 1; j >= 0 ; j--) {
                    if (target == matrix[i][j])
                        return true;
                }
        }
        return false;
    }


    static boolean findNumberIn2DArray2(int[][] matrix, int target) {
        int i = matrix.length - 1, j = 0;
        while(i >= 0 && j < matrix[0].length)
        {
            if(matrix[i][j] > target) i--;
            else if(matrix[i][j] < target) j++;
            else return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
//        System.out.println(findNumberIn2DArray2(matrix,5));
        int[][] test = {};
        boolean f = findNumberIn2DArray2(test,1);
        System.out.println(f);
    }
}

class Solution {
    public String replaceSpace(String s) {
        StringBuilder res = new StringBuilder();
        for (Character c :
                s.toCharArray()) {
            if (c == ' ')
                res.append("%20");
            else
                res.append(c);
        }
        return res.toString();
    }
}

