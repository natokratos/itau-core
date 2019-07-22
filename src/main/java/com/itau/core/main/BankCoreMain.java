package com.itau.core.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

import com.sun.xml.ws.transport.http.servlet.WSSpringServlet;

@SpringBootApplication(scanBasePackages = {"com.itau.core.main", "com.itau.core.entity", 
		"com.itau.core.repository", "com.itau.core.service.server"})
@ImportResource(locations = "jax-ws-config.xml")
public class BankCoreMain {
	
	public static void main(String[] args) {
		SpringApplication.run(BankCoreMain.class, args);
	}

    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        return new ServletRegistrationBean(new WSSpringServlet(), "/accounts");
    }
}