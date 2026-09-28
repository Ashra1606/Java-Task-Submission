public class Book {
    private String title;
    private  String author;

    public Book(String title)
    {
        this.title=title;
    }
    public Book(String title,String author)
    {
        this.title=title;
        this.author=author;
    }
    public void displayinfo()
    {
        System.out.println("Title: "+title);
    }
}
class Library{
    static void main(String[] args) {
        Book book1=new Book("1984");
        Book book2=new Book("To Kill a Mockingbird", "Harper Lee");
        book1.displayinfo();
        book2.displayinfo();
    }
}