package DS.Arrays;

import java.util.ArrayList;
import java.util.LinkedList;

public class EquilibriumIndex {
  public static void main(String[] args) {
    int[] a = new int[] {-7,1,5,2,-4,3,0};
    System.out.println(equi(a));
  }

  private static int equi(int[] a) {
    if (a == null || a.length <= 0)
      throw new IllegalArgumentException();
    int l = 0, r = 0;
    for (int i = 0; i < a.length; i++) {
      r += a[i];
    }
    for (int i = 0; i < a.length; i++) {
      r -= a[i];
      if (i >= 1) {
        l += a[i-1];
      }
      if (l == r)
        return i;
    }
    return -1;
  }
}
