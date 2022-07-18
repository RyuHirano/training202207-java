package com.example.training202207java.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;

/** Stream APIのサンプル. */
public class StreamApiSample {

  /** Stream APIの簡単なサンプル. */
  public void streamApiSimpleSample() {
    final List<String> list = new ArrayList<>();
    list.add("first element");
    list.add("second element");

    // Stream APIを使った場合の書き方(8行)
    final String returnValue =
        list.stream()
            .filter(value -> StringUtils.equals(value, "first element"))
            .findFirst()
            .map(value -> "map result: " + value)
            .orElse("見つかりません");

    System.out.println(returnValue); // map result: first element

    // Stream APIを使わない場合の書き方(15行)
    String returnValueNoStreamApi = null;

    for (int i = 0; i < list.size(); i++) {
      if (StringUtils.equals(list.get(i), "first element")) {
        returnValueNoStreamApi = "result: " + list.get(i);
      }

      if (StringUtils.isNotEmpty(returnValueNoStreamApi)) {
        break;
      }
    }

    if (StringUtils.isNotEmpty(returnValueNoStreamApi)) {
      System.out.println(returnValueNoStreamApi);
    }
  }

  /** Stream APIのサンプル. */
  public void streamApiSample() {
    final List<String> list = new ArrayList<>();
    list.add("first element");
    list.add("second element");

    final List<String> resultList =
        list.stream() // Stream の作成
            .filter(value -> StringUtils.equals(value, "first element")) // 中間操作1
            .map(value -> "加工後: " + value) // 中間操作2
            .collect(Collectors.toList()); // 終端操作

    // 終端処理のみ
    resultList.stream().forEach(value -> System.out.println(value)); // 加工後: first element
  }

  /** Stream APIのfindFirstのサンプル. */
  public void streamApiSampleFindFirst() {
    final List<String> list = new ArrayList<>();
    list.add("first element");
    list.add("second element");

    final String result = list.stream().findFirst().orElse(null);

    System.out.println(result); // first elementが出力される
  }

  /** Stream APIのflatMapのサンプル. */
  public void streamApiSampleFlatMap() {
    final List<String> childList = new ArrayList<>();
    childList.add("first element");
    childList.add("second element");

    final List<List<String>> parentList = new ArrayList<>();
    parentList.add(childList);

    final List<String> resultList =
        parentList.stream()
            .flatMap(list -> list.stream())
            .map(value -> "result: " + value)
            .collect(Collectors.toList());

    resultList.forEach(value -> System.out.println(value));
  }

  /** Stream APIのforEachのサンプル. */
  public void streamApiSampleForEach() {
    final List<String> list = new ArrayList<>();
    list.add("first element");
    list.add("second element");

    // first element, second elementが出力される
    list.forEach(value -> System.out.println(value));
  }

  /** Stream APIのanyMatchのサンプル. */
  public void streamApiSampleAnyMatch() {
    final List<String> list = new ArrayList<>();
    list.add("first element");
    list.add("second element");

    final boolean isResult = list.stream().anyMatch(value -> value.contains("element"));

    System.out.println(isResult); // trueが出力される
  }
}
