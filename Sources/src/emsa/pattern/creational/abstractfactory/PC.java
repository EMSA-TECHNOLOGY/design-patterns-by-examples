package emsa.pattern.creational.abstractfactory;

public class PC extends Computer {

  private String ram;
  private String ssd;

  public PC(String ram, String ssd) {

    this.ram = ram;
    this.ssd = ssd;
    // TODO Auto-generated constructor stub
  }

  @Override
  public String getRAM() {
    // TODO Auto-generated method stub
    return this.ram;
  }

  @Override
  public String getSSD() {
    // TODO Auto-generated method stub
    return this.ssd;
  }

}
