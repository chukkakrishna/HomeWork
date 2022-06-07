package com.krishna.exercises;

public class ToCheckAnElementInAnArray {


    public boolean searchingMethod(int element) {
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6,7,8,9};

        // for(i=0;j<8;i++)
        for (int i = 0, j = array1.length; i < j; i++) {
            /** 6>=  */
            if (element>=array1[j/2]) {
             i=j/2;
            }
            else{
                j=j/2;
            }
        }
return true;
    }


    public static void main(String[] args) {


    }

}
