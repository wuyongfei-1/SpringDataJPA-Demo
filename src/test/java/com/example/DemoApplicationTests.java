package com.example;

import com.example.model.Account;
import com.example.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private AccountService accountService;

    @Test
    public void contextLoads() {
        Account account = new Account();
        account.setAccountUsername("zhangsan");
        account.setAccountGender(false);
        account.setAccountPassword("admin");
        accountService.saveAccount(account);

        List<Account> accounts = accountService.listAccounts();
        accounts.forEach(account1 -> {
            Account account2 = accountService.getAccountById(account1.getAccountId());
            account2.setAccountPassword("999999");
            accountService.saveAccount(account2);
            System.out.println("----------------------------------------------");
            System.out.println(account2.toString());
        });
    }
}

