package com.UniversiteBilgiYonetimi.Repository;


import com.UniversiteBilgiYonetimi.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
