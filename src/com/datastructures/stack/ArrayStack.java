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

    /**
     * 判断是是否是一个运算符 + — * /
     */
    public boolean isOper(char v){
        return v == '+' || v == '-' ||v == '*' ||v == '/';
    }

    /**
     * 判断运算符优先级 使用数字表示优先级大小， 数字越大优先级越大
     */
    public int priority(int oper){
        if (oper == '*' || oper == '/'){
            return 1;
        }else if (oper == '+'||oper == '-'){
            return 0;
        }else{
            //其他运算符不进行计算
            return -1;
        }
    }

    /**
     * 获取栈顶数据
     * @return
     */
    public int peek(){
        return this.stack[top];
    }

    /**
     * 获取当前栈的容量大小
     */
    public int stackLength(){
        return this.stack.length;
    }

    /**
     * 计算两个数进行运算的结果
     */
    public int calculate(int num1,int num2,int oper){
        //计算结果
        int result = 0;
        switch (oper){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num2 - num1;
                break;
            case '*':
                result = num2 * num1;
                break;
            case '/':
                result = num2 / num1;
                break;

            default:
                break;

        }
        return result;
    }


}

