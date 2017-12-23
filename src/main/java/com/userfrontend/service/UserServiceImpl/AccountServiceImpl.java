package com.userfrontend.service.UserServiceImpl;

import java.math.BigDecimal;
import java.security.Principal;
import java.util.Date;

import org.omg.IOP.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userfrontend.Dao.PrimaryAccountDao;
import com.userfrontend.Dao.SavingsAccountDao;
import com.userfrontend.domain.PrimaryAccount;
import com.userfrontend.domain.PrimaryTransaction;
import com.userfrontend.domain.SavingsAccount;
import com.userfrontend.domain.SavingsTransaction;
import com.userfrontend.domain.User;
import com.userfrontend.service.AccountService;
import com.userfrontend.service.UserService;

@Service
public class AccountServiceImpl implements AccountService {

    private static int nextAccountNumber = 11223145;

    @Autowired
    private PrimaryAccountDao primaryAccountDao;

    @Autowired
    private SavingsAccountDao savingsAccountDao;

    @Autowired
    private UserService userService;

    //@Autowired
    //private TransactionService transactionService;

    public PrimaryAccount createPrimaryAccount() {
        PrimaryAccount primaryAccount = new PrimaryAccount();
        primaryAccount.setAccountBalance(new BigDecimal(0.0));
        primaryAccount.setAccountNumber(accountGen());

        primaryAccountDao.save(primaryAccount);

        return primaryAccountDao.findByAccountNumber(primaryAccount.getAccountNumber());
    }

    public SavingsAccount createSavingsAccount() {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setAccountBalance(new BigDecimal(0.0));
        savingsAccount.setAccountNumber(accountGen());

        savingsAccountDao.save(savingsAccount);

        return savingsAccountDao.findByAccountNumber(savingsAccount.getAccountNumber());
    }

    private int accountGen() {
        return ++nextAccountNumber;
    }



}