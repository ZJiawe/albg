package juc;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @Auther: MrZheng
 * @Date: 2020/8/19 20:21
 * @Description:
 */
public class AbaSolver {


    public static void main(String[] args) {
        AtomicStampedReference<Integer> integerAtomicReference = new AtomicStampedReference<>(100, 1);

        new Thread(
                () -> {
                    int stamp = integerAtomicReference.getStamp();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    integerAtomicReference.compareAndSet(100, 101, stamp, stamp + 1);
                    stamp = integerAtomicReference.getStamp();
                    integerAtomicReference.compareAndSet(101, 100, stamp, stamp + 1);
                    System.out.println(Thread.currentThread().getName() + ": " + integerAtomicReference.getReference());
                }
                , "A").start();

        new Thread(
                () -> {
                    int stamp = integerAtomicReference.getStamp();
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    integerAtomicReference.compareAndSet(100, 2019, stamp, stamp + 1);
                    System.out.println(Thread.currentThread().getName() + ": " + integerAtomicReference.getReference());
                }
                , "B").start();

    }
}
