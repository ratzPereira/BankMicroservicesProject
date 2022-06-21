package com.ratz.cardsservice.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@ToString
public class Cards {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int cardId;
  private int customerId;
  private String cardNumber;
  private String cardType;
  private int totalLimit;
  private int amountUsed;
  private int availableAmount;
  private Date createDt;
}
