import java.util.Arrays;

public class App {

  public static void main(String[] args) throws Exception {
    String[] fruits = { "Apple", "Mango", "Orange" };

    int i = 0;

    System.out.println("LENGTH: fruits.length -> show all ");
    do {
      System.out.println(fruits[i]);
      i++;
    } while (i < fruits.length);

    /* the other way */
    
    i = 0;

    System.out.println("LENGTH: fruits.length -> filter Orange ");
    while (i != fruits.length) {
      System.out.println(fruits[i]);
      i++;

      if(fruits[i] == "Orange"){
          break; /* Sale del loop */
      }
    }
  }
}
