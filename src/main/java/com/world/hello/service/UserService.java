package com.world.hello.service;

import com.world.hello.entity.dao.Account;
import com.world.hello.entity.pojo.AccountParam;
import com.world.hello.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public List<Account> getUserList() {
    return userRepository.findAll();
  }

  public Account addUser(AccountParam param) {

    Account user = new Account();

    user.setName(param.getName());
    user.setAccountBalance(param.getAccountBalance());

    return userRepository.save(user);
  }
}
