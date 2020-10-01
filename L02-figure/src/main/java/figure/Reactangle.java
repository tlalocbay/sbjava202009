package figure;

public class Reactangle extends Figure {
    double a = 0;
    double b = 0;

    public Reactangle (double a){
        this.a = a;
        this.b = b;
        this.square = a * a;
        this.perimetr = 4 * a;
    }


    public Reactangle(double a, double b){
        this.a = a;
        this.b = b;
        this.perimetr = 2*(a + b);
        this.square = a * b;
    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

}
