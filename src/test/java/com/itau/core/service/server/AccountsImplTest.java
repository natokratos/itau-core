package com.itau.core.service.server;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.itau.core.entity.Account;
import com.itau.core.main.BankCoreMain;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BankCoreMain.class)
public class AccountsImplTest {
	@Autowired
	private AccountsImpl accountsImpl;
	
	@Test
	public void testGetList() {
		try {
			List<Account> l = accountsImpl.getList("1");
			
			if (l == null) {
				fail(getClass().getName() + ": ERRO List not found");
			}
		} catch(Exception e) {
			fail(getClass().getName() + ": ERRO " + e.getLocalizedMessage());
		}
	}

	@Test
	public void testGetRead() {
		try {
			Account a = accountsImpl.getRead("1", "1");
			
			if (a == null) {
				fail(getClass().getName() + ": ERRO List not found");
			}
		} catch(Exception e) {
			fail(getClass().getName() + ": ERRO " + e.getLocalizedMessage());
		}
	}
}
