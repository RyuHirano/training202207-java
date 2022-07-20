package com.example.training202207java.javatype.copy.deepcopy;

import java.io.Serializable;
import java.time.LocalDate;
import lombok.*;

@Data
public class Parent implements Serializable {
  private Child child;
  private LocalDate date;
}
