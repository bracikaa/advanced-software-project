package com.userfrontend.Dao;

import com.userfrontend.domain.security.Role;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Laptop on 11.12.2017..
 */
public interface RoleDao extends CrudRepository<Role, Integer> {
    Role findByName(String name);
}

