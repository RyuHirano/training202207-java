package com.example.training202207java.javatype.copy.shallowcopy;

import java.lang.reflect.InvocationTargetException;
import org.junit.jupiter.api.Test;

class CopySampleTest {

  private final CopySample copySample = new CopySample();

  @Test
  void shallowCopy1を実行する() {
    copySample.shallowCopy1();
  }

  @Test
  void shallowCopy2を実行する() throws InvocationTargetException, IllegalAccessException {
    copySample.shallowCopy2();
  }
}
