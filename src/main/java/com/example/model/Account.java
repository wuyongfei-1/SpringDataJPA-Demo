package com.example.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 **/
@SuppressWarnings("all")
@Entity
@Data
@Table(name = "tb_account")
public class Account {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(length = 36)
    private String accountId;
    private String accountUsername;
    private String accountPassword;
    private Boolean AccountGender;
    private Boolean AccountDeleted;
    @Column(columnDefinition = "TIMESTAMP(3) NULL DEFAULT NULL")
    private Timestamp accountLastTime;
    @Column(columnDefinition = "TIMESTAMP(3) NULL DEFAULT NULL")
    private Timestamp accountCreateTime;
    @Column(columnDefinition = "TIMESTAMP(3) NULL DEFAULT NULL")
    private Timestamp accountUpdateTime;


    @PrePersist
    private void accountCreateTime() {
        this.accountCreateTime = new Timestamp(System.currentTimeMillis());
        this.AccountDeleted = false;
    }

    @PreUpdate
    private void accountUpdateTime() {
        this.accountUpdateTime = new Timestamp(System.currentTimeMillis());
    }
}
