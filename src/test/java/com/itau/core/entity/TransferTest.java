package com.itau.core.entity;

import static org.junit.Assert.*;

import org.junit.Test;

public class TransferTest {

	@Test
	public void testIfCreated() {
		try {
			Transfer t = new Transfer();
			
			if(t.getFromAccountId() != null && t.getFromAccountId().isEmpty()) {
				t = new Transfer("1", "2", "TESTE", 10.0);
				if(t.getFromAccountId() != "1" ||
						t.getToAccountId() != "2" ||
						t.getMessage() != "TESTE" ||
						t.getAmount() != 10.0) {
					fail(getClass().getName() + ": ERRO Objeto Vazio");
				}
			} else {
				fail(getClass().getName() + ": ERRO Objeto Vazio");
			}
		} catch(Exception e) {
			fail(getClass().getName() + ": ERRO " + e.getLocalizedMessage());			
		}
	}

	@Test
	public void testIfFilled() {
		try {
			Transfer t = new Transfer();
			
			if(t.getFromAccountId() != null && t.getFromAccountId().isEmpty()) {
				t.setFromAccountId("1");
				t.setToAccountId("2");
				t.setMessage("TESTE");
				t.setAmount(10.0);
	
				if(t.getFromAccountId() != "1" ||
						t.getToAccountId() != "2" ||
						t.getMessage() != "TESTE" ||
						t.getAmount() != 10.0) {
					fail(getClass().getName() + ": ERRO Dados divergentes" );
				}
			}
		} catch(Exception e) {
			fail(getClass().getName() + ": ERRO " + e.getLocalizedMessage());			
		}
	}

}
