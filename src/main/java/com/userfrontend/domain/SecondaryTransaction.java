package com.userfrontend.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Laptop on 23.11.2017..
 */
public class SecondaryTransaction {
    private Long id;
    private Date secondtrans_date;
    private String secondtrans_description;
    private String secondtrans_type;
    private String secondtrans_status;
    private double secondtrans_amount;
    private BigDecimal secondtrans_available;
    private SecondaryAccount secondaryAccount;

    public SecondaryTransaction() {
    }

    public SecondaryTransaction(Date secondtrans_date, String secondtrans_description, String secondtrans_type, String secondtrans_status, double secondtrans_amount, BigDecimal secondtrans_available, SecondaryAccount secondaryAccount) {
        this.secondtrans_date = secondtrans_date;
        this.secondtrans_description = secondtrans_description;
        this.secondtrans_type = secondtrans_type;
        this.secondtrans_status = secondtrans_status;
        this.secondtrans_amount = secondtrans_amount;
        this.secondtrans_available = secondtrans_available;
        this.secondaryAccount = secondaryAccount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getSecondtrans_date() {
        return secondtrans_date;
    }

    public void setSecondtrans_date(Date secondtrans_date) {
        this.secondtrans_date = secondtrans_date;
    }

    public String getSecondtrans_description() {
        return secondtrans_description;
    }

    public void setSecondtrans_description(String secondtrans_description) {
        this.secondtrans_description = secondtrans_description;
    }

    public String getSecondtrans_type() {
        return secondtrans_type;
    }

    public void setSecondtrans_type(String secondtrans_type) {
        this.secondtrans_type = secondtrans_type;
    }

    public String getSecondtrans_status() {
        return secondtrans_status;
    }

    public void setSecondtrans_status(String secondtrans_status) {
        this.secondtrans_status = secondtrans_status;
    }

    public double getSecondtrans_amount() {
        return secondtrans_amount;
    }

    public void setSecondtrans_amount(double secondtrans_amount) {
        this.secondtrans_amount = secondtrans_amount;
    }

    public BigDecimal getSecondtrans_available() {
        return secondtrans_available;
    }

    public void setSecondtrans_available(BigDecimal secondtrans_available) {
        this.secondtrans_available = secondtrans_available;
    }

    public SecondaryAccount getSecondaryAccount() {
        return secondaryAccount;
    }

    public void setSecondaryAccount(SecondaryAccount secondaryAccount) {
        this.secondaryAccount = secondaryAccount;
    }
}
