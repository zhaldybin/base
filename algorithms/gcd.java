public class gcd {
  private static int calculate_gcd(int a, int b) {
    if (b == 0)
      return a;
    else {
      return calculate_gcd(b, a%b);
    }
  }
  public static void main(String[] args) {
    int x = 100;
    int y = 24;
    int divisor = calculate_gcd(x, y);
    System.out.println(divisor);
  }
}
