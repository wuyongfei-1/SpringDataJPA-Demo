package com.example.service;

import com.example.model.Account;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 **/
public interface AccountService {

    Account saveAccount(Account account);


    List<Account> listAccounts();


    Account getAccountById(String id);
}
