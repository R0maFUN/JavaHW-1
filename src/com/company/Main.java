package com.company;

import classes.Complex;
import classes.Matrix;

public class Main {

    public static void main(String[] args) {
        Complex test = new Complex(5, 5);
        Complex test2 = new Complex(2, 2);
        test.sum(test2).print();
        test.mult(test2).print();
        //Matrix test3 = new Matrix(5);
    }
}
