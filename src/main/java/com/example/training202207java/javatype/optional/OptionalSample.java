package com.example.training202207java.javatype.optional;

import java.util.Optional;

/** Optionalのサンプル. */
public class OptionalSample {

  /** Optionalがnullを含むサンプル. */
  public void optionalContainsNull() {
    final Optional<String> value = Optional.ofNullable(null);

    final String nullableValue = value.orElse("null");

    System.out.println(nullableValue); // nullがコンソールに出力される
  }

  /** メソッドの戻り値がOptionalのサンプル. */
  public void returnValueOfMethodIsOptional() {
    // nullを含まないOptionalを取得する
    final Optional<String> value = getNonNullOptional();

    // nullかどうか判定し、値がある場合に処理を行う
    if (value.isPresent()) {
      System.out.println("Optionalに値あり"); // 値があるため実行される
    }

    // nullを含むOptionalを取得する
    final Optional<String> a = getNullOptional();

    // nullの場合、デフォルト値を設定する
    final String defaultValue = a.orElse("default");
    System.out.println(defaultValue); // defaultがコンソールに出力される
  }

  // nullを含まないOptionalを返す
  private Optional<String> getNonNullOptional() {
    return Optional.of("hello");
  }

  // nullを含むOptionalを返す
  private Optional<String> getNullOptional() {
    return Optional.ofNullable(null);
  }

  /** Optionalの使い方. */
  public void howToUseOptional() {
    // Optionalを作る。nullなし。
    final Optional<String> valueNonNull = Optional.of("value");

    // Optionalを作る。nullあり。
    final Optional<String> valueNull = Optional.ofNullable(null);

    // 値のないOptionalを作る。nullに相当。
    final Optional<String> valueEmpty = Optional.empty();

    // nullでない場合に処理を行う
    if (valueNonNull.isPresent()) {
      // isPresentで判定してからgetする。実行。
      System.out.println(valueNonNull.get()); // valueが出力される
    }

    // nullの場合にデフォルト値を与える。デフォルト値が使える時は非常に有効。
    final String defaultValue = valueNull.orElse("");
    System.out.println(defaultValue); // 空文字がコンソールに出力される

    // nullの場合に条件によってデフォルト値を与える
    final boolean isOK = true;
    final String judgedDefaultValue =
        valueEmpty.orElseGet(
            () -> {
              // 条件判定
              return "ok";
            });
    System.out.println(judgedDefaultValue); // okがコンソールに出力される

    // nullの場合に例外を発生させる
    try {
      valueEmpty.orElseThrow(() -> new RuntimeException("empty"));
    } catch (Exception ex) { // 本来はExceptionでキャッチしてはダメ
      System.out.println(ex.getClass().getName()); // java.lang.RuntimeException
    }

    // Optionalに値がある場合だけ処理を実行する
    valueNonNull.ifPresent(v -> System.out.println(v)); // 出力される

    // Java 9からif elseが書ける。実行のみ。値を返す場合はorElse,orElseGetを使用。
    valueNonNull.ifPresentOrElse(
        v -> System.out.println("optional is " + v), // 実行される
        () -> System.out.println("optional is empty"));
  }
}
