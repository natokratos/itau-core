package com.itau.core.service.server;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.itau.core.entity.Account;
import com.itau.core.repository.AccountRepository;

@Component(value = "accountsImpl")
@WebService
public class AccountsImpl {
	@Autowired(required=false)
    private AccountRepository accountRepositoryImpl;
	
	@WebMethod
	public List<Account> getList(String customerId) {
		return accountRepositoryImpl.findByOwnerCustomerId(customerId);
	}

	@WebMethod
	public Account getRead(String accountId, String customerId) {
		return accountRepositoryImpl.findByAccountIdAndOwnerCustomerId(accountId, customerId);
	}
}
