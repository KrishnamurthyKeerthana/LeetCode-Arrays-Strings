package org.example;

public class CanPlaceFlowers {
    public static void main(String[] args){
        int[] flowerbed = {1,0,0,0,1};
        int n = 2;
        System.out.println(placeFlower(flowerbed, n));
    }
    private static boolean placeFlower(int[] flowerbed, int n){
        for(int i=0; i<flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean leftEmpty = (i == 0 || flowerbed[i - 1] == 0);
                boolean rightEmpty = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0);
                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1;
                    n--;
                    if (n == 0)
                        return true;
                }
            }
        }
        return n<=0;
    }
}
