package classes;

public class Complex {
    private double re, im;

    public Complex(double val) {
        this(val, 0);
    }

    public Complex(double val, double i) {
        this.re = val;
        this.im = i;
    }

    public Complex(Complex copy) {
        this.re = copy.re;
        this.im = copy.im;
    }

    public Complex sum(Complex val) {
        this.re += val.re;
        this.im += val.im;
        return this;
    }

    public Complex sub(Complex val) {
        this.re -= val.re;
        this.im -= val.im;
        return this;
    }

    public Complex mult(Complex val) {
        this.re *= val.re;
        this.im *= val.im;
        return this;
    }

    public Complex div(Complex val) {
        this.re /= val.re;
        this.im /= val.im;
        return this;
    }

    public void print() {
        System.out.print("(" + this.re + ") "+ ( this.im != 0 ? ((this.im > 0 ? "+" : "") + this.im + "i") : "") );
    }
}
