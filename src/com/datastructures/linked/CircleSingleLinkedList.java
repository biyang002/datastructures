package com.datastructures.linked;

import org.jetbrains.annotations.TestOnly;

public class CircleSingleLinkedList {
    /**
     * 约瑟夫问题：构建环形链表 5
     */
    private Boy first = new Boy(-1);//定义头结点
    public void addBoy(int nums){
        //校验数据
        if (nums<1){
            System.out.println("数据不符合");
            return;
        }
        //定义临时结点
        Boy temp = null;
        for (int i = 1; i <= nums; i++) {
            Boy boy = new Boy(i);
            //首先让头结点自己指向自己
            //判断是否为第一个结点，如果是，则自己与自己构成一个环形链表
            if (i==1){
                first = boy;
                first.setNext(first);
                temp = first;
            }else {
                temp.setNext(boy);
                boy.setNext(first);
                temp=boy;
            }
        }


    }
    /**
     * 查看环形链表中的结点
     */
    public void showBoy(){
        if (first==null){
            System.out.println("链表为空");
            return;
        }

        Boy boy = first;
        while (true) {
            System.out.printf("小孩子的编号%d/n",boy.getId());
            if (boy.getNext()==first){
                break;
            }
            boy = boy.getNext();
        }


    }
}
