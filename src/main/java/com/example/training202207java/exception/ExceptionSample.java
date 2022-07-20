package com.example.training202207java.exception;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/** 例外のサンプル. */
@Slf4j
public class ExceptionSample {

  /** 例外をスローしないサンプル. */
  public void doesNotThrowException() {
    final String dir = "/tmp";
    final String fileName = "log.txt";

    //    final List<String> lines = Files.readAllLines(Paths.get(dir, fileName));
  }

  /** 例外をスローするサンプル. */
  public void throwException() throws IOException {
    final String dir = "/tmp";
    final String fileName = "log.txt";

    final List<String> lines = Files.readAllLines(Paths.get(dir, fileName));
  }

  /** 例外をキャッチするサンプル. */
  public void catchException() {
    final String dir = "/tmp";
    final String fileName = "log.txt";
    try {
      final List<String> lines = Files.readAllLines(Paths.get(dir, fileName));
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
      // 例外をスロー
    }
  }

  /** 例外をキャッチしないサンプル. */
  public void doesNotCatchException() {
    //    final Integer value = Integer.valueOf("文字列");
  }

  /** 例外をキャッチするサンプル. */
  public void catchNumberFormatException() {
    try {
      final Integer value = Integer.valueOf("文字列");
    } catch (NumberFormatException ex) {
      // エラーログを出力
      log.error("予期しないエラーが発生しました。{} {}", ex.getMessage(), ex.getStackTrace());
      // 例外を再スロー
      throw ex;
    }
  }

  /** 例外の対応方法. その1. */
  public void exceptionHandling1() {
    try {
      // 例外が発生する処理
    } catch (NumberFormatException ex) {
      // 例外処理
    } finally {
      // 例外が発生してもしなくても、最後に実行される処理
      // 主にリソースの解放
    }
  }

  /** 例外の対応方法. その2. */
  public void exceptionHandling2() {
    // リソースを使用する初期化をtryの部分で行う(;区切りで複数指定可)
    // finallyがなくともリソースを自動的に解放する
    try (InputStream is = Files.newInputStream(Paths.get("/tmp/log.txt"))) {
      // 例外が発生する処理
    } catch (IOException ex) {
      // 例外処理
    }
  }

  /** 複数の例外の対応方法. その1. */
  public void multiExceptionCatch1() {
    //    try {
    //      // 例外が発生する処理
    //    } catch (FileNotFoundException ex) {
    //      // FileNotFoundExceptionの例外処理
    //    } catch (IOException ex) {
    //      // IOExceptionの例外処理
    //    }
  }

  /** 複数の例外の対応方法. その2. */
  public void multiExceptionCatch2() {
    //    try {
    //      // 例外が発生する処理
    //    } catch (FileNotFoundException | SocketException ex) {
    //      // 共通の例外処理
    //    }
  }

  /** 例外のスロー. */
  public void throwExceptionOnMyself() {
    throw new RuntimeException("自分で例外をスローする");
  }
}
