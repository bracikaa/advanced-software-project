package com.userfrontend.domain;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Laptop on 23.11.2017..
 */
public class SecondaryAccount {
    private Long id;
    private int second_accno;
    //private double second_accbalance;
    private BigDecimal second_accbalance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSecond_accno() {
        return second_accno;
    }

    public void setSecond_accno(int second_accno) {
        this.second_accno = second_accno;
    }

    public BigDecimal getSecond_accbalance() {
        return second_accbalance;
    }

    public void setSecond_accbalance(BigDecimal second_accbalance) {
        this.second_accbalance = second_accbalance;
    }

    public List<SecondaryTransaction> getSecondaryTransactionList() {
        return secondaryTransactionList;
    }

    public void setSecondaryTransactionList(List<SecondaryTransaction> secondaryTransactionList) {
        this.secondaryTransactionList = secondaryTransactionList;
    }

    private List<SecondaryTransaction> secondaryTransactionList;
}
