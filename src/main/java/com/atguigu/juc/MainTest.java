package com.atguigu.juc;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author tongatong
 * @name MainTest
 * @description
 * @date 2021/8/31
 * @time 10:47
 */
public class MainTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            System.out.println(1);
            System.out.println(Thread.currentThread().getName());



        }, "name");
        t1.start();


    }
}
