package org.example;

public class Main {
    public static void main(String[] args) {
        Solution tt= new Solution();
        int[] nums ={8,1,2,2,3};

        int[] temp = tt.smallerNumbersThanCurrent(nums);

        for(int val: temp) System.out.print(val+" ");
    }
}