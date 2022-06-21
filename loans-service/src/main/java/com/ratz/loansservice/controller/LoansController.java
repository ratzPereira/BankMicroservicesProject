package com.ratz.loansservice.controller;

import com.ratz.loansservice.model.Customer;
import com.ratz.loansservice.model.Loans;
import com.ratz.loansservice.repository.LoansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/ratzBank/loans")
public class LoansController {

  private final LoansRepository loansRepository;


  public LoansController(LoansRepository loansRepository) {
    this.loansRepository = loansRepository;
  }

  @PostMapping("/myLoans")
  public List<Loans> getLoansDetails(@RequestBody Customer customer) {
    List<Loans> loans = loansRepository.findByCustomerIdOrderByStartDtDesc(customer.getCustomerId());
    if (loans != null) {
      return loans;
    } else {
      return null;
    }

  }
}
