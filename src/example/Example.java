package example;

import java.util.ArrayList;
import java.util.List;

public class Example {
  public static void example() {
    List<List<String>> biDemArrList = new ArrayList<>();
    for (int i = 0; i < 8; i++) {
      biDemArrList.add(i, new ArrayList<>());
      for (int j = 0; j < 8; j++) {
        biDemArrList.get(i).add(j, ((i + j) % 2 == 1 ? "●" : "◯"));
      }
    }
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        System.out.print(biDemArrList.get(i).get(j) + " ");
      }
      System.out.println();
    }
  }
}
