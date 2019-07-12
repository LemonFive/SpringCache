package com.demo;

import java.util.List;

/**
 * @desc:
 * @author: CuiShiHao
 **/
public interface UserService {

    List<User> list();

    List<User> test();

    User findUserById(Long id);

    void update(User user);

    void remove(Long id);

    User upuser(Long id);

    User saveUser(User user);

}
