package emsa.pattern.behavioral.command;

public interface ItemElement {
  public int accept(ShoppingCartVisitor visitor);
}
