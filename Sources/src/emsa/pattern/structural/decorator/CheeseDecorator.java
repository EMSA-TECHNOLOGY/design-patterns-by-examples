package emsa.pattern.structural.decorator;

public class CheeseDecorator extends PizzaDecorator{

  public CheeseDecorator(IPizza pizza) {
    super(pizza);
  }

  @Override
  public String doPizza() {
  
    String type = mPizza.doPizza();
    return type + addCheese();
  }
  
//This is additional functionality
  // It adds cheese to an existing pizza
  private String addCheese() {
      return "+ Cheese";
  }

}
