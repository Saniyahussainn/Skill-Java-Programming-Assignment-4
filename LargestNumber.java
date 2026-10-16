class LargestNumber {
  public static void main(String[] args) {
    int a = 25;
    int b = 40;

    if (a > b) {
      System.out.println(a + " is the largest");
    } else if (b > a) {
      System.out.println(b + " is the largest");
    } else {
      System.out.println("Both numbers are equal");
    }
  }
}