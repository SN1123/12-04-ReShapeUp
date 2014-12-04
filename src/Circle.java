// A Circle object represents a circle defined by a center point and a radius.
public class Circle {
  private Point CenterPoint;
  private double radius;
  public Circle (Point initCenterPoint, int initradius)
  {
    CenterPoint = initCenterPoint;
    radius = initradius;
  }
  public Circle ()
  {
    Point start = new Point();
    Point end = new Point();
  }
  public Circle (Point startPoint, Point endPoint)
  {
    Point start = startPoint;
    Point end = endPoint;
  }
  public double getRadius ()
  {
    return radius;
  }
  public double area ()
  {
    return (3.14)*(radius*radius);
  }
  public double circumference ()
  {
    return (3.14)*(radius*2);
  }
  public double diameter ()
  {
    return radius*2;
  }
  public String toString ()
  {
    return "[" + CenterPoint + ", " + radius + "]";
  }
  public void translate (int x2, int y2)
  {
    CenterPoint.translate(x2, y2);
  }
  public void changeRadius (double changerOfRadius)
  {
    radius += changerOfRadius;
  }
}
