package com.datastructures.linked;

import java.time.temporal.Temporal;

public class LinkedList_ {
    private GoodsNode node = new GoodsNode(0, "", 0.0);
    /**
     * 在链表中添加节点
     */
    public void add(GoodsNode goodsNode){
        GoodsNode temp = node;
        while (true)
        {
            if (temp.next==null) break;
            temp = temp.next;
        }
        temp.next = goodsNode;
    }

    /**
     * 按照商品编号id值进行添加，从小到大的顺序
     */
    public void addOder(GoodsNode goodsNode){
        GoodsNode temp = node;
        boolean flag = true;
        while (true){
            if (temp.next == null){
                break;
            } else if (temp.id>goodsNode.id){
                break;
            }else if (temp.id == goodsNode.id){
                flag = false;
                break;
            }
            temp = temp.next;
        }
        if (!flag){
            System.out.println("商品重复");
        }
        goodsNode.next=temp.next;
        temp.next = goodsNode;
    }
    /**
     * 修改节点
     * 1.找到链表中的目标节点
     * 2.根据新的数据进行修改
     * 3.根据商品的编号进行修改
     */
    public void update(GoodsNode goodsNode){
        GoodsNode temp = node;
        //标识符
        boolean flg = false;
        if (node.next == null){
            System.out.println("链表为空");
            return;
        }
        while (true){
            if (temp == null){
                break;
            }else if(temp.id == goodsNode.id){
                flg = true;
                break;
            }
            temp = temp.next;
        }
        if (flg){
            temp.name = goodsNode.name;;
            temp.price = goodsNode.price;
        }else {
            System.out.println("未找到节点");
        }

    }
    /**
     * 节点的删除,原理同上，忽略了未找到删除的节点
     */
    public void remove(GoodsNode goodsNode){
        //空链表
        if (node.next == null) return;
        GoodsNode temp = node;
        while (true){
            if(temp.next.id == goodsNode.id){
              break;
            }
            temp = temp.next ;
        }
        temp.next = temp.next.next;
    }
    /**
     * 定义查看链表中的每一个元素
     */
    public void list(){
        GoodsNode temp = node;
        if (node.next == null){
            System.out.println("空链表");
            return;
        }
        while (true){
            if (temp.next == null){
                break;
            }
            temp.toString();
            temp = temp.next;
        }
    }

}
