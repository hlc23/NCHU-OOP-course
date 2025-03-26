class solution {
    public static int function(int[] nums, int target) {
      int[] r = new int[nums.length];
      
      for (int i=0; i<nums.length; i++) {
    	  r[i] = target - nums[i];
      }
      int ans = 0;
      for (int i=0; i<nums.length; i++) {
    	  for (int j=0; j<nums.length; j++) {
    		  if (i==j) continue;
    		  if (r[i] == nums[j]) ans++;
    	  }
      }
      
      return ans/2;
    }
 }


public class Main {
      public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int target  = sc.nextInt();//第一個數字為target大小
        int length  = sc.nextInt(); //第二個數字為array長度
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
              array[i] = sc.nextInt();
        }
        int ans = solution.function(array,target);
        System.out.print(ans);
        sc.close();
      }
}
  
  