package org.example;

public class MergeStringsAlternately {
    public static void main(String[] args){
        MergeStringsAlternately mergeStringsAlternately = new MergeStringsAlternately();
        String word2 = "abc";
        String word1 = "pqrstu";
        System.out.println((mergeStringsAlternately.solution(word1, word2)));
    }
    public String solution(String word1, String word2){
        int m = word1.length();
        int n = word2.length();

        StringBuilder result = new StringBuilder();
        int i=0, j=0;

        while(i<m || j<n){
            if(i<m) {
                result.append(word1.charAt(i));
                i++;
            }
            if(j<n){
                result.append(word2.charAt(j));
                j++;
            }
        }
        return result.toString();

    }
}
