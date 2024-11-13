package org.example;

public class IncreasingTripletSequence {
    public static void main(String[] args){
        int[] nums = {5,4,3,2,1};
        System.out.println((findTriplet(nums)));
    }

    private static boolean findTriplet(int[] nums){
        int firstNum = Integer.MAX_VALUE;
        int secondNum = Integer.MAX_VALUE;

        for(int num:nums){
            if(num < firstNum){
                firstNum = num;
            }
            else if(num < secondNum){
                secondNum = num;
            }
            else
                return true;
        }
        return false;
    }
}
