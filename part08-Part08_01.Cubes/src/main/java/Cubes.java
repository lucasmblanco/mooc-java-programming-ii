
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
           String value = scanner.nextLine();
           if(value.equals("end")){
               break;
           }else {
               double intValue = Double.parseDouble(value);
               System.out.println((int) Math.pow(intValue, 3));
           }
        }
    }
}
