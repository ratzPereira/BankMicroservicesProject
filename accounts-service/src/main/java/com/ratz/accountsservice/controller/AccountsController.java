package com.ratz.accountsservice.controller;

import com.ratz.accountsservice.model.Accounts;
import com.ratz.accountsservice.model.Customer;
import com.ratz.accountsservice.repository.AccountsRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ratzBank/account")
public class AccountsController {


  private final AccountsRepository accountsRepository;

  public AccountsController(AccountsRepository accountsRepository) {
    this.accountsRepository = accountsRepository;
  }


  @PostMapping("/myAccount")
  public Accounts getAccountDetails(@RequestBody Customer customer){

    Accounts accounts = accountsRepository.findByCustomerId(customer.getCustomerId());

    if (accounts != null) {
      return accounts;
    } else {
      return null;
    }
  }
}
