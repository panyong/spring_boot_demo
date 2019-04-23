package com.rambo.demo.account.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.rambo.demo.account.entity.Account;
import com.rambo.demo.account.mapper.AccountMapper;
import com.rambo.demo.common.BaseResult;
import com.rambo.demo.common.BaseResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * User: za-panyong
 * Date: 2018/11/6
 * Time: 16:32
 * @author panyong
 */
@RestController
@RequestMapping(value = "/account")
public class AccountController {
    @Autowired
    private AccountMapper accountMapper;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public BaseResult<List<Account>> getAccounts() {
        List<Account> accountList = accountMapper.selectList(null);

        return BaseResultUtil.ok(accountList);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public BaseResult<Account> getAccountById(@PathVariable("id") int id) {
        Account account = new Account();
        account.setId(id);
        return BaseResultUtil.ok(accountMapper.selectOne(new LambdaQueryWrapper(account)));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public BaseResult<Void> updateAccount(@PathVariable("id") int id, @RequestParam(value = "name") String name,
                                          @RequestParam(value = "money") double money) {
        Account account = new Account(name,money);
        account.setId(id);
        int t = accountMapper.update(account, null);

        return t >= 1 ? BaseResultUtil.ok() : BaseResultUtil.error();

    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public BaseResult<Void> postAccount(@RequestParam(value = "name") String name,
                                        @RequestParam(value = "money") double money) {
        Account account = new Account(name,money);
        int t = accountMapper.insert(account);
        return t >= 1 ? BaseResultUtil.ok() : BaseResultUtil.error();

    }
}
