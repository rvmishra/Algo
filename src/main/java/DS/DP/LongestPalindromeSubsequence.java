package DS.DP;

import com.google.gson.Gson;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindromeSubsequence {
  public static void main(String[] args) {
    String s = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
    Map<String, Integer> cache = new HashMap<>();
    System.out.println(palin(s, 0, s.length() - 1, cache));
    System.out.println(new Gson().toJson(cache.size()));
  }

  private static int palin(String s, int l, int r, Map<String, Integer> cache) {
    if (StringUtils.isBlank(s) || l > r)
      return 0;
    if (l == r)
      return 1;
    String key = l + "_" + r;
    int result;
    if (cache.containsKey(key))
      return cache.get(key);
    if (s.charAt(l) == s.charAt(r)) {
      result = 2 + palin(s, l + 1, r - 1, cache);
    } else {
      result = Math.max(palin(s, l + 1, r, cache), palin(s, l, r - 1, cache));
    }
    cache.put(key, result);
    return result;
  }
}
