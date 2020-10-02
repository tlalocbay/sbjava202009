import figure.Reactangle;
import figure.Triangle;
import java.util.Scanner;
import figure.Figure;
public class App {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Введите фигуру:");
            String figname = in.next();
            Figure figure = null;
            switch (figname) {
                case "треугольник":
                    System.out.println("Введите стороны треугольника:");
                    int a = in.nextInt();
                    int b = in.nextInt();
                    int c = in.nextInt();
                    figure = new Triangle(a,b,c);
                    break;

                case "прямоугольник":
                    System.out.println("Введите стороны прямоугольника:");
                    int x = in.nextInt();
                    int y = in.nextInt();
                    figure = new Reactangle(x, y);
                    break;
                case "квадрат":
                    System.out.println("Введите стороны квадрата:");
                    double k = in.nextInt();
                    figure = new Reactangle(k);
                    break;
                default:
                    System.out.println("try again");
                    break;
            }
            System.out.println("Периметр треунольника = " + figure.getPerimetr());
            System.out.println("Площадь треунольника = " + figure.getSquare());

        }
    }
}
