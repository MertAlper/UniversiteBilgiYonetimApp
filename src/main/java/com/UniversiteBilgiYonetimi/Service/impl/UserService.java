
package com.UniversiteBilgiYonetimi.Service.impl;
import com.UniversiteBilgiYonetimi.Model.User;
import com.UniversiteBilgiYonetimi.Model.dto.UserDto;


import java.util.List;

public interface UserService {

    User save(UserDto user);
    List<User> findAll();
    void delete(long id);
    User findOne(String username);

    User findById(Long id);
}
