package org.example;

import java.util.Arrays;

public class MedianofTwoSortedArrays {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int friestArrayLength=nums1.length;
            int secondArrayLength=nums2.length;
            int mergedArray[]=new int[friestArrayLength+secondArrayLength];

            int index=0;
            for(int i:nums1) {
                mergedArray[index++]=i;
            }
            for(int i:nums2) {
                mergedArray[index++]=i;
            }

            for(int i:mergedArray) {
                System.out.println(i);
            }

            Arrays.sort(mergedArray);
            int n= mergedArray.length;
            if(n%2!=0) {
                return  mergedArray[n/2];

            }
            else
                return (( mergedArray[n / 2 - 1] +  mergedArray[n / 2]) / 2.0);
        }


}
