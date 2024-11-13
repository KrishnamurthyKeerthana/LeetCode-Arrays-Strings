package org.example;

import java.util.Arrays;

public class LeftRightSumDifference {
    public static void main(String[] args){
        int[] nums = {1218, 9, 49, 1, 76};
        System.out.println(Arrays.toString(sumDifference(nums)));
    }

    private static int[] sumDifference(int[] nums){

        if(nums == null || nums.length <= 1){
            return new int[]{0};
        }

        int leftSum = 0;
        int rightSum = 0;

        for(int num:nums){
            rightSum += num;
        }

        int[] answer = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            leftSum += nums[i];
            answer[i] = Math.abs(leftSum-rightSum);
            rightSum -= nums[i];
        }
        return answer;
    }
}
