import java.util.*;
abstract class Bicycle {
  int n, m, o;
  Bicycle(int n, int m, int o) {
    this.n = n; this.m = m; this.o = o;
  }
  public String toString() {
    return "No of gears are " + n + " speed of bicycle is " + m + " seat height is " + o;
  }
}
class MountainBike extends Bicycle {
  MountainBike(int n, int m, int o) {
    super(n, m, o);
  }
}
public class BicycleInheritance {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int o = in.nextInt();
    Bicycle b = new MountainBike(n, m, o);
    System.out.println(b);
    in.close();
  }
}