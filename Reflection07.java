package Square;
import java.lang.reflect.Field;

public class Reflection07 {
  public static void main(String[] args) throws Exception{
    Square s = new Square(15,15);
    Field[] fields = s.getClass().getDeclaredFields();
    System.out.printf("There are %d fields\n", fields.length);
    
    for (Field f : fields) {
      f.setAccessible(true);
      System.out.printf("field name=%s type=%s value=%d\n", f.getName(),
        f.getType(), f.getShort(s));
    }
    
  }

}
