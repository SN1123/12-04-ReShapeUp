// A Line object represents a line defined by a pair of Points
public class Line {
  private Point start ;
  private Point end ;
  
  public Line ()
  {
    start = new Point();
    end = new Point();
  }
  public Line (Point p1, Point p2)
  {
    start = p1;
    end = p2;
  }
  public double length ()
  {
    return start.distance(end);
  }
  public double slope ()
  {
    int changeY = start.getY() - end.getY();
    int changeX = start.getX() - end.getX();
    return changeY / changeX;
  }
  public String toString ()
  {
    return "[" + start.toString() + ", " + end.toString() + "]";
  }
  public void translate (int dx, int dy)
  {
    start.translate(dx, dy);
    end.translate(dx, dy);
  }
} 
