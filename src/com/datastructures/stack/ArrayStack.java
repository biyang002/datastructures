package com.datastructures.stack;


import java.util.Stack;

public class ArrayStack {
    /**
     * 栈的大小
     */
    private int maxStack;

    /**
     * 数组用来模拟栈
     */
    private int[] stack;

    /**
     * 栈顶索引值的位置, 默认情况下没有值的时候是-1
     */
    private int top = -1;

    public ArrayStack(int maxStack){
        this.maxStack = maxStack;
        //初始化数组长度,初始化容器
        stack = new int[maxStack];
    }

    /**
     * 判断是否栈满
     * @return
     */
    public boolean isFull() {
        return this.top == maxStack-1;
    }
    /**
     * 判断是否栈空
     * @return
     */
    public boolean isEmpty() {
        return this.top==-1;
    }

    /**
     * pop
     */
    public int pop(){
        /*
        判断是否栈空
         */
        if (isEmpty())
            throw new RuntimeException("栈空");
        int value = stack[top];
        top--;
        return value;
    }
    /**
     * push
     */
    public void push(int val){
        /*
        判断是否栈满
         */
        if(isFull())
            throw new RuntimeException("栈已满");
        top ++;
        stack[top] = val;
    }

    /**
     * 查看所有元素
     */
    public void list(){

    }


}

