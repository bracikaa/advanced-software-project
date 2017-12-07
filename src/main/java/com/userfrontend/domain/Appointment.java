package com.userfrontend.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Laptop on 23.11.2017..
 */
@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date app_date;
    private String app_location;
    private String app_description;
    private boolean app_confirmed;

    @ManyToOne
    @JoinColumn(name = "col_user_id")
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getApp_date() {
        return app_date;
    }

    public void setApp_date(Date app_date) {
        this.app_date = app_date;
    }

    public String getApp_location() {
        return app_location;
    }

    public void setApp_location(String app_location) {
        this.app_location = app_location;
    }

    public String getApp_description() {
        return app_description;
    }

    public void setApp_description(String app_description) {
        this.app_description = app_description;
    }

    public boolean isApp_confirmed() {
        return app_confirmed;
    }

    public void setApp_confirmed(boolean app_confirmed) {
        this.app_confirmed = app_confirmed;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", app_date=" + app_date +
                ", app_location='" + app_location + '\'' +
                ", app_description='" + app_description + '\'' +
                ", app_confirmed=" + app_confirmed +
                ", user=" + user +
                '}';
    }
}
