package com.scms.scms_be.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scms.scms_be.entity.Account;

@Repository
public interface UsersRepository extends JpaRepository<Account, Integer>{

    Optional<Account> findByEmail(String email);
    Optional<Account> findByEmailAndOtp(String email, String otp);
}
