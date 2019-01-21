package emsa.pattern.creational.factorymethod;

public class ComputerFactory {
  public static Computer getComputer(ComputerType type, String ram, String ssd) {

    Computer com = null;
    switch (type) {
    case LAPTOP:
      com =  new Laptop(ram, ssd);
      break;
    case SERVER:
      com =  new Server(ram, ssd);
      break;

    default:
      throw new IllegalArgumentException("This type is unsupported");
    }
    
    return com;
  }
}
