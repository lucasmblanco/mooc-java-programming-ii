
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> numbers = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while(true){
            String number = scanner.nextLine();
            if(number.equals("end")){
                break;
            }
            numbers.add(number);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String input = scanner.nextLine();
        if(input.equals("n")){
            System.out.println("Average of negative numbers: " + numbers.stream().mapToInt(n -> Integer.parseInt(n)).filter(n -> n < 0).average().getAsDouble());
        } else {
            System.out.println("Average of positive numbers: " + numbers.stream().mapToInt(n -> Integer.parseInt(n)).filter(n -> n > 0).average().getAsDouble());
        }
    }
}
