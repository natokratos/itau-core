package com.itau.core.service.server;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.itau.core.entity.Transfer;
import com.itau.core.main.BankCoreMain;
import com.itau.core.repository.TransferRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BankCoreMain.class)
public class TransfersImplTest {
	@Autowired
	private TransferRepository t;
	
	@Autowired
	private TransfersImpl transfersImpl;
	
	@Test
	public void testPostCreate() {
		try {
			
			transfersImpl.postCreate(new Transfer("1", "2", "TESTE", 10.0));

			List<Transfer> transfers = t.findAll();
			
			if (transfers == null || transfers.isEmpty()) {
				fail(getClass().getName() + ": ERRO List not found");
			}
		} catch(Exception e) {
			fail(getClass().getName() + ": ERRO " + e.getLocalizedMessage());
		}
	}

}
