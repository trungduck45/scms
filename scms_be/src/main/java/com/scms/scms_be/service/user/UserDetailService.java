package com.scms.scms_be.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.scms.scms_be.repository.UsersRepository;

@Service
public class UserDetailService implements UserDetailsService {

    @Autowired
    private UsersRepository usersRepo;

    @Override
    
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return usersRepo.findByEmail(username).orElseThrow();
    }

}
