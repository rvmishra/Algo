package DS.Arrays;

import org.apache.commons.lang3.ArrayUtils;

/*
  https://www.geeksforgeeks.org/find-a-tour-that-visits-all-stations/
  Find the first circular tour that visits all petrol pumps
*/

public class CircularTour {
  private static final int NOT_FOUND = -1;


  static class PetrolPump {
    int petrol;
    int distance;

    PetrolPump(int petrol, int distance) {
      this.petrol = petrol;
      this.distance = distance;
    }
  }

  private int tour(PetrolPump[] a) {
    if (ArrayUtils.isEmpty(a))
      return NOT_FOUND;
    int start = 0, end = 0, sumP = 0, sumD = 0;
    while (start < a.length) {
      sumP += a[end].petrol;
      sumD += a[end].distance;
      if (sumD > sumP) {
        start = end + 1;
        end = start;
        sumD = 0;
        sumP = 0;
      } else {
        end = (++end) % a.length;
        if (start == end)
          return start;
      }
    }
    return NOT_FOUND;
  }

  public static void main(String[] args) {
    PetrolPump[] a = {new PetrolPump(4, 6), new PetrolPump(3, 6), new PetrolPump(4, 4), new PetrolPump(4, 6), new PetrolPump(100, 10)};
    System.out.println(new CircularTour().tour(a));
  }
}
