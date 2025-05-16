public class solution {
  public static int[] function(int num) {
	  int[] ans = new int[num+1];
	  for (int i=0; i<=num; i++) {
		  int t = i;
		  while (t > 0) {
			  ans[i] += (t & 1);
			  t >>= 1;
		  }
	  }
	  return ans;
  }
}
//main函式(不要把註解拿掉)

/*
public class Main {
    public static void main(String[] args) {
     java.util.Scanner sc = new java.util.Scanner(System.in);
      int num = sc.nextInt();
      int list[] = new int[num];
      list = solution.function(num);
      sc.close();
    }
}
*/ {
    
}
