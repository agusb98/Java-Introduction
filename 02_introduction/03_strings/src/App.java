public class App {
    public static void main(String[] args) throws Exception {
        String name = new String("Agustin");
        //String name = "Agustin";

        System.out.println("name: " + name);
        System.out.println("lenght name: " + name.length());
        System.out.println("index of 's': " + name.indexOf("s"));   //method indexOf comienza desde cero

        String new_name = name.replace("us", "US");
        System.out.println("words replaced of name: " + new_name);

        new_name = name.toUpperCase();
        System.out.println("words replaced of name: " + new_name);
    }
}
