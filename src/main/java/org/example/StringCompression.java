package org.example;

public class StringCompression {
    public static void main(String[] args){
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));
    }
    private static int compress(char[] chars){
        int i = 0;
        int index = 0;

        while(i<chars.length){
            int count = 0;
            char currentChar = chars[i];
            while(i<chars.length && chars[i] == currentChar){
                i++;
                count++;
            }
            chars[index] = currentChar;
            index++;

            if(count > 1){
                for(char c: Integer.toString(count).toCharArray()){
                    chars[index] = c;
                    index++;
                }
            }
        }
        return index;
    }
}
