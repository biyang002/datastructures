package com.datastructures.linked;

public class BooksNode {
    public int id;
    public String name;
    public double price;
    public BooksNode pre;
    public BooksNode next;

    public BooksNode(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "BooksNode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
