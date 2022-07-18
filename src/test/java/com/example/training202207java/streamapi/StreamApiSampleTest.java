package com.example.training202207java.streamapi;

import org.junit.jupiter.api.Test;

class StreamApiSampleTest {
  private final StreamApiSample streamApiSample = new StreamApiSample();

  @Test
  void streamApiSimpleSampleを実行する() {
    streamApiSample.streamApiSimpleSample();
  }

  @Test
  void streamApiSampleFindFirstを実行する() {
    streamApiSample.streamApiSampleFindFirst();
  }

  @Test
  void streamApiSampleを実行する() {
    streamApiSample.streamApiSample();
  }

  @Test
  void streamApiSampleFlatMapを実行する() {
    streamApiSample.streamApiSampleFlatMap();
  }

  @Test
  void streamApiSampleForEachを実行する() {
    streamApiSample.streamApiSampleForEach();
  }

  @Test
  void streamApiSampleAnyMatchを実行する() {
    streamApiSample.streamApiSampleAnyMatch();
  }
}
