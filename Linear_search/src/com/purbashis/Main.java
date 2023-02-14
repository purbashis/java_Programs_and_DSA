package com.purbashis;
public class Main {
    public static void main(String[] args) {

        int [] num ={23,5,8,1,2,89,45,65};
        int target=5;

        int ans = linearSearch(num,target);
        if (ans==-1){
            System.out.println("invalid entry ");
        }
        else {
            System.out.println(" this is found in index no " + ans);
        }


        int ans2 = linearSearch2(num,target);


        if (ans2==-1){
            System.out.println("value not found ");
        }
        else {
            System.out.println(" this is the value : " + ans2);
        }

    }
    //search in the array : return the index if item found
    //otherwise if item not found  return -1
    static int linearSearch(int[] arr , int target){
        if(arr.length==0)
        {
            return -1;
        }

        // run a for loop
        for (int index = 0; index  <arr.length ; index++) {
            //check for element at every index if it is = target
            int element  =arr[index ];
            if (element == target){
                return index;

            }

        }
// this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;

    }
    //search in the array : return the element
    static  int linearSearch2(int[] arr , int target ){
        if (arr.length==0)
        {
            return -1;
        }
        for (int index = 0; index<arr.length;index++){
            int element = arr[index];
            if (element== target){
                return element;
            }
        }
        return -1;
    }

}