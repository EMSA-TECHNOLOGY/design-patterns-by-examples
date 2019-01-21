package emsa.pattern.structural.decorator;

public abstract class PizzaDecorator implements IPizza {
  // Reference to component object
  protected IPizza mPizza;

  // We initialize a Decorator with existing pizza we need decorate
  public PizzaDecorator(IPizza pizza) {
    mPizza = pizza;
  }

  public IPizza getPizza() {
    return mPizza;
  }

  public void setPizza(IPizza mPizza) {
    this.mPizza = mPizza;
  }
}
