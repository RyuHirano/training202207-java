package com.example.training202207java.javatype.optional;

import org.junit.jupiter.api.Test;

class OptionalSampleTest {
  private final OptionalSample optionalSample = new OptionalSample();

  @Test
  void optionalContainsNullを実行する() {
    optionalSample.optionalContainsNull();
  }

  @Test
  void returnValueOfMethodIsOptionalを実行する() {
    optionalSample.returnValueOfMethodIsOptional();
  }

  @Test
  void howToUseOptionalを実行する() {
    optionalSample.howToUseOptional();
  }
}
