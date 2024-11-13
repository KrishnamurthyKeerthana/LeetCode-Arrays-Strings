package org.example;

import java.util.ArrayList;
import java.util.List;

public class KidsWithExtraCandies {
    public static void main(String[] args){
        KidsWithExtraCandies extracandies = new KidsWithExtraCandies();
        int[] candies = {7, 3, 9, 2, 4};
        int extraCandies = 5;
        System.out.println((extracandies.kidsExtraCandies(candies, extraCandies)));

    }
    public List<Boolean> kidsExtraCandies(int[] candies, int extraCandies){
        int maxCandy = 0;
        List<Boolean> result = new ArrayList<>();
        for(int candy:candies){
            if(candy>maxCandy)
                maxCandy = candy;
        }
        for(int candy:candies){
            result.add(candy + extraCandies >= maxCandy);
        }
        return result;
    }
}
