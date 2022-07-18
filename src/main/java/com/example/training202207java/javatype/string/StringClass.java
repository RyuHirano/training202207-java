package com.example.training202207java.javatype.string;

import org.apache.commons.lang3.StringUtils;

/** Stringクラスのプログラム. */
public class StringClass {

  /** Stringを変更する. */
  public void changeString() {
    String message = "こんにちは";
    message = "こんばんは";

    System.out.println(message); // "こんばんは"がコンソールに出力される
  }

  /** Stringを変更する(詳細). */
  public void changeStringDetail() {
    // messageに"こんにちは"の参照が代入されている
    String message = "こんにちは";

    // messageに"こんばんは"の参照が代入されている
    message = "こんばんは";

    // messageの参照先で保存している"こんばんは"が出力される
    System.out.println(message);
  }

  /** Stringを比較する. */
  public void compareString() {
    final String value1 = new String("value");
    final String value2 = new String("value");

    System.out.println(value1.equals(value2)); // trueがコンソールに出力される
  }

  /** 文字列を結合する. */
  public void concatString() {
    // +を使った文字列連結
    String value1 = "1";
    value1 = value1 + "2";
    value1 = value1 + "3";

    // "123" がコンソールに出力される
    System.out.println(value1);

    // StringBuilderを使った文字列連結
    final StringBuilder builder = new StringBuilder();
    builder.append("1");
    builder.append("2");
    builder.append("3");

    // "123"がコンソールに出力される
    System.out.println(builder.toString());
  }

  /** StringUtilsでStringを比較する. */
  public void useStringUtilsEquals() {
    final String value1 = new String("value");
    final String value2 = new String("value");

    // trueがコンソールに出力される
    System.out.println(StringUtils.equals(value1, value2));
  }

  /** StringUtilsでStringを比較する. */
  public void useStringUtilsCompare() {
    final String value = null;

    // StringUtilsを使うと簡単にかけます！
    // if (value == null || value == "") {
    if (StringUtils.isEmpty(value)) {
      System.out.println("valueはnull or 空文字です");
    }
  }

  static class SampleClass {}
}
