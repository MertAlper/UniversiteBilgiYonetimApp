package com.UniversiteBilgiYonetimi.JWT;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;

import com.UniversiteBilgiYonetimi.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;




    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {


        com.UniversiteBilgiYonetimi.Model.User user =userRepository.findByEmail(email);
        System.out.println("---------------------------");
        System.out.println(user.getPassword());
        System.out.println(user.getEmail());
        if ( user!=null ) {
            return new User(email,user.getPassword(), new ArrayList<>());
        }

        throw new UsernameNotFoundException(email);
    }
}
