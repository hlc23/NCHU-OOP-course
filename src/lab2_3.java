class Solution { 
    public static int function(int a,int b) { 
      int l = (a>b)?a:b;
      int ans = -1;
      for (int i=l; i>=1; i--){
        if (a%i == 0 && b%i == 0){
            ans = i;
            // return i;
        }
      }
    return ans;
    //   return 1;
    }

    public static void main(String[] args) {
        function(20, 5);
    }
  }
  