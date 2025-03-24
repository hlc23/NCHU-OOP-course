import java.util.HashSet;
import java.util.Set;

class solution{
    public static Set<String> function(int num) {
        Set<String> result = new HashSet<>();
        sol(result, 0, 0, "", num);
        return result;
    }

    public static void sol(Set<String> res, int left, int right, String s, int n) {
        if (s.length() == n * 2) {
            res.add(s);
            return;
        }

        if (left < n) {
            sol(res, left + 1, right, s + "(", n);
        }

        if (right < left) {
            sol(res, left, right + 1, s + ")", n);
        }
    }
}