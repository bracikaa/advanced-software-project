package com.userfrontend.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Laptop on 23.11.2017..
 */
@Entity
public class MainTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date maintrans_date;
    private String maintrans_description;
    private String maintrans_type;
    private String maintrans_status;
    private double maintrans_amount;
    private BigDecimal maintrans_available;
    @ManyToOne
    @JoinColumn(name="main_account_id")
    private MainAccount mainAccount;


    public MainTransaction() {
    }

    public MainTransaction(Date maintrans_date, String maintrans_description, String maintrans_type, String maintrans_status, double maintrans_amount, BigDecimal maintrans_available, MainAccount mainAccount) {
        this.maintrans_date = maintrans_date;
        this.maintrans_description = maintrans_description;
        this.maintrans_type = maintrans_type;
        this.maintrans_status = maintrans_status;
        this.maintrans_amount = maintrans_amount;
        this.maintrans_available = maintrans_available;
        this.mainAccount = mainAccount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getMaintrans_date() {
        return maintrans_date;
    }

    public void setMaintrans_date(Date maintrans_date) {
        this.maintrans_date = maintrans_date;
    }

    public String getMaintrans_description() {
        return maintrans_description;
    }

    public void setMaintrans_description(String maintrans_description) {
        this.maintrans_description = maintrans_description;
    }

    public String getMaintrans_type() {
        return maintrans_type;
    }

    public void setMaintrans_type(String maintrans_type) {
        this.maintrans_type = maintrans_type;
    }

    public String getMaintrans_status() {
        return maintrans_status;
    }

    public void setMaintrans_status(String maintrans_status) {
        this.maintrans_status = maintrans_status;
    }

    public double getMaintrans_amount() {
        return maintrans_amount;
    }

    public void setMaintrans_amount(double maintrans_amount) {
        this.maintrans_amount = maintrans_amount;
    }

    public BigDecimal getMaintrans_available() {
        return maintrans_available;
    }

    public void setMaintrans_available(BigDecimal maintrans_available) {
        this.maintrans_available = maintrans_available;
    }

    public MainAccount getMainAccount() {
        return mainAccount;
    }

    public void setMainAccount(MainAccount mainAccount) {
        this.mainAccount = mainAccount;
    }

}
