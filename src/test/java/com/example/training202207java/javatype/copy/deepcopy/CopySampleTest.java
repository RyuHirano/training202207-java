package com.example.training202207java.javatype.copy.deepcopy;

import org.junit.jupiter.api.Test;

class CopySampleTest {

  private final CopySample copySample = new CopySample();

  @Test
  void deepCopyを実行する() {
    copySample.deepCopy();
  }
}
