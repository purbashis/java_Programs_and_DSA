package com.purbashis;

public class Scope {
    public static void main(String[] args) {

        // Scope means where we can access our variables

        int a =10; //initializing

        int b =20;
        String name= "rahul";
        // we can't access the 'num' coz it's not declared here

        {
            // already initialised outside the block in the same method , hence you cannot initialise again.


        //    int a= 75;
            // you can not modify the same value which is already initialised
            // instead of initialisation you can write  only   :
            a=75 ;   // updating
            name ="Lohit";
            // reassign the origin ref variable to some other value
            //u can change the value





            // it's a block scope  so the value which is inside of this block which is initialed
            // it is performed inside the block-only not in outside the block.




            //in simpler term the values  which is initialised in this block wil remain in this block



        }
        System.out.println(a);
        System.out.println(name);


    }

    //scoping in loops same as above
    {
        for(int i =0; i<=5;i=i+1){
        System.out.println(i);
        }
    }



    static void random(){
        int num = 67 ;
        System.out.println(num);

        // here   ' num ' can accessible but not a and b which is declared in main function
    }
}
