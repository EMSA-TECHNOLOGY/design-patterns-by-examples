package emsa.pattern.creational.singleton;

public class TestPattern {

  public static void main(String[] args) {
    testSingleton();
  }

  private static void testSingleton() {
    ThreadSafeSingleton instanceOne = ThreadSafeSingleton.getInstance();
    ThreadSafeSingleton instanceTwo = ThreadSafeSingleton.getInstance();
    
    System.out.println("instanceOne hashCode="+instanceOne.hashCode());
    System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());
    
  }
}
