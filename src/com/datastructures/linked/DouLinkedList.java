package com.datastructures.linked;

public class DouLinkedList {
    private BooksNode head = new BooksNode(0, " ", 0.0);
    /**
     * 增加结尾新的结点
     */
    public void addLast(BooksNode booksNode){
        BooksNode temp = head;
        while (true){
            //表示双向链表是空的
            if (temp.next == null){
                break;
            }
            temp = temp.next;
        }
        booksNode.pre = temp;
        temp.next = booksNode;
    }
    /**
     * 通过id实现删除
     */
    public void remove(int id){
        if (head.next == null){
            System.out.println("空链表");
            return;
        }
        BooksNode temp = head;
        boolean flag = false;
        while (true){
            if (temp.id == id){
                flag = true;
                break;
            }else if(temp.next == null){
                break;
            }
            temp = temp.next;
        }
        if (flag){
           temp.pre.next = temp.next;
           //判断是否为最后一个元素,不判断的话回报空指针异常
            if(temp.next != null){
                temp.next.pre = temp.pre;
            }
            return;
        }else {
            System.out.println("未找到符合要求的数据");
        }

    }


    /**
     * 通过图书的编号进行修改
     */
    public void update(BooksNode booksNode){
        if (head.next == null) {
            System.out.println("空链表");
            return;
        }
        BooksNode temp = head;
        boolean flag = false;
        while (true){
            if(temp.next == null){
                break;
            }else if(temp.id == booksNode.id){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag){
            temp.name = booksNode.name;
            temp.price = booksNode.price;
            return;
        }else {
            System.out.println("没找到符合条件的id");
        }



    }
    /**
     * 查询
     */
    public void list(){
        if (head.next == null) {
            System.out.println("空链表");
            return;
        }
        BooksNode temp = head;
        while (true){
            if (temp.next == null){
                break;
            }
            temp.toString();
            temp = temp.next;
        }
    }
}
