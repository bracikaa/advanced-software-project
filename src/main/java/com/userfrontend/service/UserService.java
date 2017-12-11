package com.userfrontend.service;

import com.userfrontend.domain.User;

/**
 * Created by Laptop on 11.12.2017..
 */
public interface UserService {
    User findByUsername(String username);
    User findByEmail(String email);
    boolean checkUserExists(String username, String email);
    boolean checkUsernameExists(String username);
    boolean checkEmailExists(String email);
    void save(User user);
}
