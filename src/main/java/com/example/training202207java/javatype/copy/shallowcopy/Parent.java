package com.example.training202207java.javatype.copy.shallowcopy;

import java.time.LocalDate;
import lombok.Data;

@Data
public class Parent {
  private Child child;
  private LocalDate date;
}
