package emsa.pattern.structural.composite;

/** "Leaf" */
public class Ellipse implements Graphic {

  // Prints the graphic.
  public void print() {
    System.out.println("Ellipse");
  }

  @Override
  public void draw(String fillColor) {
    System.out.println("Drawing Ellipse with color " + fillColor);
  }
}