package org.example;

import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args){
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums = {1, 3, 5, 7, 7};
        System.out.println(containsDuplicate.solution(nums));
    }

    public boolean solution(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }

}
