package emsa.pattern.structural.decorator;

public class PepperDecorator extends PizzaDecorator{

  public PepperDecorator(IPizza pizza) {
    super(pizza);
  }

  @Override
  public String doPizza() {
  
    String type = mPizza.doPizza();
    return type + addPepper();
  }
  
//This is additional functionality
  // It adds pepper to an existing pizza
  private String addPepper() {
      return "+ Pepper";
  }

}
