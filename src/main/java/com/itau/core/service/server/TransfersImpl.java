package com.itau.core.service.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.itau.core.entity.Transfer;
import com.itau.core.repository.TransferRepository;

@Component(value = "transfersImpl")
@WebService
public class TransfersImpl {

	@Autowired(required=false)
	TransferRepository transferRepositoryImpl;
	
	@WebMethod
	public void postCreate(@WebParam(name = "transfer") Transfer transfer) {
		transferRepositoryImpl.save(transfer);
	}

}
