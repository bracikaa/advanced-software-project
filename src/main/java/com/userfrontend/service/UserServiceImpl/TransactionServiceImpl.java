package com.userfrontend.service.UserServiceImpl;

import com.userfrontend.Dao.PrimaryTransactionDao;
import com.userfrontend.Dao.SavingsTransactionDao;
import com.userfrontend.domain.PrimaryTransaction;
import com.userfrontend.domain.SavingsAccount;
import com.userfrontend.domain.SavingsTransaction;
import com.userfrontend.domain.User;
import com.userfrontend.service.TransactionService;
import com.userfrontend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private UserService userService;

    @Autowired
    private PrimaryTransactionDao primaryTransactionDao;

    @Autowired
    private SavingsTransactionDao savingsTransactionDao;

    public List<PrimaryTransaction> findPrimaryTransaction(String username) {
        User user = userService.findByUsername(username);
        List<PrimaryTransaction> primaryTransactionList = user.getPrimaryAccount().getPrimaryTransactionList();
        return primaryTransactionList;
    }

    public List<SavingsTransaction> findSavingsTransaction(String username) {
        User user = userService.findByUsername(username);
        List<SavingsTransaction> savingsTransactionList = user.getSavingsAccount().getSavingsTransactionList();
        return savingsTransactionList;
    }

    public void savePrimaryDepositTransaction(PrimaryTransaction primaryTransaction)
    {
        primaryTransactionDao.save(primaryTransaction);
    }

    public void saveSavingsDepositTransaction(SavingsTransaction savingsTransaction)
    {
        savingsTransactionDao.save(savingsTransaction);
    }
}
