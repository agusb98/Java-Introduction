import java.util.Scanner;
import java.text.NumberFormat;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double principal = getDouble("Principal: ", scanner);
        double rate = getDouble("Annual Interest Rate: ", scanner);
        int time = getInt("Period (years): ", scanner);
        
        rate = (rate / 100) / 12;
        time = time * 12;

        double result = getMortgage(principal, rate, time);
        System.out.println("Mortgage: " + formatMortgage(result));
    }

    //FUNCTIONS
    
    public static double getDouble(String mensage, Scanner scanner) {  
        System.out.print(mensage);
        return scanner.nextDouble();
    }

    public static int getInt(String mensage, Scanner scanner) {  
        System.out.print(mensage);
        return scanner.nextInt();
    }

    public static double getMortgage(double principal, double rate, int time) {  
        return (principal * rate) / (1 - Math.pow(1 + rate, -time));
    }

    public static String formatMortgage(double x) {  
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(x);
    }
}
