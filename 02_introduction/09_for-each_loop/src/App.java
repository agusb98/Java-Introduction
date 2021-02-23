import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        String[] fruits = {"Apple", "Mango", "Orange"};
        
        for(int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }

        //SAME AS
        for(String fruit: fruits){
            System.out.println(fruit);
        }
    }
}
