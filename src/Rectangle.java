// A Rectangle object represents a rectangle defined by an origin point (bottom left corner), plus width and height.
public class Rectangle {
  private Point Origin;
  private int Width;
  private int Height;
  private Point topRight;
  
  public Rectangle (Point p1, Point p2)
  {
    topRight = p1;
    Origin = p2;
    Width = 0;
    Height = 0;
  }
  public Rectangle (Point p, int w, int h)
  {
    Origin = p;
    w = Width;
    h = Height;
    topRight.setX(Origin.getX() + Width);
    topRight.setY(Origin.getY() + Height);
  }
  public Point getBottomLeft ()
  {
    return Origin;
  }
  public Point getTopRight ()
  {
    return topRight;
  }
  public int getHeight()
  {
    return Height;
  }
  public int getWidth ()
  {
    return Width;
  }
  public double area ()
  {
    return Height*Width;
  }
  public double diagonal ()
  {
    return Math.sqrt(Height + Width);
  }
  public int perimeter ()
  {
    return Width + Width + Height + Height;
  }
  public boolean isSquare ()
  {
    if (Height == Width)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  public String toString ()
  {
    return "[" + Origin + ", " + topRight + "]";
  }
  public void translate (int x2, int y2)
  {
    Origin.translate(x2,y2);
  }
  public void scale (int dx, int dy)
  {
    Width += dx;
    Height += dy;
    topRight.setX(topRight.getX() + dx);
    topRight.setY(topRight.getY() + dy);
  }
}
