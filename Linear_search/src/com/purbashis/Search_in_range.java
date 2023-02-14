package com.purbashis;

public class Search_in_range {
    public static void main(String[] args) {
    int[]arr={18,12,-7,3,14,28};
      int target =-7;

        int ans = linear_search(arr,target,1,5);
        System.out.println(ans);

        
    }
    static  int linear_search (int [] arr, int  target,int start ,int end ){
        if (arr.length==0){
            return -1;
        }
        for (int index = start; index < end; index++) {

            int element =arr[index];
            if(element== target ){
                return index;
            }

        }
        return -1;

    }
}
