class main {
  public static int lengthOfLIS(int[] nums) {
	  final int l = nums.length;
	  int[] arr = new int[l];
	  for (int i=0; i<l; i++) {
		  arr[i] = 1;
	  }
	  for (int i=0; i<l; i++) {
		  for (int j=0; j<=i; j++) {
			  if (nums[j] < nums[i]) {
				  arr[i] = Math.max(arr[i], arr[j]+1);
			  }
		  }
	  }
	  int ans = -1;
	  for (int i=0; i<l; i++) {
		  ans = Math.max(ans, arr[i]);
	  }
	  return ans;
  }	

  public static void main(String[] args) {
	  int[] arr = {7,7 ,7, 7, 7,7 };
	  int r = lengthOfLIS(arr);
 	  System.out.println(r);
  }
}

