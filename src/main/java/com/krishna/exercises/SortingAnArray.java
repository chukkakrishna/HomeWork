package com.krishna.exercises;
public class SortingAnArray {
    public static int[] sortingArray(int[] arrayList){
        int temp=0;
        for(int i=0;i<arrayList.length;i++){

            for(int j=i+1;j<arrayList.length;j++){
                if(arrayList[i]<arrayList[j]){
                    temp=arrayList[j];
                    arrayList[j]=arrayList[i];
                    arrayList[i]=temp;
                }
            }
        }
return arrayList;
    }
    public static void main(String[] args) {
    int[] sorted = sortingArray(new int[]{4,6,7,2,1,3});
        for(int i:sorted){
            System.out.print(i+"   ");
        }
    }
}
