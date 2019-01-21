package emsa.pattern.creational.factorymethod;

public class TestPattern {

  public static void main(String[] args) {
    testFactory();
  }

  private static void testFactory() {
    Computer laptop = ComputerFactory.getComputer(ComputerType.LAPTOP, "2 GB", "500 GB");
    Computer server = ComputerFactory.getComputer(ComputerType.SERVER, "16 GB", "1 TB");
    System.out.println("Factory Laptop Config::" + laptop);
    System.out.println("Factory Server Config::" + server);
  }
}
