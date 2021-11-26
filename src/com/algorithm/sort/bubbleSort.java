package com.algorithm.sort;

/**
 * @Author biyang
 * @Date 2021/11/26 2:17 下午
 * @Version 1.0
 */

import java.util.Arrays;

/**
 * 冒泡排序:
 * 1.相邻元素排序
 * 2.满足规则置换
 */
public class bubbleSort {
    public static void main(String[] args) {
        int[] originArray = new int[]{54,2,8,10,78,100,30,30,23,0,23,1};
        //底层循环决定对整个数组的排序行数
        for (int i = 0; i < originArray.length-1; i++) {
            for (int j = 0; j < originArray.length-1-i; j++) {
                //-i是为了优化不必要的比较次数
                if (originArray[j]>originArray[j+1]){
                    int temp = originArray[j];
                    originArray[j] = originArray[j+1];
                    originArray[j+1] = temp;
                }
            }

        }

        System.out.println(Arrays.toString(originArray));
    }
}
