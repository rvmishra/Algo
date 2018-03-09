package DS.DP;

// https://www.geeksforgeeks.org/dynamic-programming-subset-sum-problem/
// Examples: set[] = {3, 34, 4, 12, 5, 2}, sum = 9
// Output:  True  //There is a subset (4, 5) with sum 9.


import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class SubsetSUm {
  public static void run() {
    int[] a =
      new int[] {3, 34, 4, 12, 5, 2, 3, 34, 4, 12, 5, 2, 3, 34, 4, 12, 5, 2, 3, 34, 4, 12, 5, 2, 3, 34, 4, 12, 5, 2, 3, 34, 4, 12, 5, 2, 3, 34, 4, 12, 5, 2, 3, 34, 4, 12, 5, 2, 3, 34, 4, 12, 5, 2, 3, 34, 4, 12, 5, 2, 3, 34, 4, 12, 5, 2, 3, 34, 4, 12, 5, 2, 3, 34, 4, 12, 5, 2, 3, 34, 4, 12, 5, 2, 3, 34, 4, 12, 5, 2, 3, 34, 4, 12, 5, 2};
    int sum = 3777;
    Map<String, Boolean> cache = new HashMap<>();
    Map<String, Integer> stats = new HashMap<>();
    boolean result = isSubsetSum(a, sum, 0, a.length - 1, cache, stats);
    System.out.println(result);
    System.out.println(new Gson().toJson(cache));
    System.out.println(new Gson().toJson(stats));
  }

  private static boolean isSubsetSum(int[] a, int sum, int low, int high, Map<String, Boolean> cache, Map<String, Integer> stats) {
    if (a == null || a.length <= 0)
      throw new IllegalArgumentException();
    String key = String.valueOf(sum) + "_" + String.valueOf(low) + "_" + String.valueOf(high);
    if (cache.containsKey(key)) {
      stats.put(key, stats.get(key) + 1);
      return cache.get(key);
    }
    if (low > high)
      return false;
    if (sum == 0)
      return true;
    if (sum < 0)
      return false;
    boolean result = isSubsetSum(a, sum, low + 1, high, cache, stats) || isSubsetSum(a, sum - a[low], low + 1, high, cache, stats);
    cache.put(key, result);
    if (!stats.containsKey(key))
      stats.put(key, 0);
    stats.put(key, stats.get(key) + 1);
    return result;
  }
}
