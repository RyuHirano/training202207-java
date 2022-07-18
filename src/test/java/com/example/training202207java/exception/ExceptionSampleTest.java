package com.example.training202207java.exception;

import java.io.IOException;
import org.junit.jupiter.api.Test;

class ExceptionSampleTest {
  private final ExceptionSample exceptionSample = new ExceptionSample();

  @Test
  void doesNotThrowExceptionを実行する() {
    exceptionSample.doesNotThrowException();
  }

  @Test
  void throwExceptionを実行する() {
    try {
      exceptionSample.throwException();
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }
  }

  @Test
  void catchExceptionを実行する() {
    exceptionSample.catchException();
  }

  @Test
  void doesNotCatchExceptionを実行する() {
    exceptionSample.doesNotCatchException();
  }

  @Test
  void catchNumberFormatExceptionを実行する() {
    try {
      exceptionSample.catchNumberFormatException();
    } catch (NumberFormatException ex) {
      System.out.println(ex.getMessage());
    }
  }

  @Test
  void exceptionHandling1を実行する() {
    exceptionSample.exceptionHandling1();
  }

  @Test
  void exceptionHandling2を実行する() {
    exceptionSample.exceptionHandling2();
  }

  @Test
  void multiExceptionCatch1を実行する() {
    exceptionSample.multiExceptionCatch1();
  }

  @Test
  void multiExceptionCatch2を実行する() {
    exceptionSample.multiExceptionCatch2();
  }

  @Test
  void throwExceptionOnMyselfを実行する() {
    try {
      exceptionSample.throwExceptionOnMyself();
    } catch (RuntimeException ex) {
      System.out.println(ex.getMessage());
    }
  }
}
