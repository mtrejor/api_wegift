package com.nearbpo.pocs.wegift.services;

import com.nearbpo.pocs.wegift.entities.User;

import java.util.List;

/**
 * Created by marcos on 20/02/15.
 */
public interface UserService {
    User findById(Long id);

    List<User> findAll();

    User save(User user);

    User update(User user);

    void delete(Long id);
}

