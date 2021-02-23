import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] num_array = {3, 1, 2};
        System.out.println(Arrays.toString(num_array));

        Arrays.sort(num_array);     //Ordena: cambia el valor por referencia
        System.out.println(Arrays.toString(num_array)); //Imprime array de una dimencion con toString()


        int[][] example = new int[2][3];
        example[0][0] = 1;
        System.out.println(Arrays.deepToString(example));   //Imprime matriz con deepToString()
    }
}
