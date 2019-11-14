package com.ruifeng.inspect.service;

import com.ruifeng.inspect.entity.User;

public interface IUserService {
    void create(User user);

    boolean delete(long id);

    boolean update(User user);

    User read(long id);
}
