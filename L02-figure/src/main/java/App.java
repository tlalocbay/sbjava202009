import figure.Reactangle;
import figure.Triangle;
import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Введите фигуру:");
            //Scanner in = new Scanner(System.in);
            String figure = in.next();

            switch (figure) {
                case "треугольник":
                    System.out.println("Введите стороны треугольника:");
                    int a = in.nextInt();
                    int b = in.nextInt();
                    int c = in.nextInt();

                    Triangle t = new Triangle(a,b,c);


                    System.out.println("Периметр треунольника = " + t.getPerimetr());
                    System.out.println("Площадь треунольника = " + t.getSquare());
                    break;

                case "прямоугольник":
                    System.out.println("Введите стороны прямоугольника:");
                    int x = in.nextInt();
                    int y = in.nextInt();

                    Reactangle r = new Reactangle(x, y);

                    System.out.println("Периметр прямоугольника = " + r.getPerimetr());
                    System.out.println("Площадь прямоугольника = " + r.getSquare());
                    break;
                case "квадрат":
                    System.out.println("Введите стороны квадрата:");
                    double k = in.nextInt();

                    Reactangle q = new Reactangle(k);

                    System.out.println("Периметр квадрата = " + q.getPerimetr());
                    System.out.println("Площадь квадрата = " + q.getSquare());
                    break;
                default:
                    System.out.println("try again");
                    break;
            }
        }
    }
}
