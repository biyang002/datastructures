package com.datastructures.stack;

import com.sun.javafx.sg.prism.web.NGWebView;

/**
 * 判断回文
 */
public class TestApp {
    public static void main(String[] args) {
        String deteString = "acbea";
        System.out.print(detecation(deteString));
    }

    public static boolean detecation(String val) {
        /*
        初始化对象
         */
        ArrayStack arrayStack = new ArrayStack(10);
        //获取字符串长度
        int arrayLength = val.length();
        //将数组入栈
        for (int i = 0; i < arrayLength; i++) {
            arrayStack.push(val.charAt(i));
        }
        /*
        获取
         */
        String newVal = "";
        for (int i = 0; i < arrayLength; i++) {
            char pop = (char) arrayStack.pop();
            newVal += pop;
        }
        if (newVal.equals(val)){
            return true;
        }
        return false;
    }
}
