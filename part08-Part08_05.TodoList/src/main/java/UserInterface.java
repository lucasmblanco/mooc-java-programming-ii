import java.util.Scanner;

public class UserInterface {
    private TodoList todolist;
    private Scanner scanner;


    public UserInterface( TodoList todolist, Scanner scanner){
        this.todolist = todolist;
        this.scanner = scanner;

    }

    public void start(){
        while(true){
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if(command.equals("stop")){
                break;
            } else if (command.equals("add")){
                System.out.println("To add: ");
                String task = scanner.nextLine();
                todolist.add(task);
            } else if (command.equals("list")){
                todolist.print();
            } else if (command.equals("remove")){
                int index = Integer.parseInt(scanner.nextLine());
                todolist.remove(index);
            }
        }
    }
}
