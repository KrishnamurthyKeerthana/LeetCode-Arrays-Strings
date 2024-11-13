package org.example;

public class ReverseWordsInString {
    public static void main(String[] args){
        String str = "the sky is blue";
        System.out.println(reverseString(str));
    }

    private static String reverseString(String str){
        str = str.trim();
        String[] words = str.split("\\s+");
        StringBuilder reverse = new StringBuilder();

        for(int i=words.length-1; i>=0; i--){
            reverse.append(words[i]);
            if(i>0){
                reverse.append(" ");
            }
        }
        return reverse.toString();
    }
}
