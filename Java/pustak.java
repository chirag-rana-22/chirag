import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Member {
    private int id;
    private String name;
    private String profession;
    private String college; // Fixed spelling from "collage" to "college"

    // Method to input member details
    public void memberInput() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter The Member Id: ");
        id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter the Member Name: ");
        name = scanner.nextLine();

        System.out.print("Enter the Member Profession (Student/Faculty): ");
        profession = scanner.nextLine();

        System.out.print("Enter the College Name: ");
        college = scanner.nextLine();

        // Do not close the scanner here to avoid closing System.in
    }

    // Method to display member details
    public void display() {
        System.out.println("Member Id: " + id);
        System.out.println("Member Name: " + name);
        System.out.println("Member Profession: " + profession);
        System.out.println("College Name: " + college);
    }
}

class Book {
    private int bookid;
    private String bookname;
    private String author;
    private int isbn;
    private Member member;

    public Book(Member member) {
        this.member = member;
    }

    public void bookinput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Book ID=");
        bookid = scanner.nextInt(); // Corrected id to bookid
        scanner.nextLine();

        System.out.print("Enter the Book Name=");
        bookname = scanner.nextLine();

        System.out.print("Enter the Author Name=");
        author = scanner.nextLine();

        System.out.print("Enter the Isbn Number=");
        isbn = scanner.nextInt();
        scanner.nextLine();

        // Do not close the scanner here to avoid closing System.in
    }

    public void bookdetails() {
        System.out.println("Book ID:" + bookid);
        System.out.println("Book Name:" + bookname);
        System.out.println("Author Name:" + author);
        System.out.println("ISBN Number:" + isbn);
        member.display();
    }
}

class pustak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Member member = new Member();
        member.memberInput();

        System.out.println("How many books do you want to add? ");
        int numberOfBooks = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        List<Book> books = new ArrayList<>();
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println("Enter details for Book " + (i + 1) + ":");
            Book book = new Book(member);
            book.bookinput();
            books.add(book);
        }

        for (Book book : books) {
            book.bookdetails();
        }

        scanner.close(); // Close the scanner at the end
    }
}