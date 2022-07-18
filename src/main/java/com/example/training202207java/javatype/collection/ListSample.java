package com.example.training202207java.javatype.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;

/** Listインターフェースのサンプル. */
public class ListSample {

  /** ArrayListの初期化. */
  public void initializeArrayList() {
    // ArrayListをnewしてListインターフェースで受けるのが一般的。
    // ArrayListで受けても間違いではないですが。。
    final List<String> list = new ArrayList<>();
  }

  /** ArrayListの初期化(初期要素あり). */
  public void initializeArrayListWithElements() {
    final List<String> list =
        new ArrayList<>() {
          {
            add("first element");
            add("second element");
          }
        };
  }

  /** ArrayListの初期化(既存配列から作成). */
  public void initializeArrayListFromExistedArray() {
    // Java 1.6時点では既にあった、値にnull可、リストの追加・削除不可、修正可
    final List<String> list = Arrays.asList("first", "second");
    final List<String> listWithNull = Arrays.asList(null, "second");

    // Java 9以降、値にnull不可、リストの追加・削除・修正不可
    final List<String> immutableList = List.of("first", "second");
  }

  /** ArrayList get のサンプル. */
  public void getSample() {
    final List<String> list = new ArrayList<>();
    list.add("first element");
    list.add("second element");

    // インデックスが0の"first element"がコンソールに出力される
    System.out.println(list.get(0));
  }

  /** ArrayList isEmpty のサンプル. */
  public void isEmptySample() {
    final List<String> list = new ArrayList<>();

    System.out.println(list.isEmpty()); // trueがコンソールに出力される

    list.add("element");

    System.out.println(list.size()); // 1がコンソールに出力される
    System.out.println(list.isEmpty()); // falseがコンソールに出力される
  }

  /** CollectionUtils のサンプル. */
  public void collectionUtilsSample() {
    final List<String> list = new ArrayList<>();
    list.add("element");

    // 以下を簡単に書ける
    // if (list == null || list.isEmpty()) {
    if (CollectionUtils.isEmpty(list)) {
      System.out.println("listはempty");
    }

    // 以下を簡単に書ける
    // if (list != null && !list.isEmpty()) {
    if (CollectionUtils.isNotEmpty(list)) {
      System.out.println("listはemptyではない"); // こちらが実行される
    }
  }
}
