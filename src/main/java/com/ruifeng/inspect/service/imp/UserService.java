package com.ruifeng.inspect.service.imp;

import com.ruifeng.inspect.entity.User;
import com.ruifeng.inspect.mapper.UserMapper;
import com.ruifeng.inspect.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService implements IUserService {
    @Autowired
    UserMapper mUserMapper;

    @Override
    public void create(User user) {
        mUserMapper.create(user);
    }

    @Override
    public boolean delete(long id) {
        return mUserMapper.deleteUserID(id);
    }

    @Override
    public boolean update(User user) {
        return mUserMapper.updateUser(user);
    }

    @Override
    public User read(long id) {
        return mUserMapper.readID(id);
    }
}
