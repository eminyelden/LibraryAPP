public class Main {
    public static void main(String[] args) {

        Book book1 = new Book(1,"Araba Sevdasi", "Recaizade Mahmut", 365 );
        Book book2 = new Book(2,"Suc ve Ceza", "Dostoyevski", 522 );

        Person person1= new Person(1,"Emin Yelden",24);
        Person person2= new Person(2,"Dogukan Ovunc",24);

        Book[] books = {book1,book2};
        Person[] persons = {person1,person2};

        for (Book book : books) {
            // System.out.println(book);
        }

        for (Person person : persons) {
            // System.out.println(person);
        }

        BookManager bookManager = new BookManager();
        bookManager.bookTaken(book2,person1);

    }



}