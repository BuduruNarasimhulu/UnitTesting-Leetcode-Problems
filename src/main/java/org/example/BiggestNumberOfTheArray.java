package org.example;

import java.util.Arrays;

public class BiggestNumberOfTheArray {
    public static int findBiggestNumber(int [] integerArray){
        int  maximumNumber=0;
        maximumNumber= Arrays.stream(integerArray).max().getAsInt();
        return maximumNumber;
    }
    public static int  findMinimumNumber(int [] integerArray){
        int minimumNumber=0;
        minimumNumber=Arrays.stream(integerArray).min().getAsInt();
        return minimumNumber;
    }
    public static void main(String[] args) {
        int[] integerArray ={1,2,4,55,9};
        int resultForMaximum=findBiggestNumber(integerArray);
        int resultForMinimum=findMinimumNumber(integerArray);
        System.out.println(resultForMaximum);
        System.out.println(resultForMinimum);


    }
}
