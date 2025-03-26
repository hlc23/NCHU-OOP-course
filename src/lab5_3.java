public class main {
	public static void main(String[] args) {
		int[] arr = {1, 0, 1, 0, 1, 0};
		int k = 2;
		System.out.println(solution.function(arr, k));
	}
}

class solution {
	  public static int function(int[] colors, int k) {
		  int[] arr = new int[colors.length*2];
		  for (int i=0; i<arr.length; i++) {
			  arr[i] = colors[i%(colors.length)];
//			  System.out.print(arr[i]+" ");
		  }

//		  System.out.println();

		  int ans = 0;
		  for (int i=0; i<colors.length; i++) {
//			  System.out.println("on index "+i);
			  int target = arr[i];
			  boolean flag = true;
			  for (int j=i; j<i+k; j++) {
				  if (arr[j] != target) {
//					  System.out.println("break on "+j);
//					  System.out.println("arr["+j+"] != "+target);
					  flag = false;
					  break;
				  }
				  if (target == 0) target = 1;
				  else target = 0;
			  }
			  if (flag) ans += 1;
		  }
		  return ans;
	  }
}

