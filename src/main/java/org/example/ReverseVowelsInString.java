package org.example;

public class ReverseVowelsInString {
    public static void main(String[] args){
        String str = "IcecreAm";
        System.out.println(vowelReverse(str));
    }
    private static String vowelReverse(String str){
        String vowels = "aeiouAEIOU";
        char[] chars = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;

        while(left<right){
            while(left<right && vowels.indexOf(chars[left]) == -1){
                left++;
            }
            while(left<right && vowels.indexOf(chars[right]) == -1){
                right--;
            }

            if(left<right){
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }
}
