import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        //byte > short > int > long > float > double

        String numStr = "1";
        int numInt = Integer.parseInt(numStr);
        float numFloat = Float.parseFloat(numStr);

        System.out.println("numero en string: " + numStr); 
        System.out.println("numero casteado a int: " + numInt); 
        System.out.println("numero casteado a float: " + numFloat); 
    }
}
