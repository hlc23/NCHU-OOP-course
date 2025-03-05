class Solution { 
  public static void function(int num) { 
    String s = "*%$";
    for (int i=0; i<num; i++){
        for (int j=0; j<num-i-1; j++){
            System.out.print(" ");
        }
        for (int j=0; j<i*2+1; j++){
            System.out.print(s.charAt(i%3));
        }
        System.out.println();
    }
  }
}
