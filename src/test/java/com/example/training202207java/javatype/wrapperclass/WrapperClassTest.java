package com.example.training202207java.javatype.wrapperclass;

import com.example.training202207java.javatype.wapperclass.WrapperClass;
import org.junit.jupiter.api.Test;

class WrapperClassTest {

  private final WrapperClass wrapperClass = new WrapperClass();

  @Test
  void setIntegerを実行する() {
    wrapperClass.setInteger();
  }

  @Test
  void compareIntegerを実行する() {
    wrapperClass.compareInteger();
  }

  @Test
  void compareIntegerCorrectlyを実行する() {
    wrapperClass.compareIntegerCorrectly();
  }

  @Test
  void compareIntegerNullPointerExceptionを実行する() {
    wrapperClass.compareIntegerNullPointerException();
  }

  @Test
  void compareIntegerGenerallyを実行する() {
    wrapperClass.compareIntegerGenerally();
  }

  @Test
  void valueOfIntを実行する() {
    wrapperClass.valueOfInt();
  }

  @Test
  void valueOfStringを実行する() {
    wrapperClass.valueOfString();
  }

  @Test
  void parseIntを実行する() {
    wrapperClass.parseInt();
  }
}
