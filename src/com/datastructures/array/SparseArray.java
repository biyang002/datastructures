package com.datastructures.array;

import java.util.Arrays;

/**
 * 稀疏数组的学习及使用
 * @Author biyang
 * @Date 2021/11/22 3:46 下午
 * @Version 1.0
 */
public class SparseArray {
    public static void main(String[] args) {
        /*
        1.模拟棋盘数据创建二维数组并打印
        */
        int[][] array = new int[11][11];
        array[1][2] = 1;
        array[2][4] = 2;

        //打印
        for (int[] row:array) {
            for (int val: row) {
                System.out.printf("%d\t",val);
            }
            System.out.println("\n");
        }

        /*
        2.创建稀疏数组
         */
        //拿到有效数据，并获取个数
        int nums = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (array[i][j] != 0){
                    nums++;
                }
            }
        }
        System.out.println("有效数据为："+nums);
        //创建稀疏数组,小型二维数组
        int[][] sparesArray = new int[nums+1][3];
        sparesArray[0][0] = 11;
        sparesArray[0][1] = 11;
        sparesArray[0][2] = nums;
        //定义稀疏数组的指针
        int count = 0;
        //将数据遍历至稀疏数组中
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (array[i][j] != 0){
                    count ++;
                    sparesArray[count][0] = i;
                    sparesArray[count][1] = j;
                    sparesArray[count][2] = array[i][j];
                }
            }

        }
        //打印稀疏数组
        for (int[] row: sparesArray) {
            for (int val: row) {
                System.out.printf("%d\t",val);
            }
            System.out.println();
        }

        /*
        3.稀疏数组还原为二维数组
         */
        int rowNums = sparesArray[0][0];
        int lineNums = sparesArray[0][1];
        //还原二维数组
        int[][] org = new int[rowNums][lineNums];
        int count2 = sparesArray[0][2];//定义稀疏数组指针
        //将数据存入二维数组中
        //此方法会出现数组下标越界问题
//        for (int i = 0; i < rowNums; i++) {
//            for (int j = 0; j < lineNums; j++) {
//                if (sparesArray[count2][0] == i && sparesArray[count2][1] == j){
//                    org[i][j] = sparesArray[count2][2];
//                    System.out.println(count2);
//                    count2++;
//                    if (count2>sparesArray.length) {
//                        return;
//                    }
//                }
//            }
//
//        }
        for (int i = 1; i <=count2 ; i++) {
            org[sparesArray[i][0]][sparesArray[i][1]] = sparesArray[i][2];
        }
        //打印还原的二维数组(面试题)
        for (int[] row:org) {
            for (int val: row) {
                System.out.printf("%d\t",val);
            }
            System.out.println("\n");
        }
    }

}
