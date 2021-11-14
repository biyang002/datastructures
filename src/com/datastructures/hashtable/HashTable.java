package com.datastructures.hashtable;

import org.jetbrains.annotations.NotNull;

public class HashTable {

    private StudentLinkedList[] studentLinkedLists;

    private int size;

    public HashTable(int size){
        this.size = size;
        studentLinkedLists = new StudentLinkedList[size];
        /*
         * 数组中添加链表对象
         */
        for (int i = 0; i < size; i++) {
            studentLinkedLists[i] = new StudentLinkedList();
        }
    }

    /**
     * 哈希函数
     * @param sid
     * @return
     */
    public int hashCode(int sid){
        return sid % size;
    }
    /**
     * 添加学员
     */
    public void add(@NotNull Student student){
        //决定了数组中的下标
        int hashval = hashCode(student.id);
        /*
        添加到制定的链表中
         */
        studentLinkedLists[hashval].add(student);
    }

    /**
     * 查看hash表中的元素
     */
    public void list(){
        for (int i = 0; i < size; i++) {
            studentLinkedLists[i].list(i);
        }
    }

    /**
     * 根据学生编号进行查询
     */
    public void findByStudentId(int sid){
        int hasval = hashCode(sid);
        Student student = studentLinkedLists[hasval].findById(sid);
        if (student != null){
            System.out.printf("在第 %d 条链表中找到了学院编号是：%d\n",(hasval+1), sid);
        }else {
            System.out.println("整个hash表中未找到学员");
        }
    }

}
