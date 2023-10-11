
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container containerOne = new Container();
        Container containerTwo = new Container();

        while (true) {
            System.out.println("First: " + containerOne);
            System.out.println("Second: " + containerTwo);
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } else {
                String[] inputArr = input.split(" ");
                String command = inputArr[0];
                int value = Integer.parseInt(inputArr[1]);
                switch (command) {
                    case "add":
                        containerOne.add(value);
                        break;
                    case "move":
                        if (containerOne.contains() >= value) {
                            containerOne.remove(value);
                            containerTwo.add(value);
                        } else if (containerOne.contains() < value ){
                            containerTwo.add(containerOne.contains());
                            containerOne.remove(containerOne.contains());
                        }
                        break;
                    case "remove":
                        containerTwo.remove(value);
                        break;
                }
            }

        }
    }

}
