package com.ratz.accountsservice.repository;

import com.ratz.accountsservice.model.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsRepository extends JpaRepository<Accounts, Long> {

  Accounts findByCustomerId(int customerId);
}
