public class Library {
  private String address;
  private Book[] books;
  private int numbooks;
  public Library(String libraryaddress) {
    this.address = libraryaddress;
    this.books = new Book[100];
    this.numbooks = 0;
  }
  public void addbook(Book book) {
    this.books[numbooks] = book;
    numbooks++;
  }
  public static void printopeninghours() {
    System.out.println("Libraries are open daily from 9am to 5pm.");
  }
  public void printaddress() {
    System.out.println(this.address);
  }
  public void borrowbook(String title) {
    for(int i=0; i<numbooks; i++) {
      if(books[i].gettitle().equals(title)) {
        if(books[i].isborrowed()) {
          System.out.println("sorry, this book is already borrowed.");
          return;
        }else {
          books[i].rented();
          System.out.println("You successfully borrowed" + title);
          return;
        }
      }
    }
    System.out.println("Sorry, this book is not in our catalog.");  
  }
  public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addbook(new Book("The Da Vinci Code"));
        firstLibrary.addbook(new Book("Le Petit Prince"));
        firstLibrary.addbook(new Book("A Tale of Two Cities"));
        firstLibrary.addbook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printopeninghours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printaddress();
        secondLibrary.printaddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowbook("The Lord of the Rings");
        firstLibrary.borrowbook("The Lord of the Rings");
        secondLibrary.borrowbook("The Lord of the Rings");
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnbook("The Lord of the Rings");
        System.out.println();

    }
}
