package com.itau.core.repository;

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
public class AccountRepositoryTest {

	@Autowired
	private AccountRepository a;
	
	@Test
	public void testCreation() {
		if(a == null) {
			fail(getClass().getName() + ": ERRO Creating Accounts Repository");		
		}
	}

	@Test
	public void testFindByOwnerCustomerId() {
		if(a == null) {
			fail(getClass().getName() + ": ERRO Creating Accounts Repository");		
		}
		
		try {
			List<Account> l = a.findByOwnerCustomerId("1");
			if(l == null || l.isEmpty()) {
				fail(getClass().getName() + ": ERRO Executing findByOwnerCustomerId, EMPTY");		
			}
		} catch(Exception e) {
			fail(getClass().getName() + ": ERRO " + e.getLocalizedMessage());			
		}		
	}
}
