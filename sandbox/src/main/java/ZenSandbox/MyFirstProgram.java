package ZenSandbox;

public class MyFirstProgram {

  public static void main(String[] args) {

    Point p1 = new Point(4, 9);
    Point p2 = new Point(16,25);
    p1.x = 4;
    p1.y = 9;
    p2.x = 16;
    p2.y = 25;
    System.out.println ("Расстояние между точками с координатами: " + p1.x + ";" + p1.y + " и " + p2.x + ";" + p2.y + " = " + distance(p1, p2));
  }

  public static double distance (Point p1, Point p2) {
    return Math.sqrt(((p1.x-p2.x)*(p1.x-p2.x))+((p1.y-p2.y)*(p1.y-p2.y)));
  }
}
