package com.userfrontend.service;

import com.userfrontend.domain.PrimaryTransaction;
import com.userfrontend.domain.SavingsTransaction;

import java.util.List;

/**
 * Created by Laptop on 28.12.2017..
 */
public interface TransactionService {
    List<PrimaryTransaction> findPrimaryTransaction(String username);
    List<SavingsTransaction> findSavingsTransaction(String username);
    void savePrimaryDepositTransaction(PrimaryTransaction primaryTransaction);
    void saveSavingsDepositTransaction(SavingsTransaction savingsTransaction);
}
