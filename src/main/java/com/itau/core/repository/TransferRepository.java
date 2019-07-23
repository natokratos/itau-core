package com.itau.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itau.core.entity.Transfer;

public interface TransferRepository extends JpaRepository<Transfer, Long> {
}
