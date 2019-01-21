package emsa.pattern.creational.abstractfactory;

public abstract class Computer {
  public abstract String getRAM();

  public abstract String getSSD();

  @Override
  public String toString() {
    return "RAM= " + this.getRAM() + ", SSD=" + this.getSSD();
  }
}
