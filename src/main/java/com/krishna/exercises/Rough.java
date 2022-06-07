package com.krishna.exercises;

public class Rough {

    public static void main(String[] args) {

        int[] a= new int[]{2,4,6,8,24};
        int factor=a[a.length-1],count=0;
        for(int i=0;i<a.length;i++){
            if(factor%a[i]==0){
                count=count+1;
            }
            if(count==a.length-1){
                System.out.println("value is:   "+factor);
            }
        }

    }
}
