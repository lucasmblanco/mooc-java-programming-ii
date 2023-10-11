
import java.util.*;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Book> bookList = new ArrayList<>();

        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String bookTitle = scanner.nextLine();

            if (bookTitle.equals("")) {

                System.out.println(bookList.size()+ " books in total.");

                System.out.println("Books:");

                Comparator<Book> comparator = Comparator
                        .comparing(Book::getAge)
                        .thenComparing(Book::getName);

                Collections.sort(bookList, comparator);

                bookList
                        .forEach(Book -> System.out.println(Book));

                break;
            }

            System.out.print("Input the age recommendation: ");
            int ageRec = Integer.valueOf(scanner.nextLine());

            bookList.add(new Book(bookTitle, ageRec));

        }

    }

}
