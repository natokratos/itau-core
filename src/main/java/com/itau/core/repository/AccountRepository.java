package com.itau.core.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itau.core.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByAccountIdAndOwnerCustomerId(String accountId, String ownerCustomerId);
    
    List<Account> findByOwnerCustomerId(String ownerCustomerId);
    
}
