package com.example.crud2.Services;

import com.example.crud2.Entity.MyEntity;

import java.util.List;
import java.util.Optional;

public interface MyServices {
    List<MyEntity> findAllUsers();
    Optional<MyEntity> findById(Long id);
    MyEntity saveUser(MyEntity myEntity);
    MyEntity updateUser(MyEntity myEntity);
    void deleteUser(Long id);


    List<MyEntity> findUsersByLastname(String lastname);

    void performSomeOperation();
}
