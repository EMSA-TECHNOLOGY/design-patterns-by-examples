package emsa.pattern.behavioral.templatemethod;

public class TestTemplateMethodPattern {

  public static void main(String[] args) {

    HouseTemplate houseType = new WoodenHouse();
    houseType.buildHouse();
    System.out.println("************");
    
    houseType = new GlassHouse();
    houseType.buildHouse();
  }

}
