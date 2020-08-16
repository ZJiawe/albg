package juc;

import juc.version.EntityA;

import java.util.*;

/**
 * @Auther: MrZheng
 * @Date: 2020/8/16 11:12
 * @Description:
 */
class Sale {
    private int number = 30;

    private List<Integer> al = new ArrayList<>();


    public void add(Integer a) {
        System.out.println(Thread.currentThread().getName() + ": " + a);
        al.add(a);
    }

    public Integer get() {
        System.out.println(Thread.currentThread().getName() + ": " + al.get(0));
        return al.get(0);
    }
}


public class SaleCheck {


    public static void main(String[] args) {
        Set<EntityA> a = new HashSet<>();
        a.add(new EntityA().setAId("1").setContent("2"));
        a.remove(new EntityA().setAId("1"));
        a.add(new EntityA().setAId("1").setContent("1"));

        a.add(new EntityA().setAId("1").setContent("3"));
        System.out.println(a);
    }

}
