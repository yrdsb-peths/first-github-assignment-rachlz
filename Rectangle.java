public class Rectangle
{
  // class name should be capitalized!
  private int length; 
  private int width; 
  
  public Rectangle(int len, int wid)
  {
     length = len; 
     width = wid; 
  }
  public int getArea()
  {
    return length*width; 
  }
}
