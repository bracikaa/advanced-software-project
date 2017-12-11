package com.userfrontend.Dao;

import com.userfrontend.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Laptop on 11.12.2017..
 */
public interface UserDao extends CrudRepository<User, Long> {
    User findByUsername(String username);
    User findByEmail(String email);
}
