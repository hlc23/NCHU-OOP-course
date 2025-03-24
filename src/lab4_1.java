class Solution { 
  public static int checkPowersOfThree(int n) { 
	  int r = 0, c = 0;
	  while (n > 0) {
		  if (n % 3 == 2) {
			  return -1;
		  }
		  if (n%3 == 1) {
			  r += c;
		  }
		  n /= 3;
		  c++;
	  }
	  return r;
  }
}
