package com.example.training202207java.javatype.wapperclass;

import java.util.Objects;

/** ラッパークラス. */
public class WrapperClass {

  /** Integerのサンプル. */
  public void setInteger() {
    final Integer number = Integer.valueOf(1);

    System.out.println(number); // 1がコンソールに出力される
  }

  /** Integerの比較. */
  public void compareInteger() {
    final Integer number1 = Integer.valueOf(1000);
    final Integer number2 = Integer.valueOf(1000);

    // 以下の比較結果は何になるでしょうか？
    System.out.println(number1 == number2);
  }

  /** Integerの正しい比較. */
  public void compareIntegerCorrectly() {
    final Integer number1 = Integer.valueOf(1000);
    final Integer number2 = Integer.valueOf(1000);

    System.out.println(number1.equals(number2)); // trueがコンソールに出力される
  }

  /** Integerの比較でNullPointExceptionが発生. */
  public void compareIntegerNullPointerException() {
    final Integer number1 = null;
    final Integer number2 = Integer.valueOf(1000);

//    System.out.println(number1.equals(number2)); // NullPointerExceptionが発生する
  }

  /** Integerの一般的な比較. */
  public void compareIntegerGenerally() {
    final Integer number1 = null;
    final Integer number2 = Integer.valueOf(1000);

    System.out.println(Objects.equals(number1, number2)); // falseがコンソールに出力される
  }

  /** Integer.valueOf(int)を実行. */
  public void valueOfInt() {
    final Integer number = Integer.valueOf(1);

    System.out.println(number); // 1がコンソールに出力される
  }

  /** Integer.valueOf(String)を実行. */
  public void valueOfString() {
    final Integer number = Integer.valueOf("1");

    System.out.println(number); // 1がコンソールに出力される
  }

  /** Integer.parseInt(String)を実行. */
  public void parseInt() {
    final Integer number = Integer.parseInt("1");

    System.out.println(number); // 1がコンソールに出力される
  }
}
