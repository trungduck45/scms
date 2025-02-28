package com.scms.scms_be.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.scms.scms_be.repository.AccountRepository;

@Service
public class UserDetailService implements UserDetailsService {

    @Autowired
    private AccountRepository usersRepo;

    @Override
    
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return usersRepo.findByEmail(username).orElseThrow();
    }

}
