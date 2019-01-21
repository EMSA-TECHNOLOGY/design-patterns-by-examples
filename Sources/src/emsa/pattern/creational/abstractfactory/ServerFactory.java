package emsa.pattern.creational.abstractfactory;

public class ServerFactory implements ComputerAbstractFactory {

  private String ram;
  private String ssd;

  public ServerFactory(String ram, String ssd) {
    // TODO Auto-generated constructor stub
    this.ram = ram;
    this.ssd = ssd;
  }

  @Override
  public Computer createComputer() {
    // TODO Auto-generated method stub
    return new Server(ram, ssd);
  }
}
