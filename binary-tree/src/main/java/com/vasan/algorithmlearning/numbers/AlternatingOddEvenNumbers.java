package com.vasan.algorithmlearning.numbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AlternatingOddEvenNumbers {
  private static String COMMA = ", ";
  private int[] ints;

  private AlternatingOddEvenNumbers(int[] ints) {
    this.ints = ints;
  }

  public static void main(String[] args) {
    int[] evenFirst = {1, 3, 2, 5, 4, 7, 10};
    new AlternatingOddEvenNumbers(evenFirst).alternate();
    int[] oddFirst = {9, 8, 13, 2, 19, 14};
    new AlternatingOddEvenNumbers(oddFirst).alternate();
  }

  private void alternate() {
    List<Integer> intList = Arrays.stream(ints).boxed().collect(Collectors.toList());
    System.out.println("Input : " + intList);
    List<Integer> evenList = intList.stream().filter(integer -> integer % 2 == 0).sorted().collect(Collectors.toList());
    List<Integer> oddList = intList.stream().filter(integer -> integer % 2 != 0).sorted().collect(Collectors.toList());
    if (evenList.size() > 0 && oddList.size() > 0 && evenList.stream().findFirst().get() < oddList.stream().findFirst().get()) {
      alternate(evenList, oddList);
    } else {
      alternate(oddList, evenList);
    }
  }

  private void alternate(List<Integer> first, List<Integer> second) {

    int i = first.size() > second.size() ? first.size() : second.size();
    StringBuilder s = new StringBuilder();
    s.append("Output: [");
    for (int j = 0; j < i; j++) {
      s.append(first.get(j)).append(COMMA);
      if (second.size() > j)
        s.append(second.get(j)).append(COMMA);
    }
    System.out.println(s.substring(0, s.length() - 2) + "]");

  }
}
