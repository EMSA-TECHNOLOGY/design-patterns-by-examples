package emsa.pattern.creational.abstractfactory;

public class TestPattern {

  public static void main(String[] args) {
    testAbstractFactory();
  }

  private static void testAbstractFactory() {
    Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB"));
    Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB"));
    System.out.println("AbstractFactory PC Config::" + pc);
    System.out.println("AbstractFactory Server Config::" + server);
  }
}
