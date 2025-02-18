package com.scms.scms_be.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scms.scms_be.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>{

    Optional<Users> findByEmail(String email);
    Optional<Users> findByEmailAndOtp(String email, String otp);
}
