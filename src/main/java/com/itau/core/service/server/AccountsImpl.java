package com.itau.core.service.server;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.itau.core.entity.Account;
import com.itau.core.repository.AccountRepository;

@Component(value = "accountsImpl")
@WebService
public class AccountsImpl {
	@Autowired
    private AccountRepository accountRepositoryImpl;
	
	@WebMethod
	public List<Account> getList(@WebParam(name = "customerId") String customerId) {
		List<Account> l = accountRepositoryImpl.findByOwnerCustomerId(customerId); 
		return l;
	}

	@WebMethod
	public Account getRead(@WebParam(name = "accountId") String accountId, @WebParam(name = "customerId") String customerId) {
		return accountRepositoryImpl.findByAccountIdAndOwnerCustomerId(accountId, customerId);
	}
}
