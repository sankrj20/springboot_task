package com.example.crud2.Services.impl;
import com.example.crud2.Exceptions.CustomException;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.crud2.Entity.MyEntity;
import com.example.crud2.Repo.MyRepo;
import com.example.crud2.Services.MyServices;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceImpl implements MyServices {

    private final MyRepo myRepo;

    @Autowired
    public ServiceImpl(MyRepo myRepo) {
        this.myRepo = myRepo;
    }

    @Override
    public List<MyEntity> findAllUsers() {
        return myRepo.findAll();
    }

    @Override
    public Optional<MyEntity> findById(Long id) {
        return myRepo.findById(id);
    }

    @Override
    public MyEntity saveUser(MyEntity myEntity) {
        return myRepo.save(myEntity);
    }

    @Override
    public MyEntity updateUser(MyEntity myEntity) {
        return myRepo.save(myEntity);
    }

    @Override
    public void deleteUser(Long id) {
        myRepo.deleteById(id);
    }

    @Override
    public List<MyEntity> findUsersByLastname(String lastname) {
        return myRepo.findByLastname(lastname);
    }

    public void performSomeOperation() {

        if (true) { // Replace with your actual condition
            throw new CustomException("This is an example.");
        }


    }
}
