package com.company;

import classes.Complex;
import classes.Matrix;

public class Main {

    public static void main(String[] args) {
        Complex test = new Complex(5, 5);
        Complex test2 = new Complex(2, 2);
        test.sum(test2).print();
        System.out.print("\n");
        test.mult(test2).print();
        System.out.print("\n");

        Matrix matrix = new Matrix(2, 2, 4);

        matrix.print();
        matrix.set(1, 1, test);
        System.out.print("Matrix1:\n");
        matrix.print();

        Matrix matrix2 = new Matrix(2, 2, new Complex(3, -3));
        System.out.print("Matrix2:\n");
        matrix2.print();
        System.out.print("Matrix1 + Matrix2:\n");
        matrix.sum(matrix2).print();
        matrix.mult(test2);
        matrix.print();

    }
}
