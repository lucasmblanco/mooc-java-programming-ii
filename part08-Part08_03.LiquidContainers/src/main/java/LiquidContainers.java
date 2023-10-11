
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First " + first + "/100");
            System.out.println("Second " + second + "/100");


            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            } else {
                String[] inputArr = input.split(" ");
                switch (inputArr[0]) {
                    case "add":
                        if (first + Integer.parseInt(inputArr[1]) >= 100) {
                            first = 100;
                        } else if (Integer.parseInt(inputArr[1]) > 0) {
                            first += Integer.parseInt(inputArr[1]);
                        }
                        break;
                    case "move":
                        if (Integer.parseInt(inputArr[1]) > 100) {
                            first = 0;
                            second = 100;
                        } else if (Integer.parseInt(inputArr[1]) < first) {
                            first -= Integer.parseInt(inputArr[1]);
                            if (second + Integer.parseInt(inputArr[1]) > 100) {
                                second = 100;
                            } else {
                                second += Integer.parseInt(inputArr[1]);
                            }
                        } else {
                            if (second + first > 100) {
                                second = 100;
                            } else {
                                second += first;
                            }
                            first = 0;
                        }
                        break;
                    case "remove":
                        if (second - Integer.parseInt(inputArr[1]) <= 0) {
                            second = 0;
                        } else if (Integer.parseInt(inputArr[1]) < 100) {
                            second -= Integer.parseInt(inputArr[1]);
                        }
                        break;
                }
            }

        }
    }

}
