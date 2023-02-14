package com.purbashis;
public class Main {
    public static void main(String[] args) {

        // Q : store a roll number
        int a  = 90;
        // Q : store a person's name
        String name ="Purbashis Behera ";

        // Q: store 5 roll numbers
        int rol1= 23;
        int rol2= 24;
        int rol3= 25;
        int rol4= 26;
        int rol5= 27;

        // we can not store 500 roll numbers like this,
        // so we need array : An array is a collection of similar data type .

        //syntax
        //datatype [] variable_name = new datatype[size];
        //store 5 roll numbers .
        int [] rnos= new int[5];
        // here new : used to create an object

        //or

        int[] rons2={23,25,98,78,454,456};


        int []ros;// declaration of the array . -- ros is getting defined in the stack
              ros = new int[5];//initialisation : -- actually here object is being created in the memory (heap)

             // heap memory not continuous

        String [] arr =new String[4];
        System.out.println(ros[1]);
        System.out.println(arr[0]);


        





    }
}