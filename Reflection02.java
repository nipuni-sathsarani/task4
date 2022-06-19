package Square;

public class Reflection02 {
  public static void main(String[] args) {
    Square s = new Square(5,5);
    s.setLength(15);
    
    short l = s.l;
    
    System.out.println("s=" + s);
  }
}
