class solution {
  public static int function1(int a, int b, int c) {
    return a+b*c;
  }
  
  public static int function2(int a, int b, int c) {
    return (a+c)%b;
  }
  
  public static int function3(int a, int b, int c) {
    return b-a*(c/b);
  }
  
  public static int function4(int a, int b, int c) {
    return b+((a*c-b)/(a % c));
  }
}
