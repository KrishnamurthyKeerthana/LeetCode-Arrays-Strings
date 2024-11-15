package org.example;

import java.util.Arrays;

public class RunningSumOfArray {

    public static void main(String[] args) {
        RunningSumOfArray runningSumOfArray = new RunningSumOfArray();

        int[] nums = {1, 2, 3 ,4};
        System.out.println(Arrays.toString(runningSumOfArray.runningSum(nums)));
    }

    private int[] runningSum(int[] nums){
        if(nums == null || nums.length == 0){
            return new int[0];
        }
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            result[i] = result[i-1] + nums[i];
        }
        return result;
    }
}
