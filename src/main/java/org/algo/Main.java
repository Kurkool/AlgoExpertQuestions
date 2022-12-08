package org.algo;

import java.util.Arrays;

public class Main {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.

        int[] result = new int[2];

        for(int i=0; i<array.length; i++){
            int pickNum = array[i];
            for(int j=0; j<array.length; j++){
                if(i!=j){
                    int sumOfTwo = pickNum + array[j];
                    if(sumOfTwo == targetSum){
                        result[0] = pickNum;
                        result[1] = array[j];
                        return result;
                    }
                }
            }
        }
        return new int[0];
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoNumberSum(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10)));
    }
}