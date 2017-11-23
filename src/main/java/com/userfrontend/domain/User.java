package com.userfrontend.domain;

import java.util.List;

/**
 * Created by Laptop on 23.11.2017..
 */
public class User {
    private Long user_id;
    private String username;
    private String password;
    private String user_firstname;
    private String user_lastname;
    private String user_email;
    private String user_phone;

    private boolean enabled = true;

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", user_firstname='" + user_firstname + '\'' +
                ", user_lastname='" + user_lastname + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_phone='" + user_phone + '\'' +
                ", enabled=" + enabled +
                ", mainAccount=" + mainAccount +
                ", secondaryAccount=" + secondaryAccount +
                ", appointmentList=" + appointmentList +
                ", recipientList=" + recipientList +
                '}';
    }

    private MainAccount mainAccount;
    private SecondaryAccount secondaryAccount;
    private List<Appointment> appointmentList;
    private List<Recipient> recipientList;

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_firstname() {
        return user_firstname;
    }

    public void setUser_firstname(String user_firstname) {
        this.user_firstname = user_firstname;
    }

    public String getUser_lastname() {
        return user_lastname;
    }

    public void setUser_lastname(String user_lastname) {
        this.user_lastname = user_lastname;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public MainAccount getMainAccount() {
        return mainAccount;
    }

    public void setMainAccount(MainAccount mainAccount) {
        this.mainAccount = mainAccount;
    }

    public SecondaryAccount getSecondaryAccount() {
        return secondaryAccount;
    }

    public void setSecondaryAccount(SecondaryAccount secondaryAccount) {
        this.secondaryAccount = secondaryAccount;
    }

    public List<Appointment> getAppointmentList() {
        return appointmentList;
    }

    public void setAppointmentList(List<Appointment> appointmentList) {
        this.appointmentList = appointmentList;
    }

    public List<Recipient> getRecipientList() {
        return recipientList;
    }

    public void setRecipientList(List<Recipient> recipientList) {
        this.recipientList = recipientList;
    }
}
