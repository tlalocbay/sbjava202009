package figure;


public class Triangle extends Figure {
    double a;
    double b;
    double c;

    public Triangle (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        this.perimetr = a+b+c;
        this.square = Math.sqrt((this.perimetr/2)*(this.perimetr/2 -this.a)*(this.perimetr/2 -this.b)*(this.perimetr/2-this.c));

    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }


}
