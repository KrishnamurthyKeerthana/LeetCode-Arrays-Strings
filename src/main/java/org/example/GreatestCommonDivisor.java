package org.example;

public class GreatestCommonDivisor {

    public static void main(String[] args){
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println(gcd1(str1, str2));
    }

    private static String gcd1(String str1, String str2){
        if((str1 + str2).equals(str2 + str1)){
            int gcd = gcd(str1.length(), str2.length());
            return str1.substring(0, gcd);
        }
        else
            return "";
    }

    private static int gcd(int a, int b){
        return b == 0 ? a:gcd(b, a % b);
    }

//    private static String gcd(String str1, String str2){
//        int minLength = Math.min(str1.length(), str2.length());
//        for(int i=minLength; i>0; i--){
//            if(str1.length() % i == 0 && str2.length() % i == 0){
//                String candidate = str1.substring(0, i);
//                if(divides(str1, candidate) && divides(str2, candidate)){
//                    return candidate;
//                }
//            }
//        }
//        return "";
//    }
//
//    public static boolean divides(String original, String str){
//        int repetitions = original.length()/str.length();
//        StringBuilder result = new StringBuilder();
//        for(int i=0; i<repetitions; i++){
//            result.append(str);
//        }
//        return result.toString().equals(original);
//    }
}
