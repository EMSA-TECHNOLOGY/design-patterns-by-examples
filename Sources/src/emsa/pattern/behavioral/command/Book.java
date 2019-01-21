package emsa.pattern.behavioral.command;

public class Book implements ItemElement {

  private int price;
  private String isbnNumber;

  public Book(int price, String isbn) {
    this.price = price;
    this.isbnNumber = isbn;
  }

  @Override
  public int accept(ShoppingCartVisitor visitor) {
    return visitor.visit(this);
  }

  public int getPrice() {
    return price;
  }

  public String getIsbnNumber() {
    return isbnNumber;
  }
}
