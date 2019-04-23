package com.rambo.demo.account.entity;

import lombok.Data;

/**
 * User: za-panyong
 * Date: 2018/11/1
 * Time: 19:36
 */
@Data
public class Account {
    private Integer id;
    private String name;

    public Account() {
    }

    private Double money;

    public Account(String name, double money) {
        this.name = name;
        this.money = money;
    }
}
