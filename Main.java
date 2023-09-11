public class Main {
    public static void main(String[] args) {

        ScientificBook re1=new ScientificBook(" Bag","dfs",250,2550,"Atamure");
        ScientificBook re2=new ScientificBook(" Natural rio","fdssd",651,2656,"Rifddaf");
        ScientificBook re3=new ScientificBook(" DSFDFSDS","dfs",250,2550,"Atamure");
        ScientificBook re4=new ScientificBook(" FSDSDF","dfs",250,2550,"Atamure");
        ScientificBook re5=new ScientificBook(" FDSCXFGH","dfs",250,2550,"Atamure");

        LiteratureBook le1=new LiteratureBook("SFDFDSSFD","fdsdf",454,"Adam Smith",1874);
        LiteratureBook le2=new LiteratureBook("FDSDSFGTOF","fdsdf",454,"Adam Smith",1874);
        LiteratureBook le3=new LiteratureBook("FDSTHGGTRRTG","fdsdf",454,"Adam Smith",1874);
        LiteratureBook le4=new LiteratureBook("HYTHGB","fdsdf",454,"Adam Smith",1874);
        LiteratureBook le5=new LiteratureBook("HRYYRGT","fdsdf",454,"Adam Smith",1874);


        Book[] books=new Book[0];
        Library library=new Library("Kitaphana","Kyzylorda","Kazakhstan",books);
        library.addBook(re1);
        library.addBook(re2);
        library.addBook(re3);
        library.addBook(re4);
        library.addBook(re5);
        library.addBook(le1);
        library.addBook(le2);
        library.addBook(le3);
        library.addBook(le4);
        library.addBook(le5);
        library.printLibraryData();
    }

}

class Book {
    private String name;
    private String code;
    private int pages;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    Book(){
    }
    Book(String name,String code,int pages){
        this.code=code;
        this.name=name;
        this.pages=pages;
    }
    String getBookData(){
        return "Name is "+name+" codes "+code+" "+ pages+" pages" ;
    }
}
class ScientificBook extends Book{
    private int price;
    private String publisher;
    public ScientificBook() {
    }

    public ScientificBook(String name, String code, int pages,int price,String publisher) {
        super(name, code, pages);
        this.publisher=publisher;
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    String getBookData() {
        return super.getBookData()+" price is "+price+ " publisher is "+publisher;
    }
}
class LiteratureBook extends Book{
    private String author;
    private int publishedYear;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public LiteratureBook() {

    }

    public LiteratureBook(String name, String code, int pages, String author, int publishedYear) {
        super(name, code, pages);
        this.author = author;
        this.publishedYear = publishedYear;
    }

    @Override
    String getBookData() {
        return super.getBookData()+" author is "+author+" year "+publishedYear;
    }
}
class Library{
    private String name;
    private String city;
    private String country;
    private Book[] books;
    private int sizeOfBooks;

    public Library(String name, String city, String country, Book[] books) {
        this.name = name;
        this.city = city;
        this.country = country;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    void addBook(Book b){

        if (books.length == 0) {
            books = new Book[1];
            books[0] = b;
            sizeOfBooks = 1;
        } else {
            sizeOfBooks+=1;
            Book[] last = books;
            books = new Book[books.length + 1];
            books[books.length - 1] = b;
            for (int i = 0; i < books.length - 1; i++) {
                books[i] = last[i];
            }
        }

    }
    void printLibraryData(){
        System.out.println("name is "+name+" City is "+city+" Country is "+country+" Size of book "+sizeOfBooks);
        System.out.println();
        if (sizeOfBooks != 0)
            for (Book book : books) {
                System.out.println(book.getBookData());
                System.out.println();
            }

    }
}
