public class StringFive {
  // aabbbccdddde = 2a3b2c4d1e
  public static void main(String[] args) {
    String s = "aabbbccdddde";
    char[] c = s.toCharArray();
    int x = 0;
    while (x < c.length) {
      int y= x+1;
      int count = 1;
      while( y < c.length && c[x] == c[y]) {
        count++;
        y++;
      }
      System.out.print(count);
      System.out.println(c[x]);
      x=y;
    }

  }

}
