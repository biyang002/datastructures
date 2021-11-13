package com.datastructures.stack;

import javax.xml.transform.Result;

/**
 * 使用栈计算表达式结果
 */
public class TestApp2 {
    public static void main(String[] args) {
        String math = "4+3*2-1";

        int result = mathdology(math);
        System.out.println(result);
    }

//    计算表达式数值
    private static int mathdology(String math) {
        /**
         * 1.需要遍历字符串，获取每一个字符，判断是数字还是符号
         * 2.如果是数字则入数字栈，如果是符号则入符号栈
         * 3.符号，如果是一个空栈，则直接入栈
         *        如果不是，则需要比较符号的优先级，新进来的运算符如果等于原栈中的运算符，那么需要把原运算符弹出，
         *       数字栈中数字进行弹栈，进行运算，运算后的结果重新放入数字栈中，新运算符入栈
         *       如果新运算符的优先级大于原符号栈中运算符，那么新的符号直接入栈。
         */

        ArrayStack numStack = new ArrayStack(10);
        ArrayStack operStack = new ArrayStack(10);
        int temp1 = 0;
        int temp2 = 0;
        int symbolchar = 0;
        int result = 0;

        String values = "";
        //遍历字符串，获取字符串的长度
        int length = math.length();
        for (int i = 0; i < length; i++) {
            char c = math.charAt(i);
            //判断是否是一个运算符
            if (operStack.isOper(c)) {
                //判断符号栈是否为空
                if (!operStack.isEmpty()){
                    //比较符号优先级
                    if (operStack.priority(c)<= operStack.priority(operStack.peek())){
                        temp1 = numStack.pop();
                        temp2 = numStack.pop();
                        symbolchar = operStack.pop();
                        result = numStack.calculate(temp1, temp2, symbolchar);

                        //把运算结果放入数字栈中
                        numStack.push(result);

                        //把当前符号押入占中
                        operStack.push(c);

                    }else {
                        operStack.push(c);
                    }

                }else {
                    operStack.push(c);
                }



            }else {
                //比如是33+44
                //可以进行字符串的拼接
                values += c;

                if (i == length-1){
                    numStack.push(Integer.parseInt(values));
                }else {
                    char data = math.substring(i+1,i+2).charAt(0);
                    if (operStack.isOper(data)){
                        numStack.push(Integer.parseInt(values));
                        values = "";
                    }

                }
            }
        }
        while (true){
            if (operStack.isEmpty()){
                break;
            }
            temp1 = numStack.pop();
            temp2 = numStack.pop();

            symbolchar = operStack.pop();

            result = numStack.calculate(temp1, temp2, symbolchar);

            numStack.push(result);
        }

        int res = numStack.pop();




        return res;
    }


}
