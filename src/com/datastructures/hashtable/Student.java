package com.datastructures.hashtable;

public class Student {
    public int id;
    public String name;
    //指向下一个节点的next指针
    public Student next;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
