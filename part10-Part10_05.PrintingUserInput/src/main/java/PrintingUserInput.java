
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            String input = scanner.nextLine();
            if(input.isEmpty()){
                break;
            }
            words.add(input);
        }

        String combined =  words.stream().reduce("",( prev, actual) -> prev + actual + "\n");
        System.out.println(combined);

    }
}
