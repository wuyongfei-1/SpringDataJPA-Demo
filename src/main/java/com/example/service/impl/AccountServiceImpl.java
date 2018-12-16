package com.example.service.impl;

import com.example.model.Account;
import com.example.repository.AccountRepository;
import com.example.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 **/
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account saveAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public List<Account> listAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Account getAccountById(String id) {
        return accountRepository.findById(id).orElse(null);
    }
}
