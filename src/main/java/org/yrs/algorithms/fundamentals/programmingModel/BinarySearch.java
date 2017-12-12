package org.yrs.algorithms.fundamentals.programmingModel;

import java.util.Arrays;

/**
 * 二分查找算法
 *
 * @author ByrsH
 * @create 2017-12-12 22:13
 **/

public class BinarySearch {
    public static int rank(int key, int[] a){
        // 数组必须是有序的
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi){
            //被查找的键要么不存在，要么必然存在于a[lo..hi]之中
            int mid = lo + (hi - lo)/2;
            if (key < a[mid]){
                hi = mid - 1;
            }else if (key > a[mid]){
                lo = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static int recursionRank(int key, int[] a){
        //递归方式实现
        return recursionRank(key, a, 0, a.length-1);
    }

    public static int recursionRank(int key, int[] a, int lo, int hi){
        if (lo > hi) return -1;
        int mid = lo + (hi - lo)/2;
        if (key < a[mid]) {
            return recursionRank(key, a, lo, mid-1);
        }else if (key > a[mid]){
            return recursionRank(key, a, mid+1, hi);
        }else {
            return mid;
        }
    }

    public static void main(String [] args){
        int[] whitelist = {2, 34, 5, 22, 9, 65, 12, 11};
        int[] test = {3, 5, 13, 2};
        Arrays.sort(whitelist);
        for (int item: test){
            if (rank(item, whitelist) < 0){
                System.out.println(item);
            }
        }
        for (int item: test){
            if (recursionRank(item, whitelist) < 0){
                System.out.println(item);
            }
        }
    }

}
