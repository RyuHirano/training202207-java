package com.example.training202207java.javatype.primitivetype;

import org.junit.jupiter.api.Test;

class PrimitiveTypeTest {

  private final PrimitiveType primitiveType = new PrimitiveType();

  @Test
  void setIntを実行する() {
    primitiveType.setInt();
  }

  @Test
  void compareIntを実行する() {
    primitiveType.compareInt();
  }
}
