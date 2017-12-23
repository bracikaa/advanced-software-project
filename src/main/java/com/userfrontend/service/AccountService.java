package com.userfrontend.service;

import com.userfrontend.domain.PrimaryAccount;
import com.userfrontend.domain.SavingsAccount;

import java.security.Principal;

/**
 * Created by Laptop on 11.12.2017..
 */
public interface AccountService {
    PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();
}
