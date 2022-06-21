package com.ratz.accountsservice.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
@ToString
public class Customer {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int customerId;
  private String name;
  private String email;
  private String mobileNumber;
  private LocalDate createDt;

}
