import java.util.ArrayList;
import java.util.Array;
import java.util.Scanner;

 class Member {
    private int id;
    private String name;
    private String profession;
    private String college; // Fixed spelling from "collage" to "college"

    // Method to input member details
    void memberInput() {
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
    }

    // Method to display member details
    void display() {
        System.out.println("Member Id: " + id);
        System.out.println("Member Name: " + name);
        System.out.println("Member Profession: " + profession);
        System.out.println("College Name: " + college);
    }

     class Book
    {
        private int bookid;
        private String bookname;
        private String author;
        private int isbn;
        private List<M> member;

        public Book()
        {
            member=new Arraylist<>();
        }

        void bookinput()
        {
            Scanner scanner=new Scanner(System.in);
            System.out.print("Enter the Book ID=");
            id=scanner.nextint();
            scanner.nextline();

            System.out.print("Enter the Book Name=");
            bookname=scanner.nextline();

            System.out.print("Enter the Author Name=");
            author=scanner.nextline();

            System.out.print("Enter the Isbn Number=");
            isbn=scanner.nextint();
        }

        void addmember()
        {
            M m=new Member();
            m.memberInput();
            member.add(m);//add member to the list
        }

        void bookdetails()
        {
            System.out.print("Book ID:" +bookid);
            System.out.print("Book Name:" +bookname);
            System.out.print("Author Name:" +author);
            System.out.print("ISBN Number:" +isbn);

            M m=new Member();
            m.display();
        }
    
    }

    public static void main(String[] args) {
        Book b=new Book();

        b.bookinput();
        b.bookdetails();
    }
}