
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here

        int[] numbers = {8, -2, 3, 1, 1};
        System.out.println(sum(numbers, 0, numbers.length, 0, 999));
    }

    public static int sum(int[] array, int  fromWhere, int toWhere, int smallest, int largest){
        int total = 0;
        for(int i = Math.max(fromWhere, 0); i < (Math.min(toWhere, array.length)); i++){
            if (smallest <= array[i] && largest >= array[i]) total += array[i];
        }
        return total;
    };

}
