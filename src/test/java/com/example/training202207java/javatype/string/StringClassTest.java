package com.example.training202207java.javatype.string;

import org.junit.jupiter.api.Test;

class StringClassTest {

  final StringClass stringClass = new StringClass();

  @Test
  void changeStringを実行する() {
    stringClass.changeString();
  }

  @Test
  void changeStringDetailを実行する() {
    stringClass.changeStringDetail();
  }

  @Test
  void compareStringを実行する() {
    stringClass.compareString();
  }

  @Test
  void useStringUtilsEqualsを実行する() {
    stringClass.useStringUtilsEquals();
  }

  @Test
  void useStringUtilsCompareを実行する() {
    stringClass.useStringUtilsCompare();
  }

  @Test
  void concatStringを実行する() {
    stringClass.concatString();
  }
}
