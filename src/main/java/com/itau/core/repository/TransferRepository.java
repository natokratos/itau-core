package com.itau.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itau.core.entity.Transfer;

public interface TransferRepository extends JpaRepository<Transfer, Long> {
}
