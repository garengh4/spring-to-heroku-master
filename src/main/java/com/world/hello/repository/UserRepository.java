package com.world.hello.repository;

import com.world.hello.entity.dao.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Account, Integer> {
}
