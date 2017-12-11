package org.yrs.algorithms.fundamentals.programmingModel;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

import java.awt.*;
import java.util.Arrays;

/**
 * test StdDraw
 *
 * @author ByrsH
 * @create 2017-12-11 23:55
 **/

public class SortRandomArray {
    public static void main(String [] args){
        int N = 50;
        double[] a = new double[N];
        for (int i = 0; i < N; i++){
            a[i] = StdRandom.random();
        }
        Arrays.sort(a);
        for (int i = 0; i < N; i++){
            double x = 1.0*i/N;
            double y = a[i]/2.0;
            double rw = 0.5/N;
            double rh = a[i]/2.0;
            StdDraw.setPenColor(Color.green);
            StdDraw.filledRectangle(x, y, rw, rh);
        }
    }
}
