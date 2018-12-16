package com.example.repository;

import com.example.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 **/
public interface AccountRepository extends JpaRepository<Account, String> {
}
