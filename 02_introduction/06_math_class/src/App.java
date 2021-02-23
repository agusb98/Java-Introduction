public class App {
    public static void main(String[] args) throws Exception {
        double num1 = 3.4;
        double num2 = 6.7;

        double max = Math.max(num1, num2);
        double min = Math.min(num1, num2);

        System.out.println("numero mayor: " + max);
        System.out.println("numero menor: " + min);

        double ran = Math.random() * 100;   //numero aleatorio entre 1 y 100
        System.out.println("numero aleatorio: " + ran);
    }
}
