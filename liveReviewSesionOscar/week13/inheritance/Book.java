package week13.inheritance;

public class Book {

    public Book(String title, String type, String author, double price) {
        this.price = price;
    }

    public Book(){}
    public Book(){}

    public void buy(){
        System.out.println("Buy this product");
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}




}
/*
3. Book Task:
    3.1. create a class named Book:
            variables:
                title, type, author, price

            Methods:
                setInfo()
                toString()

    3.2 Create a sub class of Book named EBook:
            variables:
                title, type, author, price, size, pages

            Methods:
                setInfo()
                readBook()
                toString()

    3.3 Create a sub class of Book named AudioBook:
            variables:
                title, type, author, price, length, narrator

            Methods:
                setInfo()
                listen()
                toString()
 */