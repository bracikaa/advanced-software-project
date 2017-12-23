package com.userfrontend.Dao;

import com.userfrontend.domain.PrimaryAccount;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Laptop on 11.12.2017..
 */
public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount,Long> {

    PrimaryAccount findByAccountNumber (int accountNumber);
}

