package com.ratz.cardsservice.controller;

import com.ratz.cardsservice.model.Cards;
import com.ratz.cardsservice.model.Customer;
import com.ratz.cardsservice.repository.CardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/ratzBank/cards")
public class CardsController {

  private final CardsRepository cardsRepository;

  public CardsController(CardsRepository cardsRepository) {
    this.cardsRepository = cardsRepository;
  }

  @PostMapping("/myCards")
  public List<Cards> getCardDetails(@RequestBody Customer customer) {
    List<Cards> cards = cardsRepository.findByCustomerId(customer.getCustomerId());
    if (cards != null) {
      return cards;
    } else {
      return null;
    }

  }
}
