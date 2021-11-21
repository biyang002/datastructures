package com.datastructures.linked;

public class LinkedTest {
    public static void main(String[] args) {
        GoodsNode goodsNode1 = new GoodsNode(1, "nike", 599.00);
        GoodsNode goodsNode2 = new GoodsNode(1, "addidas", 699.00);
        GoodsNode goodsNode3 = new GoodsNode(1, "lining", 499.00);
        LinkedList_ linkedList_ = new LinkedList_();
        linkedList_.add(goodsNode1);
        linkedList_.add(goodsNode2);
        linkedList_.add(goodsNode3);
        linkedList_.list();
    }
}
