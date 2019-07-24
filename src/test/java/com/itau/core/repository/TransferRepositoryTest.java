package com.itau.core.repository;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.itau.core.entity.Transfer;
import com.itau.core.main.BankCoreMain;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BankCoreMain.class)
public class TransferRepositoryTest {
	@Autowired
	private TransferRepository t;
	
	@Test
	public void testCreation() {
		if(t == null) {
			fail(getClass().getName() + ": ERRO Creating Transfers Repository");		
		}
	}
	
	@Test
	public void testSave() {
		if(t == null) {
			fail(getClass().getName() + ": ERRO Creating Transfers Repository");		
		}
		
		try {
			Transfer transfer = new Transfer("1", "1", "TESTE", 10.0);
			t.save(transfer);
			
			List<Transfer> l = t.findAll();
			if(l == null || l.isEmpty()) {
				fail(getClass().getName() + ": ERRO Executing save, EMPTY");		
			}
		} catch(Exception e) {
			fail(getClass().getName() + ": ERRO " + e.getLocalizedMessage());			
		}		
	}

}
