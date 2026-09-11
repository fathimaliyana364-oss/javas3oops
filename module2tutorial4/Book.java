package module2;
import java.util.Scanner;

class Book
{
    String title;
    String author;
    double price;

    Book(String t, String a, double p)
    {
        title = t;
        author = a;
        price = p;
    }

    void display()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book 1 Title: ");
        String title1 = sc.nextLine();

        System.out.print("Enter Book 1 Author: ");
        String author1 = sc.nextLine();

        System.out.print("Enter Book 1 Price: ");
        double price1 = sc.nextDouble();
        sc.nextLine();

        Book b1 = new Book(title1, author1, price1);

        System.out.print("Enter Book 2 Title: ");
        String title2 = sc.nextLine();

        System.out.print("Enter Book 2 Author: ");
        String author2 = sc.nextLine();

        System.out.print("Enter Book 2 Price: ");
        double price2 = sc.nextDouble();

        Book b2 = new Book(title2, author2, price2);

        System.out.println("\nBook 1 Details:");
        b1.display();

        System.out.println("\nBook 2 Details:");
        b2.display();
    }
}
