package classes;

//import java.util.Vector;

public class Matrix/*<T>*/ {
    private int xDim, yDim;
    //private Vector<Vector<T> > values;
    private Complex[][] values;
    public Matrix(int dim) {
        this(dim, dim, new Complex(0));
    }
    public Matrix(int xdim, int ydim) {
        this(xdim, ydim, new Complex(0));
    }
    public Matrix(int xdim, int ydim, Complex val) {
        values = new Complex[ydim][xdim];
        for(int i = 0; i < ydim; ++i)
            for(int j = 0; j < xdim; ++j)
                this.values[i][j] = val;
        this.xDim = xdim;
        this.yDim = ydim;
    }
    public void set(int i, int j, Complex value) {
        values[i][j] = value;
    }
    public Complex get(int i , int j) {
        return values[i][j];
    }

    public Matrix sum(Matrix value) {
        if (this.xDim != value.xDim || this.yDim != value.yDim)
            return null;
        for(int i = 0; i < yDim; ++i)
            for(int j = 0; j < xDim; ++j)
                values[i][j] = values[i][j].sum(value.get(i, j));
        return this;
    }

    public Matrix sub(Matrix value) {
        if (this.xDim != value.xDim || this.yDim != value.yDim)
            return null;
        for(int i = 0; i < yDim; ++i)
            for(int j = 0; j < xDim; ++j)
                values[i][j] = values[i][j].sub(value.get(i, j));
        return this;
    }

    public Matrix mult(Matrix value) {
        if (this.xDim != value.xDim || this.yDim != value.yDim)
            return null;
        for(int i = 0; i < yDim; ++i)
            for(int j = 0; j < xDim; ++j)
                values[i][j] = values[i][j].mult(value.get(i, j));
        return this;
    }

    public Matrix mult(Complex value) {
        for(int i = 0; i < yDim; ++i)
            for(int j = 0; j < xDim; ++j)
                values[i][j] = values[i][j].mult(value);
        return this;
    }

    public Matrix div(Matrix value) {
        if (this.xDim != value.xDim || this.yDim != value.yDim)
            return null;
        for(int i = 0; i < yDim; ++i)
            for(int j = 0; j < xDim; ++j)
                values[i][j] = values[i][j].div(value.get(i, j));
        return this;
    }

    public Matrix div(Complex value) {
        for(int i = 0; i < yDim; ++i)
            for(int j = 0; j < xDim; ++j)
                values[i][j] = values[i][j].div(value);
        return this;
    }

}
