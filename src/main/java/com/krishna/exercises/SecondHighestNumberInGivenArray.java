package com.krishna.exercises;
public class SecondHighestNumberInGivenArray {
    public static int secondHighest(int[] a){
        int m=Integer.MIN_VALUE,n=Integer.MIN_VALUE,temp=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>m)
            {
                n=m;
                m=a[i];
                System.out.println("Enter");
            }
            else if(a[i]>n && a[i]!= m)
            {
                n=a[i];
            }
        }
        return n;
    }
    public static void main(String[] args) {
        System.out.println("value is: "+secondHighest(new int[]{4,1,2,3,15,90,152}));
    }
}
