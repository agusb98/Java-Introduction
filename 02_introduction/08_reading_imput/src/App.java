import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);   //Usuario escribe por consola su nombre y edad

        System.out.print("Nombre: ");
        String name = scanner.nextLine();
        name = name.trim(); //elimina los espacios en blanco que se encuentren delante del string

        System.out.print("Age: ");
        byte age = scanner.nextByte();

        System.out.println("You are: " + name + ", Age " + age);


    }
}
