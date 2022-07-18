package com.example.training202207java.javatype.passing;

import lombok.AllArgsConstructor;
import lombok.Data;

/** 値渡しと参照渡しのサンプル. */
public class PassingClass {
  // 実際はpublicのメソッドは上にまとめます

  /** 値渡しのサンプル. */
  public void primitiveMethod() {
    int value = 1;
    System.out.println("method実行前のvalue:" + value);

    // method実行
    changePrimitiveValue(1);

    System.out.println("method実行後のvalue:" + value);
  }

  /**
   * 値渡しの変数を変更する.
   *
   * @param value int
   */
  private void changePrimitiveValue(int value) {
    value = 2;
    System.out.println("methodのvalue: " + value);
  }

  /** 参照渡しのサンプル. */
  public void referenceMethod() {
    // newしてfield1に値を格納する
    SampleClass sampleClass = new SampleClass("初期値");

    // method実行前
    System.out.println("method実行前: " + sampleClass.field1);

    // method実行
    changeReferenceMethod(sampleClass);

    // method実行後
    System.out.println("method実行後: " + sampleClass.field1);
  }

  /**
   * 参照渡しの変数を変更する.
   *
   * @param sampleClass SampleClass
   */
  private void changeReferenceMethod(SampleClass sampleClass) {
    sampleClass.setField1("変更しました");
    System.out.println("method内: " + sampleClass.field1);
  }

  @Data
  @AllArgsConstructor
  static class SampleClass {
    String field1;
  }
}
