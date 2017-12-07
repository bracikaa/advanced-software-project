package com.userfrontend.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Laptop on 23.11.2017..
 */
@Entity
public class SecondaryAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int second_accno;
    //private double second_accbalance;
    private BigDecimal second_accbalance;

    @OneToMany(mappedBy = "secondaryAccount", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<SecondaryTransaction> secondaryTransactionList;

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

}
