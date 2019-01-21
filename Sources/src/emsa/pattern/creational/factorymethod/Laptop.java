package emsa.pattern.creational.factorymethod;

public class Laptop extends Computer {

  private String ram;
  private String ssd;

  public Laptop(String ram, String ssd) {

    this.ram = ram;
    this.ssd = ssd;
  }

  @Override
  public String getRAM() {
    return this.ram;
  }

  @Override
  public String getSSD() {
    return this.ssd;
  }
}
