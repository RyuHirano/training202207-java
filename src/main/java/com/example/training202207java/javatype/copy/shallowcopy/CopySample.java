package com.example.training202207java.javatype.copy.shallowcopy;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;
import org.apache.commons.beanutils.BeanUtils;

/** シャローコピーのサンプル. */
public class CopySample {

  /** シャローコピーを行う その1. */
  public void shallowCopy1() {
    // 初期化
    Parent parentFrom = new Parent();
    Child child1 = new Child();
    child1.setValue("初期化時点のfrom");
    parentFrom.setChild(child1);
    parentFrom.setDate(LocalDate.now());

    System.out.println("--- コピー元初期化 ---");
    System.out.println("コピー元の値: value = " + parentFrom.getChild().getValue());
    System.out.println("コピー元の値: date = " + parentFrom.getDate());

    // parentToの初期化
    Parent parentTo = new Parent();

    // コピー
    parentTo.setChild(parentFrom.getChild());
    parentTo.setDate(parentFrom.getDate());
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

  /** シャローコピーを行う その2. */
  public void shallowCopy2() throws InvocationTargetException, IllegalAccessException {
    // 初期化
    Parent parentFrom = new Parent();
    Child child1 = new Child();
    child1.setValue("初期化時点のfrom");
    parentFrom.setChild(child1);
    parentFrom.setDate(LocalDate.now());

    System.out.println("--- コピー元初期化 ---");
    System.out.println("コピー元の値: value = " + parentFrom.getChild().getValue());
    System.out.println("コピー元の値: date = " + parentFrom.getDate());

    // parentToの初期化
    Parent parentTo = new Parent();

    // コピー
    BeanUtils.copyProperties(parentTo, parentFrom);
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
