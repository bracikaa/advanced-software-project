package com.userfrontend.Dao;

import com.userfrontend.domain.SavingsAccount;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Laptop on 11.12.2017..
 */
public interface SavingsAccountDao extends CrudRepository<SavingsAccount, Long> {

    SavingsAccount findByAccountNumber (int accountNumber);
}

