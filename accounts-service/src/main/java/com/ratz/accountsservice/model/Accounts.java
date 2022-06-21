package com.ratz.accountsservice.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
@ToString
public class Accounts {

  @Id
  private long accountNumber;

  private int customerId;
  private String branchAddress;
  private String accountType;
  private LocalDate createDt;
}
