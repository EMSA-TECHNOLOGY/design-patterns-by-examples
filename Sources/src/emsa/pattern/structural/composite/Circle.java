package emsa.pattern.structural.composite;

/** "Leaf" */
public class Circle implements Graphic {

  // Prints the graphic.
  public void print() {
    System.out.println("Circle");
  }

  @Override
  public void draw(String fillColor) {
    System.out.println("Drawing Circle with color " + fillColor);
  }
}
