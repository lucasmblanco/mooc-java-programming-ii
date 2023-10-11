
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while(true){
            int value = Integer.parseInt(scanner.nextLine());
            if(value == 0){
                break;
            } else if ( value > 0) {
                numbers.add(value);
            }
        }
        int total = 0;
        for(Integer n : numbers){
            total += n;
        }

        if(total <= 0){
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((double) total / numbers.size());
        }



    }
}
