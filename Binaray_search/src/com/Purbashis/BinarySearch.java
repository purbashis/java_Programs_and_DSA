package com.Purbashis;
public class BinarySearch {

    //time complexity : best-case : O(1)
    //                  worst case : O(logN)


    /*

Binary search is an efficient algorithm used to search for a target value in a sorted array
                 or a sorted list.
 It works by repeatedly dividing the search interval in half until the target value is found
 or determined to not be in the array.
     */

    public static void main(String[] args) {
        int [] arr ={ -2,-1,2,6,8,9,12,45,84};
        int target= 45;

        int ans = binarySearch(arr,target);
        System.out.println("target index : " +ans);
    }
    //return the index
    //return -1 if it doesn't exist
    static int binarySearch(int [] arr, int target){
        int start =0 ;
        int end = arr.length-1;
        while (start<=end){
            //find the middle element
            //int mid = (start+ end ) / 2;
            //it might be possible that (start+end)exceeds the range of integer in java .
            int mid= start+(end-start)/2;  //better way to find mid
            if (target < arr[mid ]) {
                end = mid - 1;
            }else if (target>arr[mid]) {
                start = mid + 1;
            }
            else {
                //answer  found
                return mid;
            }
        }
       return -1 ;

    }
}