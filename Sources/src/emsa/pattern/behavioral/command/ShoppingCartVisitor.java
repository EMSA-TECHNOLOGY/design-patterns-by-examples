package emsa.pattern.behavioral.command;

public interface ShoppingCartVisitor {
  int visit(Book book);
  int visit(Fruit fruit);
}
