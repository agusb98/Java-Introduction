import java.text.NumberFormat;

public class App {
    public static void main(String[] args) throws Exception {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String f = currency.format(23423.4);

        //SETEA CUALQUIER TIPO DE NUMERO A PRECIO
        System.out.println("precio: " + f);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String p = percent.format(0.1);

        //SETEA CUALQUIER TIPO DE NUMERO A PORCENTAJE
        System.out.println("precio: " + p);
    }
}
