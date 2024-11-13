package org.example;

public class HighestAltitude {
    public static void main(String[] args){
        int[] gain = {-5, 1, 5, 0, -7};
        System.out.println(maxAltitude(gain));
    }

    private static int maxAltitude(int[] gain){
        int[] result = new int[gain.length];
        result[0] = gain[0];
        for(int i=1; i<gain.length; i++){
            result[i] = result[i-1] + gain[i];
        }
        int maxAl = 0;
        for(int al:result){
            if(al > maxAl){
                maxAl = al;
            }
        }
        return maxAl;
    }
}
