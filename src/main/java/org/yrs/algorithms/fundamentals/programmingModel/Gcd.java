package org.yrs.algorithms.fundamentals.programmingModel;

/**
 * 两个数的最大公约数
 *
 * @author ByrsH
 * @create 2017-11-15 23:15
 **/

public class Gcd {
    public static int gcd(int p, int q){
        if (q == 0){
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }

    public static void main(String [] args){
        System.out.println("3和1的最大公约数是：" + gcd(3, 1));
        System.out.println("120和30的最大公约数是：" + gcd(120, 30));
    }
}
