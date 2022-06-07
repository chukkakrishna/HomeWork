package com.krishna.exercises;

public class ReverseWordsAndPrint {

    public static String[] reverseMethod(String s){
        String[] a= s.split("\\s+");
        return a;
    }


    public static void main(String[] args) {

        String[] reverse = reverseMethod("abc def ghi jkl mno");
        int l=reverse.length;
for(int i=0;i<l;i++){
    System.out.print(reverse[l-1-i]+" ");
}

    }
}
