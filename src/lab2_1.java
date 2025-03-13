class solution {
  public static int[] findMaxMinDifference(int a, int b, int c) {
	int max = 0;
	int min = 0;
    if (a >= b && a >= c) {
    	max = a;
    	if (b >= c) {
    		min = c;
    	}
    	else {
    		min = b;
    	}
    }
    else if (b >= a && b >= c) {
    	max = b;
    	if (a >= c) {
    		min = c;
    	}
    	else {
    		min = a;
    	}
    }
    else {
    	max = c;
    	if (a >= b) {
    		min = b;
    	}
    	else {
    		min = a;
    	}
    }
    int difference = max - min;
    
    // return max, min, difference
    return new int[]{max, min, difference};
  }

  public static void main(String[] args) {

	int ans[] = findMaxMinDifference(1, 2, 3);
	System.out.println(ans[0]);
	System.out.println(ans[1]);
	System.out.println(ans[2]);
  }
}



