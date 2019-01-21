package emsa.pattern.structural.composite;

public class TestCompositePattern {

  /** Client */
  public static void main(String[] args) {
    // Initialize ellipses
    Ellipse ellipse1 = new Ellipse();
    Ellipse ellipse2 = new Ellipse();

    // Initialize circle
    Circle circle = new Circle();

    // Initialize three composite graphics
    CompositeGraphic graphic = new CompositeGraphic();
    CompositeGraphic graphic1 = new CompositeGraphic();
    CompositeGraphic graphic2 = new CompositeGraphic();

    // Composes the graphics
    graphic1.add(ellipse1);
    graphic1.add(ellipse2);
    graphic1.add(graphic2);

    graphic.add(graphic1);
    graphic.add(circle);

    graphic.print();
    graphic.draw("red");
  }
}
