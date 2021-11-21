package com.datastructures.linked;

public class LinkedTest2 {
    public static void main(String[] args) {
        DouLinkedList douLinkedList = new DouLinkedList();
        BooksNode booksNode1 = new BooksNode(1,"红楼梦",66.00);
        BooksNode booksNode2 = new BooksNode(2,"西游记",66.00);
        BooksNode booksNode3 = new BooksNode(3,"水浒传",66.00);
        BooksNode booksNode4 = new BooksNode(4,"三国演义",66.00);

        douLinkedList.addLast(booksNode1);
        douLinkedList.addLast(booksNode2);
        douLinkedList.addLast(booksNode3);
        douLinkedList.addLast(booksNode4);

        System.out.println("..");

    }
}
