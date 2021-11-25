package com.datastructures.queue;

/**
 * @Author biyang
 * @Date 2021/11/25 9:58 上午
 * @Version 1.0
 */
public class TestApp {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(5);
        arrayQueue.add(1);
        arrayQueue.add(2);
        arrayQueue.add(3);
        arrayQueue.add(4);
        arrayQueue.add(5);

        System.out.println(arrayQueue.get());

        arrayQueue.findQueue();
    }
}
