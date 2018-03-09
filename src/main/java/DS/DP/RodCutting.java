package DS.DP;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

// https://www.geeksforgeeks.org/dynamic-programming-set-13-cutting-a-rod/


public class RodCutting {
  public static void run() {
    int[] p = new int[] {3, 5, 8, 9, 10, 17, 17, 20};
    int l = 8;
    Map<String, Integer> cache = new HashMap<>();
    System.out.println(rod(l, p, p.length, cache));
    System.out.println(new Gson().toJson(cache));
  }

  private static int rod(int l, int[] p, int n, Map<String, Integer> cache) {
    if (l == 0 || n == 0)
      return 0;
    if (n > l)
      n = l;
    String key = String.valueOf(l) + "_" + String.valueOf(n);
    if (cache.containsKey(key))
      return cache.get(key);
    int result = Math.max((p[n - 1] + rod(l - n, p, n, cache)), (rod(l, p, n - 1, cache)));
    cache.put(key, result);
    return result;
  }
}
