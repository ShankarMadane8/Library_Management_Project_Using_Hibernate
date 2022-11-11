package fabtech;
import java.util.Scanner;
 

public class BookRecords {

    BookAddForm objAddBook = new BookAddForm();

    void callAddBooksForms() {
        Scanner obj = new Scanner(System.in);

        while (true) {
            objAddBook.addBooksForm();
            String flag = "no";

            System.out.println("add one more book (yes/no): ");
            String choose = obj.nextLine();

            if (choose.equals(flag)) {

                break;
            }

        }

    }

    BookShows objbook = new BookShows();

    // ----------------------------

    void Librarydisplay() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("*********** Welcome To the Library ***********");
        System.out.println("1.Add Books");
        System.out.println("2.Show Books");
        System.out.println("3.Delete Book");
        System.out.println("4.Update Book");
        System.out.println("5.Back");
        System.out.println("Enter your option");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                callAddBooksForms();
                Librarydisplay();
                break;

            case 2:
                objbook.bookShows();
                Librarydisplay();
                break;

            case 3:
                BookDelete.bookDelete();
                Librarydisplay();
                break;

            case 4:
                BookUpdate.bookUpdate();
                Librarydisplay();
                break;

            case 5:
                break;

            default:
                break;
        }
    }

}
