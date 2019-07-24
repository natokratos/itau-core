package com.itau.core.main;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BankCoreMain.class)
public class BankCoreMainTest {

	@Test
	public void contextLoads() {
	}
	 
	@Test
	public void start() {
		BankCoreMain.main(new String[] {});
	}

	@Test
	public void testServletRegistrationBean() {
		BankCoreMain b = new BankCoreMain();
		
		if(b.wsServlet() == null) {
			fail(getClass().getName() + ": ERRO Creating ServletRegistrationBeana");		
		}
	}

}
