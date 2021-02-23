import java.util.Date;
import java.awt.*;

public class App {
    public static void main(String[] args) throws Exception {
        byte a = 6;
        short b = 34;
        int c = 190;
        long d = 199999;
        float e = 2;
        double f = 89.3;
        char g = 'A';   //no funciona con char g = "a";
        boolean h = true;

        System.out.println("byte: " + a);
        System.out.println("short: " + b);
        System.out.println("int: " + c);
        System.out.println("long: " + d);
        System.out.println("float: " + e);
        System.out.println("double: " + f);
        System.out.println("char: " + g);
        System.out.println("boolean: " + h);

        Date date = new Date();
        date.getTime();

        System.out.println("date now: " + date);

        //PUNTEROS: POINTERS

        Point puntero = new Point(2, 3);        //variable x vale 2, y vale 3
        puntero.x = 44;

        System.out.println("puntero: " + puntero.x + " " + puntero.y);
    }
}
