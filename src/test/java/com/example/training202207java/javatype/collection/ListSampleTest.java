package com.example.training202207java.javatype.collection;

import org.junit.jupiter.api.Test;

class ListSampleTest {
  final ListSample listSample = new ListSample();

  @Test
  void initializeArrayListを実行する() {
    listSample.initializeArrayList();
  }

  @Test
  void initializeArrayListWithElementsを実行する() {
    listSample.initializeArrayListWithElements();
  }

  @Test
  void initializeArrayListFromExistedArrayを実行する() {
    listSample.initializeArrayListFromExistedArray();
  }

  @Test
  void getSampleを実行する() {
    listSample.getSample();
  }

  @Test
  void isEmptySampleを実行する() {
    listSample.isEmptySample();
  }

  @Test
  void collectionUtilsSampleを実行する() {
    listSample.collectionUtilsSample();
  }
}
