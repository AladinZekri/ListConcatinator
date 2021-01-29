package listConcatenator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Main {
  public static void main(String[] args) {
    List<String> listS = Arrays.asList("foo", "bar");
    List<Integer> listN = Arrays.asList(12, 10);
    System.out.print(concat(listS, listN));
  }

  public static List<String> concat(List<String> l1, List<Integer> l2) {
    List<String> combined = new ArrayList<>();
    List<String> converted = l2.stream().map(String::valueOf).collect(Collectors.toList());
    combined.addAll(l1);
    combined.addAll(converted);
    return combined;
  }

}