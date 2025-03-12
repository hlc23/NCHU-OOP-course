class Solution {
    public static int function(int num) {
        int r = 1;
        if (num == 2)
            return 1;
        if (num == 3)
            return 2;
        while (num > 4) {
            r *= 3;
            num -= 3;
        }
        r *= num;
        return r;
    }
}
