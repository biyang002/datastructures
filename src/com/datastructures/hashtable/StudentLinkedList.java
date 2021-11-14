package com.datastructures.hashtable;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * 用于构造链表对象
 */
public class StudentLinkedList {
    //链表的头结点
    private Student head;

    /**
     * 添加结点
     * 1.如果添加时是第一个学生对象,则直接赋值给第一个结点
     */
    public void add(Student newStudent){
        if (head == null){
            head = newStudent;
            return;
        }
        Student temp = head;
        while (true){
            if (temp.next == null){
                break;
            }
            temp = temp.next;
        }
        //添加新的结点
        temp.next = newStudent;

    }
    /**
     * 查询链表中的学生信息
     * no：链表所在数组下标
     */
    public void list(int no){
        if (head == null){
            System.out.println("第"+no+"链表是空...");
            return;
        }

        Student temp = head;
        while (true){
            System.out.printf("id=%d  name=%s\t",temp.id,temp.name);

            if (temp.next == null){
                break;
            }
            temp = temp.next;
        }
        System.out.println();

    }

    /**
     * 根据学原编号id查询结点
     */
    public Student findById(int id){
        if (head == null){
            System.out.println("空链表...");
        }
        Student temp = head;
        while (true){
            if (temp.id == id){
                break;
            }
            if (temp.next == null){
                temp = null;
                break;
            }
            temp = temp.next;
        }
        return temp;
    }





}
