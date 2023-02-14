package com.purbashis;
//https://leetcode.com/problems/richest-customer-wealth/
public class Richest_cus_wealth {
    public static void main(String[] args) {
        int [][]arr= {{1,2,3},{12,85,98},{14,56,78}};
        int richest_customer_wealth=maximumWealth(arr);
        System.out.println("the richest customer wealth is  : "+ richest_customer_wealth );

    }
    static  int maximumWealth(int[][] accounts)
    {
        //person= row
        //account = col
        int ans = Integer.MIN_VALUE;

        for (int person = 0; person <accounts.length ; person++) {
            // when you start a new col , take a new sum for that row
            int sum=0;
            for (int account = 0; account < accounts[person].length; account++){
                {
                    sum=sum+accounts[person][account];

                }
                //now we have check sum of accounts of person
                //check with overall ans

                if (sum>ans ){
                    ans = sum;
                }

            }

        }
        return ans;

    }


}
