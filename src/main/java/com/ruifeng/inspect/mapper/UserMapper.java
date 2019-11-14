package com.ruifeng.inspect.mapper;

import com.ruifeng.inspect.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    void create(User user);

    boolean deleteUserID(long id);

    boolean updateUser(User user);

    User readID(long id);
}
