package com.algorithm.sort;

/**
 * @Author biyang
 * @Date 2021/11/25 3:56 下午
 * @Version 1.0
 */

import java.util.Arrays;

/**
 * 基数排序
 */
public class BasicSort {
    public static void main(String[] args) {
        int[] originArray = new int[]{52, 78, 1103, 75, 1, 30, 25};
        //获取其中最大数
        int max = 0;
        for (int i = 0; i < originArray.length; i++) {
            if (originArray[i] > max) {
                max = originArray[i];
            }
        }
        //获取最大数位数,将int类型转化为字符串长度
        int maxLength = (max + "").length();

        //定义二维数组，长度为10，深度为originArray的长度
        int[][] array = new int[10][originArray.length];

        //定义辅助数组
        int[] help = new int[10];
        int num = 0;
        //对个位进行排序
        for (int i = 0; i < originArray.length; i++) {
            num = originArray[i] % 10;
            //此时给辅助数组计数
            help[num] += 1;
            array[num][help[num]] = originArray[i];
        }
        //此时按位取数
        int index = 0;
        for (int i = 0; i < help.length; i++) {
            if (help[i] != 0) {
                for (int j = 0; j < help[i]; j++) {
                    originArray[index++] = array[i][j + 1];
                }
            }
            help[i] = 0;
        }
        System.out.println(Arrays.toString(originArray));
    }

}
