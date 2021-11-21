package com.datastructures.linked;

public class GoodsNode {
    public int id;
    public String name;
    public double price;
    public GoodsNode next;

    public GoodsNode(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public GoodsNode getNext() {
        return next;
    }

    public void setNext(GoodsNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "GoodsNode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", next=" + next +
                '}';
    }
}
