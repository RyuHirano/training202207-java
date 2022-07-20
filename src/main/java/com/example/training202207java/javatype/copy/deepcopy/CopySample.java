package com.example.training202207java.javatype.copy.deepcopy;

import java.time.LocalDate;
import org.apache.commons.lang3.SerializationUtils;

/** ディープコピーのサンプル. */
public class CopySample {

  /** ディープコピーを行う. */
  public void deepCopy() {
    // 初期化
    Parent parentFrom = new Parent();
    Child child1 = new Child();
    child1.setValue("初期化時点のfrom");
    parentFrom.setChild(child1);
    parentFrom.setDate(LocalDate.now());

    System.out.println("--- コピー元初期化 ---");
    System.out.println("コピー元の値: value = " + parentFrom.getChild().getValue());
    System.out.println("コピー元の値: date = " + parentFrom.getDate());

    // コピー
    Parent parentTo = SerializationUtils.clone(parentFrom);
    System.out.println("--- コピー ---");
    System.out.println("コピー先の値: value = " + parentTo.getChild().getValue());
    System.out.println("コピー先の値: date = " + parentTo.getDate());

    // parentFromの修正
    parentFrom.getChild().setValue("修正後のfrom");
    parentFrom.setDate(LocalDate.now().minusDays(1));
    System.out.println("--- コピー元修正 ---");
    System.out.println("コピー元の値: value = " + parentFrom.getChild().getValue());
    System.out.println("コピー元の値: date = " + parentFrom.getDate());

    // 影響確認
    System.out.println("--- コピー先影響確認 ---");
    System.out.println("コピー先の値: value = " + parentTo.getChild().getValue());
    System.out.println("コピー先の値: date = " + parentTo.getDate());
  }
}
