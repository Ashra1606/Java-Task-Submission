public  class librarySystem {
    String name;
    static  int bookIssued=0;
    public librarySystem(String bookname)
    {
        this.name=bookname;
        bookIssued++;
    }
}

void main() {
    librarySystem book1=new librarySystem("xyz");
    librarySystem book2=new librarySystem("xyz");
    System.out.println(book1.name);
    System.out.println(book2.name);
    System.out.println(librarySystem.bookIssued);
}



