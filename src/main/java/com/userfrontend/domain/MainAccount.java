package com.userfrontend.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Laptop on 23.11.2017..
 */
@Entity
public class MainAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int main_accno;
    //private double main_accbalance;
    private BigDecimal main_accbalance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMain_accno() {
        return main_accno;
    }

    public void setMain_accno(int main_accno) {
        this.main_accno = main_accno;
    }

    public BigDecimal getMain_accbalance() {
        return main_accbalance;
    }

    public void setMain_accbalance(BigDecimal main_accbalance) {
        this.main_accbalance = main_accbalance;
    }

    public List<MainTransaction> getMainTransactionList() {
        return mainTransactionList;
    }

    public void setMainTransactionList(List<MainTransaction> mainTransactionList) {
        this.mainTransactionList = mainTransactionList;
    }

    @OneToMany(mappedBy = "mainAccount", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<MainTransaction> mainTransactionList;
}
