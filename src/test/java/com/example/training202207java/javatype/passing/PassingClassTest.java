package com.example.training202207java.javatype.passing;

import org.junit.jupiter.api.Test;

class PassingClassTest {

  private final PassingClass passingClass = new PassingClass();

  @Test
  void primitiveMethodを実行する() {
    passingClass.primitiveMethod();
  }

  @Test
  void referenceMethodを実行する() {
    passingClass.referenceMethod();
  }
}
