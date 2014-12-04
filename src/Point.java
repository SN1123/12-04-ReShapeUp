import java.lang.Math;
// A Point object represents a pair of (x, y) coordinates.
public class Point {
  private int x;
  private int y;
  public Point(int initX, int initY){
    x = initX;
    y = initY;
  }
  public Point(){
    x = 0;
    y = 0;
  }
  public int getX ()
  {
    return x;
  }
  public int getY ()
  {
    return y;
  }
  public double distanceFromOrigin ()
  {
    return Math.sqrt((x*x)+(y*y));
  }
  public double distance(Point a)
  {
    return Math.sqrt(((a.x - x) * (a.x - x)) + ((a.y - y) * (a.y - y)));
  }
  public String toString ()
  {
    return "(" + x + ", " + y + ")";
  }
  public void setX (int dx)
  {
    x = dx;
  }
  public void setY (int dy)
  {
    y = dy;
  }
  public void translate (int x2, int y2)
  {
    x = x + x2;
    y = y + y2;
  }
}
