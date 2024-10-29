public class Triangle {
    private int a, b, c;
    public Triangle(int a, int b, int c) throws IllegalTriangleException {
        this.a = a;
        this.b = b;
        this.c = c;
        if(a<=0||b<=0||c<=0){
            throw new IllegalTriangleException("Side must be positive integer");

        }
        if(a+b<c||b+c<a||c+a<b){
            throw new IllegalTriangleException("Sum of 2 sides must be > third side");
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle sides = {" +
                "a = " + a +
                ", b = " + b +
                ", c = " + c +
                '}';
    }
}
