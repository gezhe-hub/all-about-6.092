public class Book {
  private String title;
  private boolean borrowed;
  public Book(String booktitle) {
    this.title = booktitle;
    this.borrowed = false;
  }
  public void rented() {
    this.borrowed=true;
  }
  public void returned() {
    this.borrowed = false;
  }
  public boolean isborrowed() {
    return this.borrowed;
  }
  public String gettitle() {
    return this.title;
  }
}
