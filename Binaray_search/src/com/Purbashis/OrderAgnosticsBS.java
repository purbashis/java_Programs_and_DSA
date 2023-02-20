package com.Purbashis;

public class OrderAgnosticsBS {


    /*

    Order-agnostic binary search is a modified version of binary search
     that can search for a target value in a sorted array,
     regardless of whether the array is in ascending or descending order.
      In other words, it works for both sorted arrays and reverse sorted arrays.
      The key difference between order-agnostic binary search and regular binary search
      is that it doesn't assume that the array is sorted in a specific order,
      but instead determines the order dynamically based on the array values.
     */








    public static void main(String[] args) {

        int [] arr ={ -2,-1,2,6,8,9,12,45,84};
        int target= 45;
        int [] arr2 ={ 99,88,77,56,56,32,11,8,2,-9,-99,-105};
        int target2= 56;


        int ans = orderAgnosticBS(arr2,target2);
        System.out.println("target index : " +ans);
    }
    static  int orderAgnosticBS(int[] arr , int target ){
        int start =0 ;
        int end = arr.length-1;
        //find wheter the array is sorted in ascending or descending
        boolean isAsc ;
        isAsc = arr[start] < arr[end];

        while (start<=end){
            //find the middle element
            //int mid = (start+ end ) / 2;
            //it might be possible that (start+end)exceeds the range of integer in java .
            int mid= start+(end-start)/2;  //better way to find mid
            if(arr[mid]==target){
                return mid;
            }

            if (isAsc){
                if (target < arr[mid ]) {
                    end = mid - 1;
                }else if (target>arr[mid]) {
                    start = mid + 1;
                }

            }else {
                if (target > arr[mid ]) {
                    end = mid - 1;
                }else   {
                    start = mid + 1;
                }

            }



        }
        return -1 ;

    }
}
