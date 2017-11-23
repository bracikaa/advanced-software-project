package com.userfrontend.domain;

/**
 * Created by Laptop on 23.11.2017..
 */
public class Recipient {
    private Long id;
    private String recip_name;
    private String recip_email;
    private String recip_phone;
    private String recip_accno;
    private String recip_description;

    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRecip_name() {
        return recip_name;
    }

    public void setRecip_name(String recip_name) {
        this.recip_name = recip_name;
    }

    public String getRecip_email() {
        return recip_email;
    }

    public void setRecip_email(String recip_email) {
        this.recip_email = recip_email;
    }

    public String getRecip_phone() {
        return recip_phone;
    }

    public void setRecip_phone(String recip_phone) {
        this.recip_phone = recip_phone;
    }

    public String getRecip_accno() {
        return recip_accno;
    }

    public void setRecip_accno(String recip_accno) {
        this.recip_accno = recip_accno;
    }

    public String getRecip_description() {
        return recip_description;
    }

    public void setRecip_description(String recip_description) {
        this.recip_description = recip_description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
