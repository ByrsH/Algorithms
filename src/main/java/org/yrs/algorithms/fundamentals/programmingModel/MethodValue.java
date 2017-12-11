package org.yrs.algorithms.fundamentals.programmingModel;

import edu.princeton.cs.algs4.StdDraw;

import java.awt.*;

/**
 * test StdDraw
 *
 * @author ByrsH
 * @create 2017-12-11 23:32
 **/

public class MethodValue {
    public static void main(String [] args){
        int N = 100;
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(0, N*N);
        StdDraw.setPenRadius(.01);
        for (int i = 1; i <= N; i++){
            StdDraw.setPenColor(Color.red);
            StdDraw.point(i, i);
            StdDraw.setPenColor(Color.GREEN);
            StdDraw.point(i, i*i);
            StdDraw.setPenColor(Color.YELLOW);
            StdDraw.point(i, i*Math.log(i));
        }
    }
}
