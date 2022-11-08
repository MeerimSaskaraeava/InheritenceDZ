import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Scanner scanner1=new Scanner(System.in);

        Author author1=new Author("Brian Tracy","briantracy@gmail.com","Male");
        Author author2=new Author("Jessamine Chan","jessaminechan@book.com","Female");
        Author author3=new Author("Eric Freeman","ericfreeman@gmail.com","Male");
        Author author4=new Author("Gayle Laakmann McDowell","gaylelaakmannMc@gmail.com","Female");
        Author author5=new Author("Margo Jefferson","margojefferson@system.com","Female");
        Author[]authors={author1,author2,author3,author4,author5};


        Book book1=new Book("Eat that frog!","Brian Tracy", 32.34,50);
        Book book2=new Book("The School for Good Mothers","Jessamine Chan",25.78,10);
        Book book3=new Book("Head First Design Patterns ","Eric Freeman",38.45,76);
        Book book4=new Book("Cracking the Coding Interview","Gayle Laakmann McDowell",56.74,55);
        Book book5=new Book("Constructing A Nervous System","Margo Jefferson",18.90,35);
        Book[]books={book1,book2,book3,book4,book5};

        System.out.println("If you want to find more expensive book input 0, " +
                           "find cheaper book input 1 please!" +
                           "find a book through author input 2");

        int more= scanner.nextInt();

        if(more==0){
            findMoreExpensive(books);}
        else if (more==1) {
            findCheaper(books);}
        else if (more==2) {
            String aut= scanner1.nextLine();
            findBooksTroughTheAuthor(aut,books);}
    }

    public static void findMoreExpensive(Book[]books){
        double max=books[0].getPrice();
        for (Book book : books) {
            max=Math.max(max, book.getPrice());
        }
        for (Book book : books) {
            if (book.getPrice()==max){
                System.out.println(book.toString()); }
        }}
    public static void findCheaper(Book[]books){
        double min=books[0].getPrice();
        for (Book book : books) {
            min=Math.min(min, book.getPrice());
        }
        for (Book book : books) {
          if (book.getPrice()==min){
              System.out.println(book.toString());
          }
        }

    }
    public static void findBooksTroughTheAuthor (String author,Book[]books){
        for (Book book : books) {
            if (book.getAuthor().equals(author)){
                System.out.println(book.getName());
            }
        }

    }
}