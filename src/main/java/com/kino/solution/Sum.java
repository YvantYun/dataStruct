package com.kino.solution;

/**
 * @Author: kino
 * @Date: 2019/2/4 15:57
 */
public class Sum {
    public static int sum(int[] arr){
        return sum(arr , 0);
    }

    /**
     * 计算arr数组中arr[l] +...+ a[n-1]中所有数字的和
     * @param arr
     * @param l
     * @return
     */
    private static int sum(int[] arr, int l){
        if(l == arr.length){
            return 0;
        }
        //这就是递归调用的
        return arr[l] + sum(arr, l+1);
    }
}
