package com.datastructures.hashtable;


/**
 * 以链表的形式实现hash表的结构
 */
public class TestApp {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);
        Student student = new Student(1, "张三");
        Student student2 = new Student(2, "李四");
        Student student3 = new Student(3, "王武");
        Student student4 = new Student(4, "周六");
        Student student5 = new Student(4, " 小七");

        hashTable.add(student);
        hashTable.add(student2);
        hashTable.add(student3);
        hashTable.add(student4);
        hashTable.add(student5);

        hashTable.list();

        hashTable.findByStudentId(4);

    }




}
